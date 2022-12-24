package arr_list;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) throws MyException {
        if (name == null) {
            throw new NullPointerException();
        } else {
            this.name = name;
        }

        if (age <= 0) {
            throw new MyException("Wrong age!");
        } else {
            this.age = age;
        }
    }
}
