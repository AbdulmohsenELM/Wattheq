package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.Authority;
import com.ELM.stProject.Wattheq.Model.Organization;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repository.AuthorityRepo;
import com.ELM.stProject.Wattheq.Repository.OrganizationRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    @Autowired
    private OrganizationRepo organizationRepo;
    @Autowired
    private AuthorityRepo authorityRepo;

    @RequestMapping(value = "/HomePage")
    public String homePage() {
        return "HomePage";
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
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userService.addUser(user);
        String username = user.getEmail();
        String authority = "ROLE_INDIVIDUAL";
        Authority auth = new Authority();
        auth.setUsername(username);
        auth.setAuthority(authority);
        authorityRepo.save(auth);
        return "redirect:/HomePage";
    }

    @RequestMapping(value = "/OrganizationsRegistrationChoice")
    public String OrganizationsRegistrationChoice() {
        return "OrganizationsRegistrationChoice";
    }

    @RequestMapping(value = "/OrganizationsRegistrationPage")
    public String OrganizationsRegistrationPage(Model model) {
        model.addAttribute("organization", new Organization());
        return "OrganizationsRegistrationPage";
    }

    @RequestMapping(value = "/AddOrganization", method = RequestMethod.POST)
    public String AddOrganization(@ModelAttribute("organization") Organization organization) {
        organizationRepo.save(organization);
        return "redirect:/HomePage";
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