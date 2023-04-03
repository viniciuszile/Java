/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_20;

import java.util.Scanner;

/**
 *
 * @author Zile Escreva um programa capaz de ler o saldo inicial de uma conta
 * bancária e um número indeterminado de operações de depósito e saque. O
 * usuário deve digitar “1” para realizar um depósito, “2” para realizar um
 * saque. Após digitar o código da operação, o usuário deve digitar o valor. As
 * operações devem continuar sendo realizadas até que o usuário digite o código
 * de operação “3”. Ao digitar “3”, o programa deve ser encerrado e o saldo
 * final da conta deve ser impresso com as seguintes mensagens: CONTA ZERADA
 * (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
 * CONTA PREFERENCIAL (se o saldo for positivo). Utilize o laço DO-WHILE.
 */
public class Exe_20 {

    public static void main(String[] args) {
        boolean condicao = true;
        double saldo = 1000;
        int decisao = 0;
        int deposito = 0;
        int saque = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
            System.out.println("Seja bem vindo ao nosso banco!!!");
            System.out.println("O saldo atual da sua conta é de: " + saldo);
            System.out.println("Digite 1 para fazer um deposito.");
            System.out.println("Digite 2 para fazer um saque.");
            System.out.println("Digite 3 para sair.");
            System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
            decisao = scan.nextInt();

            if (decisao == 1) {
                System.out.println("informe a quantidade que deseja depositar");
                deposito = scan.nextInt();
                System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
                saldo = saldo + deposito;
                System.out.println("Deposito realizado com sucesso, saldo atual: " + saldo);
            } else if (decisao == 2) {
                System.out.println("informe a quantidade que deseja sacar");
                saque = scan.nextInt();
                System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
                saldo = saldo - saque;
                System.out.println("Saque realizado com sucesso, saldo atual: " + saldo);
            } else if (decisao == 3) {
                condicao = false;
            } else {
                System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
                System.out.println("opção indisponivel, tente novamente.");
            }
        } while (condicao == true);

        if (saldo > 0) {
            System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
            System.out.println("Saldo Atual :" + saldo);
            System.out.println("Tipo de conta: preferencial.");
        } else if (saldo == 0) {
            System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
            System.out.println("Saldo Atual :" + saldo);
            System.out.println("Tipo de conta: conta zerada.");
        }else if (saldo < 0) {
            System.out.println("=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-=");
            System.out.println("Saldo Atual :" + saldo);
            System.out.println("Tipo de conta: conta estourada.");
        }

    }
}
