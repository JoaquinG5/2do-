/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio20aprendizaje;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicio20Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int guardar = 0, guardar2 = 0, aux = 0, guardar3 = 0, n = 1;
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
            
        }
        for (int i = 0; i < 3; i++) {
            if (guardar == guardar2 & guardar2 != 0) {
                n++;
            }
            guardar2 = 0;
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    guardar += matriz[i][j];
                } 
                  guardar2 += matriz[i][j];

                

            }
             
        }
        guardar2 = 0;
       
        for (int j = 0; j < 3; j++) {
            if (guardar2 == guardar) {
                
                 if (guardar2 == guardar3) {

                    n++;
                }
            }
            guardar3=0;
            for (int i = 0; i < 3; i++) {
                if (j == 0) {
                    guardar2 += matriz[i][j];

                } 
                   guardar3 += matriz[i][j];

                

            }
            if (guardar2 == guardar) {
                if (j == 0) {
                    n++;
                }
            }
           
        }
        guardar2 = 0;
        guardar3 = 0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    guardar2 += matriz[i][j];

                } 
                if (i + j == 2) {
                    guardar3 += matriz[i][j];
                }

            }

        }
        if (guardar2 == guardar3 & guardar2 == guardar) {
            n = n + 2;

        }
        if (n == 8) {
            System.out.println("Su matriz es magica");

        } else {
            System.out.println(" Su matriz no es magica");
        }

    }
    }
    

