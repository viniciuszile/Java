/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funcoes;

import java.util.Scanner;

/**
 *
 * @author Zile
 */
public class Funcoes {

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

        boolean condicao = false;

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("informe o tipo de conta que voce deseja: ");
            opcao = scan.nextInt();

            if (opcao < 0 || opcao > 6) {
                System.out.println("opcao invalida, tente novamente");
            } else {
                condicao = true;
            }
        } while (condicao == false);

        return opcao;
    }

    static void numeros(double n1, double n2, int opcao) {

        if (opcao == 5) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("informe um numero: ");
            n1 = scan.nextInt();
            conta(n1, 0, opcao);

        } else {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("informe um numero: ");
            n1 = scan.nextInt();

            System.out.println("informe um numero: ");
            n2 = scan.nextInt();

            conta(n1, n2, opcao);
        }

    }

    static void conta(double n1, double n2, int opcao) {

        switch (opcao) {
            case 1:
                soma(n1, n2);
                break;
            case 2:
                sub(n1, n2);
                break;
            case 3:
                mult(n1, n2);
                break;
            case 4:
                div(n1, n2);
                break;
            case 5:
                raiz(n1);
                break;
            case 6:
                potencia(n1, n2);
                break;
        }

    }

    static void soma(double a, double b) {

        double resultado = a + b;

        res(resultado);

    }

    static void sub(double a, double b) {

        double resultado = a - b;

        res(resultado);
    }

    static void mult(double a, double b) {

        double resultado = a * b;

        res(resultado);
    }

    static void div(double a, double b) {

        double resultado = a / b;

        res(resultado);
    }

    static void raiz(double a) {

        double resultado = Math.sqrt(a);

        res(resultado);
    }

    static void potencia(double a, double b) {

        double resultado = Math.pow(a, b);// metodo da biblioteca math, para calcular potencias.

        res(resultado);
    }

    static void res(double resultado) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {

        double n1 = 0, n2 = 0;
        int opcao = 0;

        menu();
        opcao = tipo(opcao);
        numeros(n1, n2, opcao);
    }
}
