package multithreading;

public class Multithreading {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }
    }
}
