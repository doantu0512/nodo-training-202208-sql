package com.example.nodo_training_webservice_10.restcontroller;

import com.example.nodo_training_webservice_10.dao.UserDAO;
import com.example.nodo_training_webservice_10.impl.UserDAOimpl;
import com.example.nodo_training_webservice_10.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestServiceController {
    @Autowired
    UserDAO userDAO;

    @RequestMapping("/list/users")
    public List<User> listUser(){
        return userDAO.list();
    }
}
