public class Dog implements Voiceable {
    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void voice() {
        System.out.println("Gaw Gaw");
    }

    @Override
    public String toString() {
        return "Dog: " + nickname;
    }
}
