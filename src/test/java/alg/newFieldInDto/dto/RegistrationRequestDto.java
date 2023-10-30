package alg.newFieldInDto.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistrationRequestDto {

    String email;
    String password;
    String firstName;
    String lastName;

    public static RegistrationRequestDto valid() {
        return RegistrationRequestDto.builder()
                .email("newemai@domain.com")
                .password("password")
                .firstName("John")
                .lastName("Doe")
                .build();
    }


}
