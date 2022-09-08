/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioaprendizaje7;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicioAprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase;
        
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
//se usa el comando equals para comparar si la frase ingresada por el usuario es igual a la frase que queremos comparar
//entre parentesis ira la variable a la que queremos comparar y siemore ira un punto por delante
        if ("eureka".equals(frase)){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
    }
    
}
