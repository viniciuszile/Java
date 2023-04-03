/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_15;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Zile
 * Faça um programa que leia um número inteiro N maior do que zero e
 * calcule o fatorial desse número. Fatorial de N é representado por N! e
 * calculado da seguinte maneira:
 *
 * n! = n * (n - 1) * (n - 2)*...*3*2*1
 */
public class Exe_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro N maior do que zero: ");
        int n = scan.nextInt();

        BigInteger fatorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
        scan.close();
    }

}
