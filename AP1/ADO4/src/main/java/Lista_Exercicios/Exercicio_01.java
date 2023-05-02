/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Exercicios;

import java.util.Scanner;

/**
 *
 * @author Zile
 */
public class Exercicio_01 {

    static int menor(int n1, int n2, int n3) {

        int n_menor = 0;

        if (n1 < n2 && n1 < n3) {
            n_menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            n_menor = n2;
        } else {
            n_menor = n3;
        }

        return (n_menor);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, funcao = 0;

        System.out.println("informe o primeiro numero");
        n1 = scan.nextInt();

        System.out.println("informe o primeiro numero");
        n2 = scan.nextInt();

        System.out.println("informe o primeiro numero");
        n3 = scan.nextInt();

        funcao = menor(n1, n2, n3);
        
        System.out.println("o menor numero informado foi: " + funcao);
    }
}
