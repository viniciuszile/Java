/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Exercicios;

import java.util.Scanner;

/**
 *
 * @author Zile
 * 
 * exercicio 2,3,4
 */
public class Exercicio_2_3_4 {

    public static double divisao(int n) {

        int fatorial = 1;
        int somatoria = 0;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            somatoria += i;
        }
        double divisao = (double) fatorial / somatoria;
        return divisao;
    }

    public static int fatorial(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int somatoria(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static void main(String[] args) {

        int n_fatorial = 0;
        int n_somatoria = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = input.nextInt();

        int resultado_fatorial = fatorial(n);
        int resultado_somatoria = somatoria(n);
        double resultado = divisao(n);
        
        System.out.println("o resultado da fatorial: " + resultado_fatorial);
        System.out.println("o resultado da somatoria é: " +resultado_somatoria);
        System.out.println("o resultado da divisao entre a somatoria e o fatorial: " +resultado);
        
        input.close();
    }
}
