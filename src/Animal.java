public abstract class Animal {
    private final String nickname;

    protected Animal(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Nickname: " + nickname + "\n";
    }
}
