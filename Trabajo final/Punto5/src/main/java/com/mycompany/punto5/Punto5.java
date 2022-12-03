package com.mycompany.punto5;
import java.util.Scanner;

//Author: Victor Manuel Ardila Becerra
public class Punto5 {

    public static void main(String[] args) {
        System.out.println("Inserte el numero para visualizar el patron de numeros triangulares");
            Scanner reader = new Scanner(System.in);
            int num = reader.nextInt();
            System.out.println("números triangulares de: "+num);
            for(int i=1; i<=num; i++){
            System.out.print(""+i*(i+1)/2+" ");
            reader.close();
        }
        System.out.println("\n Ejercicio hecho por: Victor Manuel Ardila Becerra. \n");
    }
}
