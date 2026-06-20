/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorcontactos;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author SYSADMIN
 */
public class GestorContactos {

    public static void main(String[] args) {
        try {
            ArrayList<Contacto> Contactos = new ArrayList<>();
            System.out.println("Contactos");
            Scanner scanner = new Scanner(System.in);
            
            
            String url = "jdbc:mysql://localhost:3306/gestorcontactos";
            String user = "root";
            String password = "tu_contraseña_aqui";
            
           Connection conexion = DriverManager.getConnection(url, user, password);
           Statement Statement = conexion.createStatement();
           
           
           while (true){
                System.out.println("1. Agregar contacto");
                System.out.println("2. Ver contactos");
                System.out.println("3. Buscar contacto");
                System.out.println("4. Eliminar contacto");
                System.out.println("5. Salir");
                String nombre;
                int numero;
                
                int opcion = scanner.nextInt();
                
                switch (opcion){
                    case 1:
                        
                        System.out.println("Ingrese nombre:");
                        nombre = scanner.next();
                        System.out.println("Ingrese  numero:");
                        numero = scanner.nextInt();
                        
                        Contacto nuevo = new Contacto(nombre, numero);//objeto
                        
                        
                        PreparedStatement ps = conexion.prepareStatement("INSERT INTO contactos (nombre, numero) VALUES (?, ?)");
                       ps.setString(1, nombre);
                       ps.setInt(2, numero);
                       ps.executeUpdate();
                     
                        
                        
                        System.out.println("1. Agregando contacto");
                        
                        break;
                        
                    case 2 :
                        System.out.println("2. Ver contactos");
                      ResultSet rs = Statement.executeQuery("SELECT * FROM  contactos");
                      while(rs.next())
                          System.out.println(rs.getString("nombre") + " " + rs.getInt("numero"));
                          
                          
                        
                            
                        
                        break;
                    case 3 :
                        System.out.println("3. Buscar contacto");
                        String nombreBuscado = scanner.next();
                        PreparedStatement ps2 = conexion.prepareStatement("SELECT * FROM contactos WHERE nombre = ?");
                        ps2.setString(1, nombreBuscado);
                        ps2.executeQuery();
                        ResultSet rs2 = ps2.executeQuery();
                        while(rs2.next())
                            System.out.println(rs2.getString("nombre"));
                                
                                break;
                            
                        
                    case 4 :
                        System.out.println("Ingresa Nombre a eliminar:");
                        String nombreAEliminar = scanner.next();
                        
                        
                        
                        PreparedStatement ps3 = conexion.prepareStatement("DELETE FROM  contactos WHERE nombre = ?");
                        ps3.setString(1, nombreAEliminar);
                        ps3.executeUpdate();
                        
                        
                        break;
                        
                        
                    case 5 :
                        break;
                        
                }}
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
         } } 

  
    
        
                 
                 
         
                         
                
          
                  
               
         
                  
                
          
                 

        
        
    
