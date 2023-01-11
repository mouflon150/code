package streams;

import lombok.Data;

@Data
public class Student {

    private int mark;
    private String fullName;

    public Student(int mark, String fullName) {
        this.mark = mark;
        this.fullName = fullName;
    }
}
