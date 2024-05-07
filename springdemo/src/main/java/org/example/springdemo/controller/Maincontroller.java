package org.example.springdemo.controller;

import org.example.springdemo.connection.Repository;
import org.example.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Maincontroller {

    @Autowired
    private Repository repository;

    @GetMapping("/")
    public String start(){
      return "signup.html";
    }

    @RequestMapping("/success")
    public String storeData(@ModelAttribute User user,Model model){
        System.out.println(user.toString());
        User u=repository.save(user);
        model.addAttribute("firstName",user.getName());
        return "success.html";
    }
    @RequestMapping("/getvalue")
    public String getValue(Model m){
       List<User> u =(List<User>) repository.findAll();
       m.addAttribute("all",u);
       for(User user:u){
           System.out.println(user.getName());
       }
       return "hii";
    }
}


























