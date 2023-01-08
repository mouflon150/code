public class SimpleTask {

    public static void main(String[] args) {

        reverse("dog");
    }

    public static void reverse(String str) {
        char[] letters = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
