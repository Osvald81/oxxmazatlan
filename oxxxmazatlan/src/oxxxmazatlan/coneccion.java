package oxxxmazatlan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osvaldo Alvarez
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class coneccion {
    Connection con=null;
    
    public Connection conexion(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/base_de_datos","root","");
         System.out.println("Se hiso la coneccion exitosa");
     }catch(Exception e){
         System.out.println(e.getMessage());
     }return con;
        
    }
    Statement createStatement(){
         throw new UnsupportedOperationException("no soportado");
    }
}
    