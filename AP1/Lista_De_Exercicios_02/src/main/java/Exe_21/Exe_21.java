/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_21;

import java.util.Scanner;

/**
 *
 * @author Zile
 */
public class Exe_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scan.nextInt();

        int soma = 0;

        System.out.print("Divisores: ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                soma += i;
            }
        }

        System.out.println("\nSoma dos divisores: " + soma);

        if (soma == n) {
            System.out.println(n + " é um número perfeito.");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }

        scan.close();
    }
}
