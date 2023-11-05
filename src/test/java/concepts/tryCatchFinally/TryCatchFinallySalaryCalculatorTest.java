package concepts.tryCatchFinally;

import lombok.AllArgsConstructor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

// Custom Checked Exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class TryCatchFinallySalaryCalculatorTest {

    private float calculateSalaryPerPerson(int totalSalary, int numEmployees) throws InvalidSalaryException {
        int salaryPerPerson = 0; // Initialize indicating not calculated yet

        try {
            // Rule 1: Check if the total salary is within the limit
            if (totalSalary > 10000) {
                throw new IllegalArgumentException("Total salary cannot be more than 10000");
            }
            // Rule 2: Check if the total salary is more than 0
            if (totalSalary <= 0) {
                throw new IllegalArgumentException("Total salary cannot be less than or equal to 0");
            }

            // Rule 3: Check if the number of employees exceeds the limit
            if (numEmployees > 10) {
                throw new IllegalArgumentException("Number of employees cannot exceed 10");
            }

            // Rule 4: Custom Checked exception for negative salary
            if (totalSalary < 0) {
                throw new InvalidSalaryException("Salary cannot be negative");
            }

        } catch (IllegalArgumentException | InvalidSalaryException e) {
            // Handling multiple types of exceptions
            System.out.println("Caught Exception: " + e.getMessage());
            return -1; // return -1 to indicate error
        } finally {
            try {
                salaryPerPerson = totalSalary / numEmployees;
            } catch (ArithmeticException e) {
                // Handling unchecked exception for division by zero
                System.out.println("Caught ArithmeticException in finally block: " + e.getMessage());
            }

            System.out.println("Finally block executed: Completed salary calculation attempt" +
                    " for totalSalary=" + totalSalary + ", numEmployees=" + numEmployees +
                    ", salaryPerPerson=" + salaryPerPerson);
        }

        return salaryPerPerson;
    }

    @EnumSource(Cases.class)
    @ParameterizedTest
    void testSalaryCalculator(Cases testCase) throws InvalidSalaryException {
        float salaryPerPerson = calculateSalaryPerPerson(testCase.totalSalary, testCase.numEmployees);
        System.out.println("Salary per person: " + salaryPerPerson);
    }

    @AllArgsConstructor
    enum Cases {
        CASE1(6000, 2, "Total salary cannot be more than 1000"),
        CASE2(0, 5, "Total salary cannot be less than or equal to 0"),
        CASE3(4000, 12, "Number of employees cannot exceed 10"),
        CASE4(6000, 0, "Number of employees cannot be less than or equal to 0"),
        CASE5(6000, 4, null),
        CASE6(-1, 4, "Salary cannot be negative");

        private final int totalSalary;
        private final int numEmployees;
        private final String expectedExceptionMessage;

        @Override
        public String toString() {
            return expectedExceptionMessage;
        }
    }
}
