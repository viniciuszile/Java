package com.mycompany.funcao;

import java.util.Scanner;

/**
 *
 * @author vinicius.zcosta
 */
public class Funcao {

    static Scanner scan = new Scanner(System.in);

    static void menu() {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("|(1) - adição                                    |");
        System.out.println("|(2) - subtração                                 |");
        System.out.println("|(3) - multplicação                              |");
        System.out.println("|(4) - divisão                                   |");
        System.out.println("|(5) - Raiz                                      |");
        System.out.println("|(6) - potencia                                  |");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }

    static int tipo(int opcao) {

        System.out.println("informe o tipo de conta que voce deseja: ");
        opcao = scan.nextInt();

        return opcao;
    }

    static double numeros(double n1) {

        System.out.println("informe um numero: ");
        n1 = scan.nextInt();

        return n1;
    }

    static double conta(int opcao, double n1, double n2) {

        switch (opcao) {
            case 1:
                System.out.println("foi");
                add(n1,n2);
                return(add (n1,n2));
        }

        return opcao;
    }

    static double add(double a, double b) {
        
        return (a + b);

    }


    public static void main(String[] args) {

        double n1 = 0, n2 = 0;
        int opcao = 0;
        
        menu();
        opcao = tipo(opcao);

        if (opcao != 5 && opcao != 6) {
            n1 = numeros(n1);
            n2 = numeros(n1);
        } else {
            n1 = numeros(n1);
        }

        conta(opcao,n1,n2);

        System.out.print("resultado " );

    }
}
