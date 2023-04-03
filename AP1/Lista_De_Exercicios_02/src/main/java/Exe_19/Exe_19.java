/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_19;

import java.util.Scanner;

/**
 *
 * @author Zile Escreva um programa que repita a leitura de uma senha até que
 * ela seja válida. Para cada leitura de senha incorreta informada, escrever a
 * mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
 * a senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.
 */
public class Exe_19 {

    public static void main(String[] args) {

        int senha = 2002;
        int tentativa;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("informe a senha:");
            tentativa = scan.nextInt();

            if (tentativa != senha) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Senha invalida tente novamente.");
            } else {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Seja bem vindo!!!");
            }
        }while(tentativa != senha);
        
        
    }
}
