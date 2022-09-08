/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio6;

import java.util.Scanner;
 
/**
 *
 * @author LILIANA
 */
public class JavaEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer=new Scanner(System.in);
        
        
      
        
       System.out.println("ingrese un nro ");
       int num1=leer.nextInt();
        System.out.println("ingrese otro nro ");
        int num2=leer.nextInt();
        
        if(num1<=25 || num2>25){
         System.out.println ("el nro es igual o menor a 25");
            
      
        } else {
                System.out.println("el nro es mayor");
        }
    }
        
        
    }
    

