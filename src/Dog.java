public class Dog implements Barkable{
    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void bark() {
        System.out.println("Gaw Gaw");
    }

    @Override
    public String toString() {
        return "Dog: " + nickname;
    }
}
