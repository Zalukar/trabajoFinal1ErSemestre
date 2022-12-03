/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.punto7;

/**
 *
 * @author hari0
 */
public class Punto7 {

    public static void main(String[] args) {
        
            //ESTABLECEMOS VARIABLES
        int numeroMayor, numeroMenor,resto;
        numeroMayor=500;
        numeroMenor=400;

            //BUCLE FOR CREADO A LA INVERSA
        for (int i = numeroMayor; i >= numeroMenor; i--) {

            resto = i % 5;  //DEFINIMOS resto COMO EL PRODUCTO DE LA DIVISION i/5

            switch (resto) {

                case 0  :   //EN CASO DE resto = 0 (ES MULTIPLO)
                    System.out.println("///");

                    break;
                            
                default :   //EN CASO DE resto != 0 (NO ES MULTIPLO)
                    System.out.println(i+", ");
                    
                break;
            }}
            System.out.println("\n Ejercicio hecho por: Victor Manuel Ardila Becerra.");
    }
}
