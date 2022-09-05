package com.example.nodo_training_springboot_7.impl;

import com.example.nodo_training_springboot_7.Model.Group;
import com.example.nodo_training_springboot_7.dao.GroupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GroupDAOimpl implements GroupDAO {
    @Autowired
    private LocalStatelessSessionProxyFactoryBean sessionProxyFactoryBean;
    @Override
    public void insert(Group group) {

    }

    @Override
    public List<Group> list() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Group group) {

    }

    @Override
    public Group get(Integer id) {
        return null;
    }
}