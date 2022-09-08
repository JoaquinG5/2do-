/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioaprendizaje3;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicioAprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     
     
     String frase;
     System.out.println("ingrese una frase");
     frase=leer.nextLine();
     //se usa este comando upper case para transcribir en mayusculas lo ingresado por el usuario
     System.out.println("en mayusculas " + frase.toUpperCase());
     //y aca lowercase que se transcrbira lo escrito por el usuario en minuscula
     System.out.println("en minusculas " + frase.toLowerCase());  
        
    }
    
}
