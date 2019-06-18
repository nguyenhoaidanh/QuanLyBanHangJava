/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class database {

    public Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public static void main(String[] args) {
   // new database().exe();
    }

    public String[] exe() { //load danh sach thuc an tu oracle
        database db = new database();
        String ip, service, port, user, pass;
        pass = "danh";
        user = "system";
        port = "1522";
        service = "DB12C";
        ip = "";
        db.connect(ip, service, port, user, pass);
        db.nhap();
        return db.loadTable();
    }
    public void nhap()// in toan bảng
    {
        try {
            conn = getConn();
            Statement stt;
            stt = conn.createStatement();

            String query = "select table_name from user_tables where table_name='DIEM1'";
            ResultSet rs = stt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            query = "select * from DIEM1";
            rs = stt.executeQuery(query);
            ResultSetMetaData me =rs.getMetaData();
            int numcol=me.getColumnCount();
            while (rs.next()) {
               
                for (int i = 1; i <= numcol; i++) {
                     System.out.print(rs.getString(i)+"   |    ");
                }
                
               
                System.out.println("");
            }
            
            rs.close();
            stt.close();
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] loadTable() {
        String []flist = new String[100];int size=0;
        try {
            conn = getConn();
            Statement stt;
            stt = conn.createStatement();

            String query = "select table_name from user_tables where table_name='DANHSACHMONAN'";
            ResultSet rs = stt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            query = "select * from DANHSACHMONAN";
            rs = stt.executeQuery(query);

            while (rs.next()) {
                flist[size]=(rs.getString(1));
                 System.out.println(flist[size]);
                 size++;
                //System.out.println(rs.getString(1));
            }
            rs.close();
            stt.close();
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flist;
    }

    public String connect(String ip, String service, String port, String user, String pass) {
        try {
            conn = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ip + ":" + port + ":" + service, user, pass);

            return "success";
        } catch (Exception e) {
            return e.toString();
        }

    }

}
