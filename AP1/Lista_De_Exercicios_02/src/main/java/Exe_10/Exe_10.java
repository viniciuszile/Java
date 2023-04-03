/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_10;

/**
 *
 * @author Zile Faça um programa que calcule e imprima o resultado da soma
 * abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser
 * decimais). Utilize o laço que lhe for mais conveniente.
 *
 * s = 1 + 1/2 + 1/3 + 1/4 + 1/20
 */
public class Exe_10 {
    public static void main(String[] args) {
        
        double s = 1;
        for (int i = 2; i <= 20; i++) {
            s += 1.0 / i;
        }
        System.out.println("O resultado da soma é: " + s);

    }
}
