/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightweightapp.services.dbservice.repository;

import com.lightweightapp.services.dbservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
    List<User> findById(int userId);
}
