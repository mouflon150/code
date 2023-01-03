package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[]{1, 2, 3, 4};
//        Arrays.stream(arr).forEach((x)->System.out.println(x*x));

//        int[] ints = new int[] {10, 100, 1000};
//        Arrays.stream(ints).mapToDouble((x) -> x * 0.1).forEach(System.out::println);

        List<Student> students = new ArrayList<>();

        students.add(new Student(4, "Temirbaev Marlen"));
        students.add(new Student(2, "Bakyt Apsamatov"));
        students.add(new Student(3, "Dastan Abdullaev"));
        students.add(new Student(5, "Kurmanbek Pazylov"));

        students.stream()
                .map(Student::getFullName)
                .forEach(System.out::println);

        students.stream()
                .map(Student::getFullName)
                .map((x) -> x + x)
                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getMark() >= 4)
                .forEach(System.out::println);

        System.out.println(students.stream()
                .filter(student -> student.getMark() == 2).count());


    }
}
