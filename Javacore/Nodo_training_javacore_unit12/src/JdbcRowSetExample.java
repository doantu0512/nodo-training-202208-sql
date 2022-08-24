import oracle.jdbc.rowset.OracleJDBCRowSet;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcRowSetExample {
    public static void main(String[] args) {
        JdbcRowSet rowSet = null;
        try {
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:oracle:thin:@27.118.22.14:1521:orcl");
            rowSet.setUsername("SCOTT");
            rowSet.setPassword("SCOTT");
            rowSet.setCommand("select * from Student_KANZY");
            rowSet.execute();
            while (rowSet.next()) {
                System.out.println("Id: " + rowSet.getString(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Age: " + rowSet.getString(3));
            }
            rowSet.first();
            rowSet.updateString(5,"Hoang Van X");
            rowSet.commit();

            rowSet.first();
            System.out.println(rowSet.getInt(1)+"\t"+rowSet.getInt(2));
            rowSet.absolute(5);
            System.out.println(rowSet.getInt(2)+" "+rowSet.getInt(3));
            rowSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
