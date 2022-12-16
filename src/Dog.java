public class Dog extends Animal implements Voiceable {

    protected Dog(String nickname) {
        super(nickname);
    }

    @Override
    public void voice() {
        System.out.println("Gaw * Gaw");
    }

    @Override
    public String toString() {
        return "\nDog:\n" + super.toString();
    }
}
