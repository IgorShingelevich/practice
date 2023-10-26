package oop.abstractClassVSInterface;

// Abstract class declaration (unique to abstract classes)
public abstract class AbstractExample {

    // Implicitly protected constructor (unique to abstract classes, interfaces don't have constructors)
    AbstractExample() {
        // Constructor implementation
    }

    //fields  modifiers my be final, volatile, transient, or any combination of these
    // Implicitly protected field declaration (unique to abstract classes, interfaces don't have fields)
    protected String protectedField = "Protected Field"; // protected field declaration with initialization





    // Public abstract method declaration (no body) (similar to interfaces)
    public abstract void publicAbstractMethod();

    // Protected abstract method declaration (no body) (unique to abstract classes, interfaces methods are implicitly public)
    protected abstract void protectedAbstractMethod();

    // Package-private abstract method declaration (no body) (unique to abstract classes, interfaces methods are implicitly public)
    abstract void packagePrivateAbstractMethod();

    // Public concrete method declaration with implementation (unique to abstract classes)
    public void publicConcreteMethod() {
        // Method implementation
    }

    // Protected concrete method declaration with implementation (unique to abstract classes)
    protected void protectedConcreteMethod() {
        // Method implementation
    }

    // Package-private concrete method declaration with implementation (unique to abstract classes)
    void packagePrivateConcreteMethod() {
        // Method implementation
    }

    // Private concrete method declaration with implementation (unique to abstract classes)
    private void privateConcreteMethod() {
        // Method implementation
    }

    // Public static method declaration with implementation (can be found in both abstract classes and interfaces from Java 8)
    public static void publicStaticMethod() {
        // Method implementation
    }

    // Protected static field declaration (unique to abstract classes)
    protected static String protectedStaticField = "Protected Static Field";

    // Public instance field declaration (unique to abstract classes)
    public String publicInstanceField = "Public Instance Field";

    // Private instance field declaration (unique to abstract classes)
    private String privateInstanceField = "Private Instance Field";
}
