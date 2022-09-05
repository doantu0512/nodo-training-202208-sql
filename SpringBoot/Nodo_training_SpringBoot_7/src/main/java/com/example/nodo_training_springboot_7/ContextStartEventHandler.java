package com.example.nodo_training_springboot_7;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    private final static Logger LOGGER = Logger.getLogger(ContextStartEventHandler.class);
    @Autowired
    private DataSource dataSource;

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {

        try {
            createTable("Student_KANZY2","create table Student_KANZY2\n" +
                    "(\n" +
                    "\tid int auto_increment primary key not null,\n" +
                    "    name varchar(100)\n" +
                    ")\n");
        }catch (Exception e){
            LOGGER.error(e,e);
        }
    }
    private void createTable(String name, String script)throws Exception{
        DatabaseMetaData dbmd = dataSource.getConnection().getMetaData();
        ResultSet rs = dbmd.getTables(null,null,name,null);
        if (rs.next()) {
            LOGGER.info("Table" + rs.getString("TABLE_NAME")+"already exists!");
            return;
        }
        dataSource.getConnection().createStatement().executeUpdate(script);
    }

}
