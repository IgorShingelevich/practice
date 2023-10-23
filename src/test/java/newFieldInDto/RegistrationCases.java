package newFieldInDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import newFieldInDto.dto.RegistrationRequestDto;
import newFieldInDto.dto.RegistrationResponseDto;

@Getter
@AllArgsConstructor
public enum RegistrationCases {
    SUCCESS("Registration successful"),
    CONFLICT("User already exists"),
    NO_EMAIL("Email is required"),
    NO_PASSWORD("Password is required"),
    NULL_EMAIL("Email cannot be null"),
    NULL_PASSWORD("Password cannot be null")

    // ... add more cases as needed

    ;

    private final String description;

    public RegistrationRequestDto getModifiedRequestDto() {
        RegistrationRequestDto baseUser = UserFactory.createRandomUser();

        switch (this) {
            case SUCCESS:
            case CONFLICT:
                return baseUser;  // Return the base user as is for the SUCCESS and CONFLICT cases

            case NO_EMAIL:
                return RegistrationRequestDto.builder()
                        .password(baseUser.getPassword())
                        .firstName(baseUser.getFirstName())
                        .lastName(baseUser.getLastName())
                        .build();  // Email omitted

            case NO_PASSWORD:
                return RegistrationRequestDto.builder()
                        .email(baseUser.getEmail())
                        .firstName(baseUser.getFirstName())
                        .lastName(baseUser.getLastName())
                        .build();  // Password omitted

            case NULL_EMAIL:
                return RegistrationRequestDto.builder()
                        .email(null)
                        .password(baseUser.getPassword())
                        .firstName(baseUser.getFirstName())
                        .lastName(baseUser.getLastName())
                        .build();  // Email set to null

            case NULL_PASSWORD:
                return RegistrationRequestDto.builder()
                        .email(baseUser.getEmail())
                        .password(null)
                        .firstName(baseUser.getFirstName())
                        .lastName(baseUser.getLastName())
                        .build();  // Password set to null

            // ... add more cases as needed

            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public RegistrationResponseDto getExpectedResponse() {
        switch (this) {
            case SUCCESS:
                return RegistrationResponseDto.success();
            case CONFLICT:
                return RegistrationResponseDto.conflict();
            case NO_EMAIL:
            case NO_PASSWORD:
            case NULL_EMAIL:
            case NULL_PASSWORD:
                return RegistrationResponseDto.builder()
                        .statusCode(422)
                        .message(this.description)
                        .build();
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    @Override
    public String toString() {
        return description;
    }
}