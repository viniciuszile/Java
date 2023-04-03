/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_08;

/**
 *
 * @author Zile 
 * Calcular e mostrar a média aritmética dos números pares
 * compreendidos entre 13 e 73. Utilize o laço que lhe for mais conveniente.
 */
public class Exe_08 {

    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        System.out.println("os numeros pares entre 13 e 73 sao: ");
        for (int i = 14; i <= 72; i += 2) {
            soma += i;
            contador++;
            System.out.println(i);
        }

        double media = (double) soma / contador;

        System.out.println("A média dos números pares entre 13 e 73 é: " + media);
    }
}
