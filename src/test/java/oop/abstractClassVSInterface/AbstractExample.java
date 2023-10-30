package oop.abstractClassVSInterface;

// Abstract class declaration (unique to abstract classes)
//Note - In interfaces, you declare it as 'public interface InterfaceName'.
public abstract class AbstractExample {

    // (unique to abstract classes, interfaces don't have constructors) Implicitly protected constructor
    //Note - Interfaces do not have constructors because they cannot be instantiated.


    // (unique to abstract classes, interfaces don't have fields) Implicitly protected field declaration
    //(unicque to abstract  class) voluntary modifiers combination protected static final
    // Note - In interfaces, all fields are implicitly public, static, and final.
    public static final String PUBLIC_STATIC_FINAL_FIELD = "Public Static Final Field"; // final it means need to be initialized

    protected String protectedField = "Protected Field"; // Protected field declaration with initialization
    protected String protectedField2; // Protected field declaration without initialization


    // (unique to abstract classes) Protected static field declaration
    //Note - In interfaces, all fields are implicitly public, static, and final.
    protected static String protectedStaticField = "Protected Static Field";

    // (unique to abstract classes) Public instance field declaration
    //Note - In interfaces, fields are not instance variables; they are implicitly public, static, and final.
    public  String publicInstanceField = "Public Instance Field";

    // (unique to abstract classes) Private instance field declaration
    //Note - Interfaces do not have instance fields; all fields are implicitly public, static, and final.
    private String privateInstanceField = "Private Instance Field";

    // (unique to abstract classes)  constructor
     /* AbstractExample() {
        // Constructor implementation
    }*/
    // might be protected
     protected AbstractExample() {
        // Constructor implementation
    }


    //(similar to interfaces) Public abstract method declaration (no body)
    //Note - In interfaces, methods are implicitly public and abstract unless specified otherwise.
    public abstract void publicAbstractMethod();

    //(unique to abstract classes, interfaces methods are implicitly public) Protected abstract method declaration (no body)
    //Note - Interfaces do not support protected or package-private access modifiers for methods.
    protected abstract void protectedAbstractMethod();

    //(unique to abstract classes, interfaces methods are implicitly public) Package-private abstract method declaration (no body)
    //Note - Interfaces do not support protected or package-private access modifiers for methods.
    abstract void packagePrivateAbstractMethod();

    // Public concrete method declaration with implementation (unique to abstract classes)
    //Note - In interfaces, concrete methods need to be default methods (Java 8+) or static methods.
    public void publicConcreteMethod() {
        // Method implementation
    }

    // Protected concrete method declaration with implementation (unique to abstract classes)
    //Note - Interfaces only allow public concrete methods.
    protected void protectedConcreteMethod() {
        // Method implementation
    }

    // Package-private concrete method declaration with implementation (unique to abstract classes)
    //Note - Interfaces only allow public concrete methods.
    void packagePrivateConcreteMethod() {
        // Method implementation
    }

    // Private concrete method declaration with implementation (unique to abstract classes)
    //Note - In interfaces (from Java 9), private methods are allowed but they must be concrete.
    private void privateConcreteMethod() {
        // Method implementation
    }

    // Public static method declaration with implementation (can be found in both abstract classes and interfaces from Java 8)
    //Note - In interfaces, static methods are also allowed but must be public.
    public static void publicStaticConcreteMethod() {
        // Method implementation
    }

    //
    static void staticConcreteMethod() {
        // Method implementation
    }


}
