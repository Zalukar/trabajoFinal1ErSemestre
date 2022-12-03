/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.punto3;

import java.util.Scanner;

/**
 *
 * @author hari0
 */
public class Punto2 {

    public static void main(String[] args) {
         //ENTRADA DE DATOS, NUMERO DE PERSONAS
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese el numero de personas");
        int numerodepersonas = reader.nextInt(); //Transformacion a enteros
        System.out.println("El numero de personas es: "+numerodepersonas);
        reader.nextLine();

            //NOMBRES
        String[] names = new String[numerodepersonas];
        for (int i = 0; i<names.length; i++)
        {
            System.out.println("Ingrese los nombres : ");
            names[i] = reader.nextLine();
        }
            //IMPRIMIMOS LA LISTA DE PERSONAS
        System.out.println("la lista de personas es: ");
        for (int i = 0; i<numerodepersonas; i++)
        {
            System.out.println(names[i]);
            System.out.println(" ");
        }
            //PESO
        Double[] peso = new Double[numerodepersonas];
        for (int i = 0; i<peso.length; i++)
        {
            System.out.println("Ingrese el peso de: "+names[i]);
            peso[i] = reader.nextDouble();
        }
            //ESTATURA
        Double[] estatura = new Double[numerodepersonas];
        for (int i = 0; i<estatura.length; i++)
        {
            System.out.println("Ingrese la estatura de: "+names[i]+" "+"Con peso de: "+peso[i]);
            estatura[i] = reader.nextDouble();
        }
            //CALCULAMOS IMC
        Double[] IMC = new Double[numerodepersonas];
        for (int i = 0; i<numerodepersonas; i++)
        {
            IMC[i] = peso[i]/(estatura[i]*estatura[i]); //FORMULA PARA CALUCLAR IMC
            System.out.println(" ");
        }
            //DAMOS LA RESPUESTA DE EN QUE RANGO DE PESO SE ENCUENTRA
        for (int i = 0; i<numerodepersonas; i++)
        {
            System.out.println("El imc de "+names[i]+"\n es: "+IMC[i]);
            if (IMC[i]<16.00) {
                System.out.println("Infrapeso");
            } else if (IMC[i]<=16.00 || IMC[i]<=16.99)  {
                System.out.println("Delgadez severa");
            }
            else if (IMC[i]<=17.00 || IMC[i]<=18.49)  {
                System.out.println("Delgadez moderada");
            }
            else if (IMC[i]<=18.50 || IMC[i]<=24.99)  {
                System.out.println("Delgadez aceptable");                   //RESPUESTAS
            }
            else if (IMC[i]<=25.00 || IMC[i]<=29.99)  {
                System.out.println("Peso Normal");
            }
            else if (IMC[i]<=30.00 || IMC[i]<=34.99)  {
                System.out.println("Sobrepeso");
            }
            else if (IMC[i]<=35.00 || IMC[i]<=40.00)  {
                System.out.println("Sobrepeso");
            }
            else if (IMC[i] <= 40.00)  {
                System.out.println("Sobrepeso");
            }
            System.out.println(" ");

            
        reader.close();
        }
        System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra.\n");
    }
}