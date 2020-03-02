package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.Model.Authority;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repository.UserRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User addUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUser(int userID) {
        return repo.findById(userID).get();
    }

    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public User updateUser(User user, int userID) {
        user.setUserID(userID);
        return repo.save(user);
    }

    @Override
    public void deleteUser(int userID) {
        repo.deleteById(userID);
    }

    @Override
    public void deleteAllUsers() {
        repo.deleteAll();
    }
}
