/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbb2;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnector{
public Connection getConnect() throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/tracnghiem";
            Connection conn = DriverManager.getConnection(connStr, "root", "Huy123hgvnn");
    return null;
}}