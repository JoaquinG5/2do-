/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1aprendizaje;

import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class JavaEjercicio1Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("introduza un numero");
        num1=leer.nextInt();
        System.out.println("introduza otro numero");
        num2=leer.nextInt();
        
        
        int suma=num1+num2;
        
        System.out.print("la suma de los dos numeros ingresados es " + suma);
    }
    
}
