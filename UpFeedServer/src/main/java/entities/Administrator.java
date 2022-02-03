package entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(
                name = "getAllAdministrators",
                query = "SELECT admin FROM Administrator admin ORDER BY admin.name"
        )
})

@Entity
public class Administrator extends Person implements Serializable {

    public Administrator() {
        super();
    }
    public Administrator(Long id, String name, String email, String password) {
        super(id,name,email,password);
    }
}
