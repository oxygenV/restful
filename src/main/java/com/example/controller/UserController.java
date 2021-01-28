package com.example.controller;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/user",method = {RequestMethod.POST})
    public String save(){
        System.out.println(this.getClass().getName()+"save");
        userDao.save(new User());
        return "success";
    }

    @RequestMapping(value="/user",method ={RequestMethod.PUT})
    public String update(){
        System.out.println(this.getClass().getName()+"update");
        userDao.update(1);
        return "success";
    }

    @RequestMapping(value="/user",method ={RequestMethod.DELETE})
    public String delete (){
        System.out.println(this.getClass().getName()+"delete");
        userDao.delete(1);
        return "success";
    }

    @RequestMapping(value="/user",method ={RequestMethod.GET})
    public String query (){
        System.out.println(this.getClass().getName()+"query");
        userDao.query();
        return "success";
    }

}
