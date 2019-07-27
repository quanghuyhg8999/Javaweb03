
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.lang.Character.UnicodeBlock.forName;
import static jdk.nashorn.internal.codegen.CompilerConstants.className;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DBConnector {
    public java.sql.Connection getConnection()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:8084/account";
        String user = "root";
        String pass = "Huy123hgvnn";
                return DriverManager.getConnection(connStr, user, pass);
    }
}
