package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[] {1, 2, 3, 4};
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
                .map((x) -> x + x);
//                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getMark() >= 4);
//                .forEach(System.out::println);

//        System.out.println(students.stream()
//                .filter(student -> student.getMark() == 2).count());

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(9);
        list.add(11);

        List<Integer> integers = list.stream()
                .map(integer -> {
                    if (integer % 3 == 0) {
                        integer = 0;
                    } else {
                        integer *= 10;
                    }
                    return integer;
                }).toList();
//        System.out.println(integers);

//         list.stream()
//                .toList()
//                .forEach(integer -> {
//                    int i = (integer % 3 == 0) ? 0 : (integer * 10);
//                    System.out.println(i);
//                });

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

//        Integer max = list1.stream()
//                .filter(integer -> integer % 2 == 0)
//                .map(integer -> (int) Math.pow(integer, 2))
//                .max(Comparator.naturalOrder()).get();
//        System.out.println(max);

    }
}
