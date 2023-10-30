package accesNonAccessModifires;

import java.util.Arrays;

public class staticMethodsWorkshop {
    // Declaring a static method to demonstrate that it can be called without an instance of the class.
    public static void sortTools(String[] tools) {
        Arrays.sort(tools);
    }

    public static void main(String[] args) {
        // Creating an array to pass to the static method
        String[] tools = {"Wrench", "Hammer", "Screwdriver"};

        // Calling the static method to sort the array
        sortTools(tools);

        // Output shows sorted array
        System.out.println(Arrays.toString(tools)); // Output: [Hammer, Screwdriver, Wrench]
    }
}
