package com.cafu.blog.service;

import com.cafu.blog.model.User;
import com.cafu.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User createUser(User user){
        if (userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("Email already exist!");
        }

        return userRepository.save(user);
    }

    public Optional<User> findUserId(Long id){return userRepository.findById(id);}

    public List<User> findAllUser(){return userRepository.findAll();}

    public void deleteUser(Long id){userRepository.deleteById(id);}
}
