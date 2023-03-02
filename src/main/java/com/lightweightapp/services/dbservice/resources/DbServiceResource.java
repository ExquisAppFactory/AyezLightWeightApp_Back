/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightweightapp.services.dbservice.resources;

import com.lightweightapp.services.dbservice.model.Payment;
import com.lightweightapp.services.dbservice.model.PaymentModel;
import com.lightweightapp.services.dbservice.model.User;
import com.lightweightapp.services.dbservice.model.UserModel;
import com.lightweightapp.services.dbservice.repository.PaymentRepository;
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
    private PaymentRepository paymentRepository;

    public DbServiceResource(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/{userid}")
    public List<User> getUser(@PathVariable("userid") final int userid)
    {
        List<User> user = userRepository.findById(userid);
        return user;
    }

    @PostMapping("/createuser")
    public User createUser(@RequestBody final UserModel user)
    {
        User savedUserInfo = userRepository.save(new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()));
        return savedUserInfo;
    }

    @GetMapping("/getPaymentRecods/{paymentid}")
    public Payment getPaymentRecord(@PathVariable("paymentid") final int paymentId)
    {
        Payment paymentInfo = paymentRepository.findPaymentById(paymentId);
        return paymentInfo;
    }

    @PostMapping("/savepayment")
    public Payment savePaymentRecord(@RequestBody final PaymentModel paymentRecord)
    {
        Payment savedPayementRecord =  paymentRepository.save(new Payment(paymentRecord.getUserId(), paymentRecord.getPaymentAmount(), paymentRecord.getPaymentMethod(), paymentRecord.getStatus()));
        return savedPayementRecord;
    }



}
