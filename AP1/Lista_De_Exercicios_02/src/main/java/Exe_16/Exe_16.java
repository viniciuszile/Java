/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_16;

import java.util.Scanner;

/**
 *
 * @author Zile
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar
(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
deverá imprimir apenas NULO. Utilize o laço DO-WHILE.
 */
public class Exe_16 {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        
         System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--");
        System.out.println("informe a quantidade de numeros a ser inseridos");
        int qtd = scan.nextInt();
        
        do{
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("informe um numero: ");
            int numero = scan.nextInt();
            
            if(numero  == 0){
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o numero informado é nulo.");
            }else if(numero % 2 == 0){
                 System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o numero informado é par.");
            }else{
                 System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o numero informado é impar.");
            }
            
            qtd --;
        }while(qtd > 0);
        
    }
}
