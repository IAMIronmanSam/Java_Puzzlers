package classier_puzzlers;
import classier_puzzlers.CodeTalk;

public class TypeIt {
    private static class ClickIt extends CodeTalk {
        void printMessage() {
            System.out.println("Hack");
        }
    }

    public static void main(String[] args) {
        ClickIt clickit = new ClickIt();
        clickit.doIt();
    }
}
