

package com.mycompany.punto1;

//Victor Manuel Ardila

import java.util.Scanner;


public class Punto1 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        //ENTRADA NUMERO
    System.out.println("ingrese un numero entre: 1 - 9999");
    String numerostr = reader.nextLine();

        //CUENTA DE CIFRAS DEFINIDA A 0
    int cuentanumero = 0;

        //CAMBIAMOS EL NUMERO DE TIPO STR A INT
    int numeroint = Integer.parseInt(numerostr);
        //VALIDAMOS NUMERO INGRESADO, ENTRE 1 & 9999
    if (numeroint >= 1 & numeroint <= 9000) {
        //LEEMOS EL NUMERO DE CIFRAS Y SUMAMOS 1 A VARIABLE QUE LAS CUENTA
        for (int i = 0; i < numerostr.length(); i++) {
            cuentanumero++;
    }
        //IMPRIMIMOS LOS RESULTADOS
            System.out.println(" ");
            System.out.println("El numero ingresado es: "+numerostr);
            System.out.println("Y su numero de cifras es: "+cuentanumero);
            System.out.println(" ");
    }
        //SI NO ESTA EN EL RANGO TIRA ESTOS ERRORES
    else if (numeroint > 9999) {
        System.out.println("ERROR: Ingrese un numero entre 1 & 9999");
        System.out.println("Codigo de error: NUMERO DEMASIADO ALTO ");
    }
    else if (numeroint < 1) {
        System.out.println("ERROR: Ingrese un numero entre 1 & 9999");
        System.out.println("Codigo de error: NUMERO DEMASIADO BAJO ");
    }
    reader.close();
    System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra.\n");
        
    }
}
