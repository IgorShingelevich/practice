package oop.abstractClassVSInterface;

// Public interface declaration (unique to interfaces)
//Note - In the abstract class, you declare it as 'public abstract class ClassName'.
public interface InterfaceExample {

    // (unique to interfaces) Implicitly public, static, and final field declaration
    //Note - In the abstract class, fields can be public, protected, or private and are not implicitly static or final.
    // immutable
    // Implicitly final -   it means need to be initialized
    //Fields access modifiers: cannot be private, protected, or package-private

    //
    public static final String PUBLIC_STATIC_FINAL_FIELD = "Public Static Final Field";
    int PUBLIC_STATIC_FINAL_FIELD_2 = 1;

    // (similar to abstract classes) Implicitly public and abstract method declaration (no body)

    //Note - In the abstract class, method declarations can be public, protected, or private and can either be abstract or concrete (with implementation).
    //  Abstract methods in an interface are implicitly public and abstract.
    //  Abstract methods access modifiers: cannot be private, protected, or package-private
    public abstract void publicAbstractMethod();

    // (unique to interfaces) (Java 8 and later) concrete method declaration with implementation
    // Default Methods access modifiers: implicitly public
    //  Default Methods access modifiers: cannot  be private, protected, or package-private
    //Note - In the abstract class, you can provide method implementations without the 'default' keyword.
    public default void publicDefaultMethod() { //  without the 'default' keyword will not compile
        // Method implementation
    }

    // (Java 8 and later) (can be found in both abstract classes and interfaces) Public static method declaration with implementation
    //Note - In the abstract class, you can also define public static methods with implementation.
    public static void publicStaticMethod() {
        // Method implementation
    }

    // Private method declaration with implementation (Java 9 and later) (interfaces can have private methods from Java 9, abstract classes always could)
    //Note - In the abstract class, you could always define private methods with implementation.
    private void privateMethod() {
        // Method implementation
    }
}
