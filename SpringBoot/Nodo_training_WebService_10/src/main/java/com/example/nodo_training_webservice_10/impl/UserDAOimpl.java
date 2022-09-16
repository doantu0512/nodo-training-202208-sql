package com.example.nodo_training_webservice_10.impl;

import com.example.nodo_training_webservice_10.dao.UserDAO;
import com.example.nodo_training_webservice_10.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component("userDAO")
public class UserDAOimpl implements UserDAO {
    private final static Logger LOGGER = Logger.getLogger(UserDAOimpl.class);

    public LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    @Autowired
    @Qualifier("sessionFactory")
    public void setSessionFactory(LocalSessionFactoryBean sessionFactory) {
        this.sessionFactory= sessionFactory;
    }

    @Override
    public List<User> list(){
        EntityManager session = null;
        try {
            Query query = session.createQuery("select u.username from User u ");
            return query.getResultList();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
