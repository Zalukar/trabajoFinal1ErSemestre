package com.mycompany.punto6;
import java.util.Scanner;

//@author Victor Manuel Ardila Becerra

public class Punto6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a,b,c,n;
        System.out.println("Ingrese el numero de digito, de la frecuencia fribonacci que desea conocer");
        n = reader.nextInt();
        a=0;
        b=1;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("\n Ejercicio hecho por: Victor Manuel Ardila Becerra. \n");
    }
}
