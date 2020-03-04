package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.DTO.ObjectMapperUtils;
import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repository.UserRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User addUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = repo.findAll();
        List<UserDTO> userDTOS = ObjectMapperUtils.mapAll(users, UserDTO.class);
        return userDTOS;
    }

    @Override
    public UserDTO getUser(int userID) {
        User user = repo.findById(userID).get();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
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
