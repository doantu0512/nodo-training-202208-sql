import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.*;

public class WebRowSetExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:SCOTT/SCOTT@27.118.22.14:1521:orcl");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select  * from Student_KANZY");
            File file =new File("output.xml");
            Writer writer= new FileWriter(file);
            WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();
            webRowSet.writeXml(rs,writer);
            Desktop.getDesktop().open(file);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}