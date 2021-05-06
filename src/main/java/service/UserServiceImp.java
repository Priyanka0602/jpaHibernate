package service;

import dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

//        @Override
//    public User updateUser(User user) {
//        Optional<User> userDB = this.userRepository.findById(user.getId());
//        if(userDB.isPresent()){
//
//        }
//       return userDB.get();
//    }
//
//   }
//
//    @Override
//    public User getUserById(long userId) {
//        return null;
//    }
//
//    @Override
//    public void deleteUser(long userId) {
//
//    }
}
