package com.example.jpaHibernate.controller;

import com.example.jpaHibernate.dao.Address;
import com.example.jpaHibernate.dao.User;
import com.example.jpaHibernate.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpaHibernate.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok().body(userService.getAllUser());
    }
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userService.createUser(user));
    }
    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAllAddress(){
        return ResponseEntity.ok().body(addressService.getAllAddress());
    }
    @PostMapping("/address")
    public ResponseEntity<Address> createUser(@RequestBody Address address){
        return ResponseEntity.ok().body(this.addressService.createAddress(address));
    }
}
