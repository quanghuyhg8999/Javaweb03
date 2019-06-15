package dbb2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class students {

    public int ID;
    public String name;
    public String email;
    public String pass;

    public students() {

    }

    public students(int ID, String name, String email, String pass) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void dangnhap() {
        System.out.println("Nhap email va mat khau ");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap email: ");
        this.email = sc.nextLine();
        System.out.printf("Nhap mat khau: ");
        this.pass = sc.nextLine();
    }

    public boolean status(String email, String pass) throws Exception {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select * from students "
                + "where students.email = ? and students.pass = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet executeQuery = ps.executeQuery();
        ps.setString(1, email);
        ps.setString(2, pass);
        return executeQuery.next();
    }
}
