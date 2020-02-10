package com.ELM.stProject.Wattheq.Service;


import com.ELM.stProject.Wattheq.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUser(int natID) {
        return repo.findById(natID).get();
    }

    @Override
    public User updateUser(User user, int natID) {
        user.setNationalID(natID);
        return repo.save(user);
    }

    @Override
    public void deleteUser(int natID) {
        repo.deleteById(natID);
    }

    @Override
    public void deleteAllUsers() {
        repo.deleteAll();
    }
}
