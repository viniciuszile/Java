/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

import java.util.Scanner;

public class Array_3 {

    static Scanner scan = new Scanner(System.in);

    static int tamanho() {
        System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=-=-");
        System.out.println("Informe o tamanho do array: ");
        return scan.nextInt();
    }

    static int[] preencher(int tamanho) {
        int numeros[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um número para a posição " + i + ":");
            numeros[i] = scan.nextInt();
        }

        return numeros;
    }

    static void print(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vetor " + i + ": número " + numeros[i]);
        }
    }

    static int[] filtrarPares(int[] numeros) {
        int countPares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                countPares++;
            }
        }

        int[] pares = new int[countPares];
        int index = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[index] = num;
                index++;
            }
        }

        return pares;
    }

    static int[] filtrarImpares(int[] numeros) {
        int countImpares = 0;

        for (int num : numeros) {
            if (num % 2 == 1) {
                countImpares++;
            }
        }

        int[] impares = new int[countImpares];
        int index = 0;

        for (int num : numeros) {
            if (num % 2 == 1) {
                impares[index] = num;
                index++;
            }
        }

        return impares;
    }

    public static void main(String[] args) {
        int tamanho = tamanho();

        System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int[] numeros = preencher(tamanho);

        System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Todos elementos do vetor:");
        print(numeros);

        int[] pares = filtrarPares(numeros);
        int[] impares = filtrarImpares(numeros);

        System.out.println("\n-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("vetor de numeros pares: ");
        print(pares);

        System.out.println("\n-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("vetor de numeros impares: ");
        print(impares);
    }
}
