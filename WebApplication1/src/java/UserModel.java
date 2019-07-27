
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class UserModel {
    public void insert (User user) throws ClassNotFoundException, SQLException{
        DBConnector db = new.DBConnector();
        db.getConnection();
        Connection conn = db.getConnection();
        String sql ="INSERT INTO account(username,password,fullname,email,address)+"
                + " VALUES(?,?,?,?,?)";
        conn.prepareStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,account.getUsername());
        pstmt.setString(2,account.getPassword());
        pstmt.setString(3,account.getFullname());
        pstmt.setString(4,account.getEmail());
        pstmt.setString(5,account.getAddress());
        
        pstmt.executeUpdate():
    }
}
