package com.javatechie.spring.kotlin.controller

import com.javatechie.spring.kotlin.dao.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController
{
    @GetMapping("/getUser")
    fun getUser()=User(123, "Aman", 20.00)

    @GetMapping("/getUsers")
    fun getUsers(): List<User>
    {
        val users = listOf(User(123, "Aman", 20.00), User(77, "jaiswal", 40.00))
        return users;
    }
}