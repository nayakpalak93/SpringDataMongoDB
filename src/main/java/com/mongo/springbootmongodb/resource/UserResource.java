package com.mongo.springbootmongodb.resource;

import com.mongo.springbootmongodb.document.User;
import com.mongo.springbootmongodb.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }

}
