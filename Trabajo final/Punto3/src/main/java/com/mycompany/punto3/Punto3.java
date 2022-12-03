/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.punto2;

import java.util.Scanner;

/**
 *
 * @author hari0
 */
public class Punto3 {

    public static void main(String[] args) {
          //MESES
        Scanner reader = new Scanner(System.in);
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";

            //SIGNOS ZODIACALES
        String signos = "";

            //NOMBRE
        System.out.println("ingrese el nombre");
        String nombre = reader.nextLine();
        System.out.println("Hola, "+nombre);

            //MES NACIMIENTO STR
        System.out.println("ingrese el Mes de nacimiento en LETRAS");
        String mes = reader.nextLine();
        mes = mes.toLowerCase();

            //TRANSFORMAR LOS MESES
        int mesnumero = 0;
        switch (mes) {
            case "enero":
                mesnumero = 1;
                break;
            case "febrero":{
                mesnumero = 2;
                break;
            }
            case "marzo":{
                mesnumero = 3;
                break;
            }
            case "abril":{
                mesnumero = 4;
                break;
            }
            case "mayo":{
                mesnumero = 5;
                break;
            }
            case "junio":{
                mesnumero = 6;
                break;
            }
            case "julio":{
                mesnumero = 7;
                break;
            }
            case "agosto":{
                mesnumero = 8;
                break;
            }
            case "septiembre":{
                mesnumero = 9;
                break;
            }
            case "octubre":{
                mesnumero = 10;
                break;
            }
            case "noviembre":{
                mesnumero = 11;
                break;
            }
            case "diciembre":{
                mesnumero = 12;
                break;
            }
            default:{
            System.out.println("ingrese un mes valido");
                break;
            }}  //TRENEMOS EL MES EN NUMERO

            //DIA NACIMIENTO INT
        System.out.println("ingrese el dia de nacimiento en numeros");
        int dia = reader.nextInt();

        reader.close(); //FIN DEL SCANNER

            //CALCULAMOS SIGNOS ZODIACALES
        switch(mesnumero) {
            case 1:
              if (dia < 21) {
                signos = "capricornio";
              } else {
                signos = "acuario";
              }
              break;
            case 2:
              if (dia < 20) {
                signos = "acuario";
              } else {
                signos = "piscis";
              }
              break;
            case 3:
              if (dia < 21) {
                signos = "piscis";
              } else {
                signos = "aries";
              }
              break;
            case 4:
              if (dia < 21) {
                signos = "aries";
              } else {
                signos = "tauro";
              }
              break;
            case 5:
              if (dia < 20) {
                signos = "tauro";
              } else {
                signos = "géminis";
              }
              break;
            case 6:
              if (dia < 22) {
                signos = "géminis";
              } else {
                signos = "cáncer";
              }
              break;
            case 7:
              if (dia < 22) {
                signos = "cáncer";
              } else {
                signos = "Leo";
              }
              break;
            case 8:
              if (dia < 24) {
                signos = "leo";
              } else {
                signos = "virgo";
              }
              break;
            case 9:
              if (dia < 23) {
                signos = "virgo";
              } else {
                signos = "libra";
              }
              break;
            case 10:
              if (dia < 23) {
                signos = "libra";
              } else {
                signos = "escorpio";
              }
              break;
            case 11:
              if (dia < 23) {
                signos = "escorpio";
              } else {
                signos = "sagitario";
              }
              break;
            case 12:
              if (dia < 21) {
                signos = "sagitario";
              } else {
                signos = "capricornio";
              }
              break;
            default:
          }
        
            //SALIDA
        System.out.println(" ");
        System.out.println("Nombre: "+nombre+" ");
        System.out.println(" ");
        System.out.println("Mes y dia de nacimiento: "+mesnumero+"/"+dia);
        System.out.print("Su horóscopo es " + signos);
        System.out.println("\n Ejercicio hecho por: Victor Manuel Ardila Becerra. \n");
        reader.close();
    }
}
