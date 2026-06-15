/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorcontactos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SYSADMIN
 */
public class GestorContactos {

    public static void main(String[] args) {
     ArrayList<Contacto> Contactos = new ArrayList<>();
     System.out.println("Contactos");
     Scanner scanner = new Scanner(System.in);
                 
             
                  
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
                
         
            Contactos.add(nuevo);
            
             
            System.out.println("1. Agregando contacto");
              
                break;
             
        case 2 :
                   System.out.println("2. Ver contactos");
                   
                for (Contacto c : Contactos){
                    System.out.println(c.getNombre());
                    
                    System.out.println(c.getNumero());
                    
                }
                    break;
        case 3 : 
            System.out.println("3. Buscar contacto");
            String nombreBuscado = scanner.next();
             for (Contacto c : Contactos){
                    System.out.println(c.getNombre());
                    
                    System.out.println(c.getNumero());
                    
                 if(c.getNombre().equals(nombreBuscado)){
                     System.out.println("Usuario encontrado");
                
            
             break;
              }}
             
        case 4 :     
             System.out.println("Ingresa Nombre a eliminar:");
               String nombreAEliminar = scanner.next();
                  
                    
           Contactos.removeIf(c -> c.getNombre().equals(nombreAEliminar)); 
             
                   
           
             break;
             
             
        case 5 : 
             break;
               
             }}}}
  
    
        
                 
                 
         
                         
                
          
                  
               
         
                  
                
          
                 

        
        
    
