package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Column;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "user_name")
   private String name;

   @Enumerated(EnumType.STRING)
   private RoleEnum role;

    public User(String name, RoleEnum role) {
        this.name = name;
        this.role = role;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
