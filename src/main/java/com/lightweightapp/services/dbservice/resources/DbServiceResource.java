/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightweightapp.services.dbservice.resources;

import com.lightweightapp.services.dbservice.model.*;
import com.lightweightapp.services.dbservice.repository.PaymentRepository;
import com.lightweightapp.services.dbservice.repository.UserRepository;
import org.springframework.http.HttpStatus;
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
    public UserResponseModel getUser(@PathVariable("userid") final int userid)
    {
        User user = userRepository.findById(userid);
        UserResponseModel userResponseModel =  new UserResponseModel();
        userResponseModel.setRequestStatus(HttpStatus.OK.getReasonPhrase());
        userResponseModel.setResponseMessage("User record fetched successfully!");
        UserResponseModel.Data data = userResponseModel.new Data();
        data.setFirstName(user.getFirstName());
        data.setLastName(user.getLastName());
        data.setUserId(user.getId());
        data.setEmail(user.getEmail());
        userResponseModel.setData(data);
        return userResponseModel;
    }

    @PostMapping("/createuser")
    public UserResponseModel createUser(@RequestBody final UserModel user)
    {
        User savedUserInfo = userRepository.save(new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()));
        UserResponseModel userResponseModel = new UserResponseModel();
        userResponseModel.setResponseMessage("User created successfully");
        userResponseModel.setRequestStatus(HttpStatus.CREATED.getReasonPhrase());
        UserResponseModel.Data data = userResponseModel.new Data();
        data.setUserId(savedUserInfo.getId());
        data.setFirstName(savedUserInfo.getFirstName());
        data.setLastName(savedUserInfo.getLastName());
        data.setEmail(savedUserInfo.getEmail());
        userResponseModel.setData(data);
        return userResponseModel;
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
