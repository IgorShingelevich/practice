package accesNonAccessModifires;

public class staticBlocksConferenceRoom {
    // Declaring a static variable to initialize within a static block
    public static String projector;

    // Static block to initialize static variables
    static {
        projector = "Projector is ready.";
    }

    public static void main(String[] args) {
        // Output shows the initialized static variable
        System.out.println(projector); // Output: Projector is ready.
    }
}
