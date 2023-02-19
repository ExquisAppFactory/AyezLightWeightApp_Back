/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightweightapp.services.dbservice.resources;

import com.lightweightapp.services.dbservice.model.User;
import com.lightweightapp.services.dbservice.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/rest/db")
public class DbServiceResource
{
    private UserRepository userRepository;

    public DbServiceResource(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/{userid}")
    public List<User> getUser(@PathVariable("userid") final int userid)
    {
        return null;
        //return userRepository.findById(userid)
    }

    @PostMapping("/createUser")
    public List<User> createUser (@RequestBody final User user)
    {
        return null;
    }

}
