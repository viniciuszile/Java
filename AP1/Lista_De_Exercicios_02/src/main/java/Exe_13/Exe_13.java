/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_13;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * Faça um programa que leia um número natural N e calcule a soma
 * abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser
 * decimais). Utilize o laço que lhe for mais conveniente. s = 1 + (1 * 2) /
 * (1*3) + (1*2*3) / (1*3*5) + (1*2*3*4) / (1*3*5*7) + .... + (1*2*3*...*n) / 1 * 3 * 5 * ...*(2n - 1)
 */
public class Exe_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número natural N: ");
        int n = scan.nextInt();

        double soma = 0.0;
        int denominador = 1;
        for (int i = 1; i <= n; i++) {
            int numerador = 1;
            for (int j = 1; j <= i; j++) {
                numerador *= j;
            }
            soma += (double) numerador / denominador;
            denominador *= 2 * i + 1;
        }

        System.out.println("A soma total é: " + soma);

        scan.close();
    }
}
