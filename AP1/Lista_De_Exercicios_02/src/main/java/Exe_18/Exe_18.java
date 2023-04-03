/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_18;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é
 * conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2
 * primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um
 * inteiro N (onde N < 46)
 */
public class Exe_18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro N (onde N < 46): ");
        int n = scan.nextInt();

        int anterior1 = 0;
        int anterior2 = 1;
        int atual = 0;

        System.out.print("Sequência de Fibonacci com os " + n + " primeiros números: ");
        System.out.print(anterior1 + " " + anterior2 + " ");

        for (int i = 3; i <= n; i++) {
            atual = anterior1 + anterior2;
            System.out.print(atual + " ");
            anterior1 = anterior2;
            anterior2 = atual;
        }
    }
}
