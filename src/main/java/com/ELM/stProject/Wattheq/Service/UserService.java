package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.User;
import java.util.List;

public interface UserService {

    public User addUser(User user);
    public List<User> getAllUsers();
    public User getUser(int userID);
    public User findByEmail(String email);
    public User updateUser(User user, int userID);
    public void deleteUser(int userID);
    public void deleteAllUsers();
}