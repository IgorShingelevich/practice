package newFieldInDto;

import com.github.javafaker.Faker;
import newFieldInDto.dto.RegistrationRequestDto;

public class UserFactory {

    private static final Faker faker = new Faker();

    public static RegistrationRequestDto createRandomUser() {
        return RegistrationRequestDto.builder()
                .email(faker.internet().emailAddress())
                .password(faker.internet().password())
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();
    }

}
