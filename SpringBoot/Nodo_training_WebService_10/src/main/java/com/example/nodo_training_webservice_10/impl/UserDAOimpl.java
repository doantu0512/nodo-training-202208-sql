package com.example.nodo_training_webservice_10.impl;

import com.example.nodo_training_webservice_10.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component("userDAO")
public class UserDAOimpl implements UserDAO {
    private final static Logger LOGGER = null;
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    @Qualifier("sessionFactory")
    public <sessionFactory> void setSessionFactory(sessionFactory) {
        this.sessionFactory= sessionFactory;
    }
}
