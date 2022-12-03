package com.mycompany.punto8;
import java.util.Scanner;

//@author hari0

public class Punto8 {

    public static void main(String[] args) {
        
        int a,b,resSuma;
        resSuma=0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el numero (A): ");
        a=reader.nextInt();
        System.out.println("Ingrese el numero (B): ");
        b=reader.nextInt();
        System.out.println("\n");

        System.out.println("múltiplos de ("+a+") hasta ("+b+") comprendidos entre ellos");

        for (int i = 0; i < b; i++) {
            if (i%a==0) {
                System.out.print(i+", ");
                resSuma = resSuma + i;
            } 
        }
        System.out.println("\n\nLa suma entre todos los multiplos de "+a+"(A) \nEs igual a:   "+resSuma+"\n");
        System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra. \n ");
    }
}
