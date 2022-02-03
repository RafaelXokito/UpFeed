package entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(
                name = "getAllStudents",
                query = "SELECT stu FROM Student stu ORDER BY stu.name"
        )
})

//TODO Relations and Inheritance
@Entity
public class Student extends User implements Serializable {

    public Student() {
        super();
    }
    public Student(Long id, String name, String email, String password) {
        super(id,name,email,password);
    }

}
