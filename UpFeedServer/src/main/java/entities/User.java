package entities;

import javax.persistence.Entity;
//TODO Inheritance
@Entity
public class User extends Person{

    public User() {
        super();
    }
    public User(Long id, String name, String email, String password) {
        super(id,name,email,password);
    }
}
