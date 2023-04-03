/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_12;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * Faça um programa que leia um número natural N e calcule a soma
 * abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser
 * decimais). Utilize o laço que lhe for mais conveniente. s = 1/n + 2/n-1 + 3/n
 * - 2+...+n-1/2 + n/1
 */
public class Exe_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número natural N: ");
        int n = scan.nextInt();

        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Soma parcial após a iteração " + i + ": "); // print para conferir cada etapa
            double somaParcial = 0.0;
            for (int j = 1; j <= i; j++) {
                somaParcial += j / (double) (n - j + 1);
            }
            soma += somaParcial;
            System.out.println(somaParcial);
        }

        System.out.println("A soma total é: " + soma);

        scan.close();
    }
}
