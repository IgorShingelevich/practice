package accesNonAccessModifires;

public class staticVariablesClassroom {
    // Declaring a static variable to demonstrate that it's shared among all instances of the class.
    public static String whiteBoard = "This is a whiteboard that everyone uses.";

    // A non-static variable to show that each instance has its own copy.
    public String studentName;

    // Constructor to initialize non-static variable
    public staticVariablesClassroom(String name) {
        this.studentName = name;
    }

    // Method to read the whiteboard content
    public void readWhiteBoard() {
        System.out.println(studentName + " reads: " + whiteBoard); // Output reflects the shared static variable 'whiteBoard'
    }

    public static void main(String[] args) {
        // Creating instances to demonstrate the effect of static vs non-static variables
        staticVariablesClassroom student1 = new staticVariablesClassroom("Alice");
        staticVariablesClassroom student2 = new staticVariablesClassroom("Bob");

        // Both students read the same whiteboard content initially
        student1.readWhiteBoard(); // Output: Alice reads: This is a whiteboard that everyone uses.
        student2.readWhiteBoard(); // Output: Bob reads: This is a whiteboard that everyone uses.

        // Modifying the static variable to show its effect on all instances
        staticVariablesClassroom.whiteBoard = "Updated whiteboard content.";

        // Both students now read the updated whiteboard content
        student1.readWhiteBoard(); // Output: Alice reads: Updated whiteboard content.
        student2.readWhiteBoard(); // Output: Bob reads: Updated whiteboard content.
    }
}
