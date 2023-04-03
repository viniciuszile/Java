/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_14;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * Faça um programa que leia um número natural N e calcule a soma
 * abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser
 * decimais). Utilize o laço que lhe for mais conveniente.
 *
 * s = 1 + 2/3 + 4/5 + 6/7 +...+ 2n/(2n + 1)
 */
public class Exe_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número natural N: ");
        int n = scan.nextInt();

        double soma = 1.0;
        for (int i = 1; i <= n; i++) {
            soma += (2.0 * i) / (2.0 * i + 1.0);
        }

        System.out.println("A soma é: " + soma);
        scan.close();
    }
}
