/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_03;

import java.util.Scanner;

/**
 *
 * @author Zile
 *
 * Escreva um programa que leia um conjunto de 10 números inteiros positivos.
 * Seu programa deve determinar e imprimir o maior deles. Use o laço FOR.
 */
public class Exe_03 {

    public static void main(String[] args) {
        int n = 0;
        int maior = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i < 11; i++){
            System.out.println("informe o numero " + i + " :");
            n = scan.nextInt();
            
            if(n > maior){
                maior = n;
            }
        }
        
        System.out.println("O maior numero informado foi: " + maior);
        
    }
}
