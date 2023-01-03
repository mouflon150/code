package arr_list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MyException {

        List<Student> students = new ArrayList<>();
        try {
            students.add(new Student("Marlen", -17));
            students.add(new Student(null, 16));
            System.out.println(students);
        } catch (NullPointerException | MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}


