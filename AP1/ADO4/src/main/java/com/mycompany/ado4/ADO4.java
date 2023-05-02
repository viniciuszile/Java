/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ado4;

import java.util.Scanner;

/**
 *
 * @author Vinicius Zile
 */
public class ADO4 {

    static int add(int a, int b) {

        return (a + b);

    }

    static int sub(int a, int b) {

        return (a - b);

    }

    static int mult(int a, int b) {

        return (a * b);

    }

    static int div(int a, int b) {

        return (a / b);

    }

    static double raiz(double a) {

        return Math.sqrt(a); // metodo da biblioteca math, para calcular raizes.

    }

    static double potencia(double a, double b) {

        return Math.pow(a, b);// metodo da biblioteca math, para calcular potencias.

    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int res = 0;
        int decisao = 0;
        double res_raiz = 0;
        double res_potencia = 0;
        int tipo = 0;

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("|(1) - adição                                    |");
            System.out.println("|(2) - subtração                                 |");
            System.out.println("|(3) - multplicação                              |");
            System.out.println("|(4) - divisão                                   |");
            System.out.println("|(5) - Raiz                                      |");
            System.out.println("|(6) - potencia                                  |");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            System.out.println("informe o tipo de conta que voce deseja fazer: ");

            Scanner scan = new Scanner(System.in);
            tipo = scan.nextInt();

            if (tipo == 1) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Informe um numero: ");
                n1 = scan.nextInt();

                System.out.println("Informe um numero: ");
                n2 = scan.nextInt();

                res = add(n1, n2);

            } else if (tipo == 2) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Informe um numero: ");
                n1 = scan.nextInt();

                System.out.println("Informe um numero: ");
                n2 = scan.nextInt();
                res = sub(n1, n2);

            } else if (tipo == 3) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Informe um numero: ");
                n1 = scan.nextInt();

                System.out.println("Informe um numero: ");
                n2 = scan.nextInt();
                res = mult(n1, n2);

            } else if (tipo == 4) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Informe um numero: ");
                n1 = scan.nextInt();

                System.out.println("Informe um numero: ");
                n2 = scan.nextInt();
                res = div(n1, n2);

            } else if (tipo == 5) {

                double num_raiz = 0;
                
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("informe o numero que voce deseja saber a raiz");
                num_raiz = scan.nextDouble();

                res_raiz = raiz(num_raiz);

                if (res_raiz % 1 == 0) {
                    System.out.println("o resultado é uma raiz quadrada racional: " + res_raiz);
                } else {
                    System.out.println("o resultado é uma raiz quadrada irracional: " + res_raiz);
                }

            } else if (tipo == 6) {
                double n_potencia = 0;
                double expoente = 0;

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("informe um numero: ");
                n_potencia = scan.nextDouble();

                System.out.println("informe o expoente: ");
                expoente = scan.nextDouble();

                res_potencia = potencia(n_potencia, expoente);

                System.out.println("o resultado da potencia é de: " + res_potencia);

            }

            if (tipo != 5 && tipo != 6) {
                System.out.println("o resultado é: " + res);
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("deseja usar nossa calculadora novamente? 1- sim 2- não");
            decisao = scan.nextInt();
        } while (decisao != 2);

        System.out.println("tks");

    }
}
