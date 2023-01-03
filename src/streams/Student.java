package streams;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {

    private int mark;
    private String fullName;

    public Student(int mark, String fullName) {
        this.mark = mark;
        this.fullName = fullName;
    }
}
