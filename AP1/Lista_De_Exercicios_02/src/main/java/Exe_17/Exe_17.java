/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_17;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * Ler um número inteiro N e calcular e imprimir todos os seus
 * divisores. Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6.
 * Utilize o laço que lhe for mais conveniente.
 *
 */
public class Exe_17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int soma = 0; 
                
        System.out.print("Digite um número inteiro N: ");        
        int n = scan.nextInt();
        

        System.out.print("Divisores de " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                soma = soma + i;
            }
        }
        System.out.println("\na soma é de: " + soma);

        scan.close();
    }
}
