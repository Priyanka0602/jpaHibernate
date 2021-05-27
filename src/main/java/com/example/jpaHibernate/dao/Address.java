package com.example.jpaHibernate.dao;

import javax.persistence.*;

@Entity
@Table(name = "address_book")
public class Address {
    @Id
    @GeneratedValue
    long address_id;

    String city;

    String pincode;

//    public Address(String city, String pincode) {
//        this.city = city;
//        this.pincode = pincode;
//    }
//
//    public Address() {
//
//    }

//     @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
////   @OneToOne(cascade = CascadeType.ALL)
//      private User user;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "address")
//    private Set<User> users;
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//    public Address(String city, String pincode, Set<User> users) {
//        this.city = city;
//        this.pincode = pincode;
//        this.users = users;
//    }

    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long id) {
        this.address_id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
