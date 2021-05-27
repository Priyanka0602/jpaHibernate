package com.example.jpaHibernate.service;

import com.example.jpaHibernate.dao.Address;
import com.example.jpaHibernate.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpaHibernate.repository.UserRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityNotFoundException;
import java.util.List;

//@Transactional
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
  @Transactional(propagation = Propagation.REQUIRES_NEW)
    public User createUser(User user) {
//
//        User user1 = new User();
//        user1.setName(user.getName());
//
//        Address address = new Address();
//        address.setCity(user.getAddress().get(0).getCity());
//        address.setPincode(user.getAddress().get(0).getPincode());
//        address.setUser(user1);
//
//        user1.setAddress(Collections.singletonList(address));
        return this.userRepository.save(user);
    }

    @Override
// @Transactional(readOnly = true, rollbackFor = Exception.class, noRollbackFor = EntityNotFoundException.class)
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }


}
