package more_library_puzzlers;

public class Dog extends Exception {
    public static final Dog INSTANCE = new Dog();
    private Dog() { }

    public String toString() {
        return "Woof";
    }
}
