package com.projectmanger.Services;

import com.projectmanger.Models.LoginUser;
import com.projectmanger.Models.User;
import com.projectmanger.Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User newUser, BindingResult result) {

        Optional<User> optionalUser = userRepository.findByEmail(newUser.getEmail());
        if (optionalUser.isPresent()) {
            result.rejectValue("email", "Matches", "This Email Already Exists");
        }
        String checkUserName = newUser.getUserName();
        if (!checkUserName.matches("[a-zA-Z]+")) {
            result.rejectValue("userName", "Matches", "UserName Should Contain Only Letter");
        }
        if (!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if (result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            userRepository.save(newUser);
            return newUser;

        }
    }

    public User login(LoginUser newLogin, BindingResult result) {
        if (result.hasErrors()) {
            return null;
        }
        Optional<User> optionalUser = userRepository.findByEmail(newLogin.getEmail());
        if (!optionalUser.isPresent()) {
            result.rejectValue("email", "Matches", "This Email or Password is Not Recognized");
            return null;
        }
        User registeredUser = optionalUser.get();
        String hashed = BCrypt.hashpw(newLogin.getPassword(), BCrypt.gensalt());
        if (!BCrypt.checkpw(newLogin.getPassword(), registeredUser.getPassword())) {
            result.rejectValue("password", "Matches", "This Email or Password is Not Recognized");
            return null;
        }
        return registeredUser;
    }
    public User findByID(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }

}
