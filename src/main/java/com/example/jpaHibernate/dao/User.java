package com.example.jpaHibernate.dao;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;

   @Column(name = "name")
   private String name;

   @Embedded
   @AttributeOverrides(value = {
           @AttributeOverride(name = "myNumber", column = @Column(name = "mobile_number")),
   })
   private Phone phone;

   @Enumerated(EnumType.STRING)
   private RoleEnum role;

//   public User(String name, RoleEnum role,Phone phone,List<Address> address ) {
//    this.name = name;
//    this.role = role;
//    this.address = address;
//    this.phone=phone;
//   }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL )
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

//    public User(String name, RoleEnum role,Address address ) {
//        this.name = name;
//        this.role = role;
//        this.address = address;
//    }


//    @JoinColumn(name = "fk_addressId")
//    @JoinTable(
//            name = "user_add",
//            joinColumns = { @JoinColumn( name="user_id")},
//            inverseJoinColumns = { @JoinColumn( name="address_id")}
//    )
//   @OneToOne(mappedBy = "user")
//   @OneToOne(cascade = CascadeType.ALL)
//    private Address address;
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//    public User(String name, RoleEnum role, Set<Address> address) {
//        this.name = name;
//        this.role = role;
//        this.address = address;
//    }



//    @ManyToMany(cascade = CascadeType.ALL)
//        @JoinTable(
//            name = "user_add_manyTOmany",
//            joinColumns = { @JoinColumn( name="user_fk")},
//            inverseJoinColumns = { @JoinColumn( name="address_fk")}
//    )
//    private Set<Address> address;
//
//    public Set<Address> getAddress() {
//        return address;
//    }
//
//    public void setAddress(Set<Address> address) {
//        this.address = address;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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
