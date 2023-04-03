/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_11;

import java.util.Scanner;

/**
 *
 * @author Zile Faça um programa que calcule e imprima o resultado da soma
 * abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser
 * decimais). Utilize o laço que lhe for mais conveniente.
 *
 * s = 1 + 1/2 + 1/3 + 1/4.... + 1/n
 */
public class Exe_11 {

    public static void main(String[] args) {
        double s = 1;
        double n = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de N: ");
        n = scan.nextInt();
        
        
        for (int i = 2; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("O resultado da soma é: " + s);

    }
}
