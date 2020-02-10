package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.View.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/AddUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/GetAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/GetUser/{natID}")
    public User getUser(@PathVariable("natID") int natID) {
        return userService.getUser(natID);
    }

    @PutMapping(value = "/UpdateUser/{natID}")
    public User updateUser(@RequestBody User user, @PathVariable("natID") int natID) {
        return userService.updateUser(user, natID);
    }

    @DeleteMapping(value = "/DeleteUser/{natID}")
    public void deleteUser(@PathVariable("natID") int natID) {
        userService.deleteUser(natID);
    }

    @DeleteMapping(value = "/DeleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}
