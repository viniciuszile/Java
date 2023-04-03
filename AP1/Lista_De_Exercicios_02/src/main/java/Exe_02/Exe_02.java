package Exe_02;

import java.util.Scanner;

/**
 *
 * @author Zile
 *
 * Faça um programa que leia um número N do usuário, some todos os números
 * inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE.
 */
public class Exe_02 {

    public static void main(String[] args) {
        int n1 = 0; // numero informado pelo usario 
        int intervalo = 0; // guarda os numeros pra soma
        int soma = 0; //faz a soma

        Scanner scan = new Scanner(System.in);

        System.out.println("informe um numero");
        n1 = scan.nextInt();

        System.out.println("o numero formado foi :" + n1);
        System.out.println("os numeros que serao somados são :");
        while (intervalo < n1) {
            if (intervalo < n1) {
                intervalo++;
                soma = soma + intervalo;
            }

            System.out.printf(intervalo + "+");
        }
        System.out.println("\nA soma de todos esses numeros é de: " + soma);

    }
}
