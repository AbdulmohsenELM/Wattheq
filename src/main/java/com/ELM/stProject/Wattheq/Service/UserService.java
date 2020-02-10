package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.User;

import java.util.List;


public interface UserService {

    public User addUser(User user);
    public List<User> getAllUsers();
    public User getUser(int natID);
    public User updateUser(User user, int natID);
    public void deleteUser(int natID);
    public void deleteAllUsers();
}