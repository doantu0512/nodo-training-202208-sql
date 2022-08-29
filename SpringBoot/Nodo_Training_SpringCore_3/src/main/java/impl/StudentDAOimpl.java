package impl;

import DAO.StudentDAO;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class StudentDAOimpl implements StudentDAO {

    DataSource dataSource;

    JdbcTemplate jdbcTemplate;


    @Override
    public void insert(Student student) {

    }
}
