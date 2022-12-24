import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1, 100);
            nums.add(a);
        }
        System.out.println(nums);
    }
}
