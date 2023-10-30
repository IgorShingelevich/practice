package alg.newFieldInDto;

import alg.newFieldInDto.dto.RegistrationResponseDto;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RegistrationTest {

    private final RegistrationApi registrationApi = new RegistrationApi();

    //parameterized test
    @ParameterizedTest(name = "{0}")
    @EnumSource(RegistrationCases.class)
    public void registrationTest(RegistrationCases testCase) {
        RegistrationResponseDto expectedResponse = testCase.getExpectedResponse();
        RegistrationResponseDto actualResponse = registrationApi.registerUser(testCase.getModifiedRequestDto())
                .statusCode(200)
                .extract().as(RegistrationResponseDto.class);
        //assert equals expectedResponse and actualResponse
        assertThat("Response is not as expected", actualResponse, equalTo(expectedResponse));


    }
}
