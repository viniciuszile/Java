/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;

/**
 *
 * @author vinicius.zcosta
 */
public class Arrays {

    public static void main(String args[]) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
        for (int numero : numeros) {

            System.out.println(numero);
        }

        int x = numeros[0] + numeros[4];

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("x " + x);

        numeros[0] = x;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
        for (int numero : numeros) {

            System.out.print(numero);
        }
       
    }
}
