/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbb2;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DBB2 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        try {
            Scanner sc = new Scanner(System.in);
            students st = new students();
            st.dangnhap();
            boolean check = st.status(st.getEmail(),st.getPass());
            if (check) {
                System.out.println("Dang nhap thanh cong!!! An nut bat ky de bat dau!");
            } else {
                System.out.println("Dang nhap that bai!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
