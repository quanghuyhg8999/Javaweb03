/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbb1;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DBB1 {

    private static int ten;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
            Connection conn = DriverManager.getConnection(connStr, "root", "Huy123hgvnn");

            if (conn != null) {
                System.out.println("Ket noi thanh cong");
                System.out.println("------------------");
                System.out.println("       MENU      ");
                System.out.println("1 - Hien thi ten,khoa cua doc gia va sap xep theo khoa");
                System.out.println("2 - Tim doc gia muon sach Toan vao ngay 1/1/2018");
                System.out.println("3 - Hien thi ten, so the, ten sach cua doc gia muon sach trong thang 1/2018");
                System.out.println("4 - Danh sach sach khong ai muon");
                System.out.println("5 - Cho biet doc gia ten Anh muon sach bao nhieu lan");
                System.out.println("6 - Danh sach ten,so the cua doc gia chua tra sach");
                int chon = 0;
                chon =sc.nextInt();
                switch(chon){
                    case 1:
                    {
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("Select ten,khoa from docgia order by khoa");
                        while (rs.next()) {
                System.out.println(rs.getString("ten") + "  " + rs.getString("khoa")+ " ");
            }
                        break; 
                    }
                     case 2:
                     {
                          try{
                                Process p = new Process() {
                                    @Override
                                    public OutputStream getOutputStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public InputStream getInputStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public InputStream getErrorStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public int waitFor() throws InterruptedException {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public int exitValue() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public void destroy() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }
                                };
                                System.out.println("Nhập tên sách: ");
                                String name = sc.nextLine();
                                sc.nextLine();
                                System.out.print("Nhập ngày mượn: ");
                                String date = sc.nextLine();
                                ResultSet rs = p.ex2(name, date);
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }
                            catch(SQLException e){
                            }    
                     }
                        break;
                    case 3:
                                                
                        break;
                    case 4:
                    {
                        try{
                                Process p = new Process() {
                                    @Override
                                    public OutputStream getOutputStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public InputStream getInputStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public InputStream getErrorStream() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public int waitFor() throws InterruptedException {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public int exitValue() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }

                                    @Override
                                    public void destroy() {
                                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                    }
                                };
                                System.out.println("Danh sách các sách KHÔNG AI MƯỢN: ");
                                ResultSet rs = p.ex4();
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }catch(SQLException e){
                            }
                    }
                        break;
                    case 5:
                                               
                        break;
                    case 6:
                                               
                        break;
                }
                 } else {
                System.out.println("Ket noi that bai");
            }
        } catch (ClassNotFoundException ex) {
        }
    }
    }