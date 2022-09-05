package com.example.nodo_training_springboot_7.dao;

import com.example.nodo_training_springboot_7.Model.Group;

import java.util.List;

public interface GroupDAO {
    public void insert(Group group);

    public List<Group> list();

    public void delete(int id);

    public void update(Group group);

    public Group get(Integer id);
}
