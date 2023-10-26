package oop.abstractClassVSInterface;

// Public interface declaration (unique to interfaces)
public interface InterfaceExample {

    // Implicitly public, static, and final field declaration (unique to interfaces)
    String PUBLIC_STATIC_FINAL_FIELD = "Public Static Final Field";
    int PUBLIC_STATIC_FINAL_FIELD_2 = 1;

    // Implicitly public and abstract method declaration (no body) (similar to abstract classes)
    void publicAbstractMethod();

    // Public default method declaration with implementation (Java 8 and later) (unique to interfaces)
    public default void publicDefaultMethod() {
        // Method implementation
    }

    // Public static method declaration with implementation (Java 8 and later) (can be found in both abstract classes and interfaces)
    public static void publicStaticMethod() {
        // Method implementation
    }

    // Private method declaration with implementation (Java 9 and later) (interfaces can have private methods from Java 9, abstract classes always could)
    private void privateMethod() {
        // Method implementation
    }
}
