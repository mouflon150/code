public class Cat extends Animal implements Voiceable {

    protected Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void voice() {
        System.out.println("Meow * Meow");
    }

    @Override
    public String toString() {
        return "\nCat:\n" + super.toString();
    }
}
