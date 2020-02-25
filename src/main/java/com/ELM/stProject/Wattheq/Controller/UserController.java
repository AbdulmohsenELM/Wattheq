package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/homePage")
    public String homePage() {
        return "homePage";
    }

    @RequestMapping(value = "/RegistrationPage")
    public String RegistrationPage() {
        return "RegistrationPage";
    }

    @RequestMapping(value = "/IndividualsRegistrationPage")
    public String IndividualsRegistrationPage(Model model) {
        model.addAttribute("user", new User());
        return "IndividualsRegistrationPage";
    }

    @RequestMapping(value = "/AddUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/homePage";
    }

    @RequestMapping(value = "/LoginPage")
    public String LoginPage(Model model) {
        model.addAttribute("user", new User());
        return "LoginPage";
    }

    /*@RequestMapping(value = "LoginHandler", method = RequestMethod.POST)
    public String LoginHandler(@ModelAttribute("user") User user) {

    }*/

    @GetMapping(value = "/GetAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/GetUser/{userID}")
    public User getUser(@PathVariable("userID") int userID) {
        return userService.getUser(userID);
    }

    @PutMapping(value = "/UpdateUser/{userID}")
    public User updateUser(@RequestBody User user, @PathVariable("userID") int userID) {
        return userService.updateUser(user, userID);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

    @DeleteMapping(value = "/DeleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}