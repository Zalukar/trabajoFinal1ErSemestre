/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.punto4;

import java.util.Scanner;

/**
 *
 * @author Victor Manuel Ardila
 */
public class Punto4 {

    public static void main(String[] args) {
        
            // definir variables
        int numerounidad19,numerounidad20;
        double preciou19,preciou20,valorVenta19,valorVenta20;
        String nombreDelProducto19,nombreDelProducto20;


            //creamos scanner
        Scanner reader = new Scanner(System.in);

            //Producto 2019 ingreso
        System.out.println("Ingrese el nombre del producto (2019)");
        nombreDelProducto19 = reader.nextLine();
        System.out.println("Ingrese el numero de unidades del producto (2019)");
        numerounidad19 = reader.nextInt();
        System.out.println("Ingrese el precio del producto (2019)\n");
        preciou19 = reader.nextDouble();

            //Proceso 2019
        valorVenta19 = numerounidad19 * preciou19;

            //Producto 2020 ingreso
        reader.nextLine(); //Salto extra para evitar errores
        System.out.println("Ingrese el nombre del producto (2020)");
        nombreDelProducto20 = reader.nextLine();
        System.out.println("Ingrese el numero de unidades del producto (2020)");
        numerounidad20 = reader.nextInt();
        System.out.println("Ingrese el precio del producto (2020)\n");
        preciou20 = reader.nextDouble();

            //Proceso 2020
        valorVenta20 = numerounidad20 * preciou20;

            //Cerramos el scanner
        reader.close();

            //Nombre  del  artículo  que  experimentó  la  mayor suba y la cantidad de aumento
        if (valorVenta20 > valorVenta19) {
            System.out.println("\nNombre del producto(2020): "+nombreDelProducto20);
            System.out.println("precio del producto(2020): "+preciou20);
            System.out.println("Valor de venta (2020): "+valorVenta20+"\n");

            System.out.println("Nombre del producto(2019): "+nombreDelProducto19);
            System.out.println("precio del producto(2019): "+preciou19);
            System.out.println("Valor de venta (2019): "+valorVenta19+"\n");

            System.out.println("el producto: "+nombreDelProducto20+"(2020) tuvo un mayor valor de venta, comparado con el producto: "+nombreDelProducto19+"(2019)\n");

            System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra.\n");

        } else if (valorVenta19 > valorVenta20) {
            System.out.println("\nNombre del producto(2020): "+nombreDelProducto20);
            System.out.println("precio del producto(2020): "+preciou20);
            System.out.println("Valo de venta (2020): "+valorVenta20+"\n");

            System.out.println("Nombre del producto(2019): "+nombreDelProducto19);
            System.out.println("precio del producto(2019): "+preciou19);
            System.out.println("Valor de venta (2019): "+valorVenta19+"\n");

            System.out.println("el producto: "+nombreDelProducto19+"(2019) tuvo un mayor valor de venta, comparado con el producto: "+nombreDelProducto20+"(2020)\n");

            System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra.\n");

        } 
        else if (valorVenta19 == valorVenta20) {
            System.out.println("\nNombre del producto(2020): "+nombreDelProducto20);
            System.out.println("precio del producto(2020): "+preciou20);
            System.out.println("Valo de venta (2020): "+valorVenta20+"\n");

            System.out.println("Nombre del producto(2019): "+nombreDelProducto19);
            System.out.println("precio del producto(2019): "+preciou19);
            System.out.println("Valor de venta (2019): "+valorVenta19+"\n");

            System.out.println("el producto: "+nombreDelProducto19+"(2019) tuvo el mismo valor de venta que el producto el producto: "+nombreDelProducto20+"(2020)\n");

            System.out.println("Ejercicio hecho por: Victor Manuel Ardila Becerra.\n");
        }
    }
}
