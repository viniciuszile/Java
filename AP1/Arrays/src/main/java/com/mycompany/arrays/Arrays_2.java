package com.mycompany.arrays;

import java.util.Scanner;

public class Arrays_2 {
    static Scanner scan = new Scanner(System.in);

    static int tamanho() {
        System.out.println("Informe o tamanho do array: ");
        int tamanho = scan.nextInt();
        return tamanho;
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

    public static void main(String[] args) {
        int tamanho = tamanho();
        int[] numeros = preencher(tamanho);
        print(numeros);
    }
}
