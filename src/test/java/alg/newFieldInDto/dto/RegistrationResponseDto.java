package alg.newFieldInDto.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistrationResponseDto {
    Integer statusCode;
    String message;

    public static RegistrationResponseDto success() {
        return RegistrationResponseDto.builder()
                .statusCode(200)
                .message("Registration successful")
                .build();
    }

    public static RegistrationResponseDto conflict() {
        return RegistrationResponseDto.builder()
                .statusCode(409)
                .message("User already exists")
                .build();
    }


}
