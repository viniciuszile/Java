package com.mycompany.jogo_impar_ou_par;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Jogo_Impar_ou_Par {

    public static void main(String[] args) {

        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        double numero_aleatorio = Math.floor(Math.random() * 101);
        double numero_jogador = Math.floor(Math.random() * 3);

        String ip1 = ""; //escolha impar ou par jogador1
        String ip2 = ""; //escolha impar ou par jogador1
        String jogador1 = "";
        String jogador2 = "";
        String nome1 = "";
        String nome2 = "";

        System.out.println("" + string.repeat(count));
        Scanner scan_nome1 = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        nome1 = scan_nome1.nextLine();

        Scanner scan_nome2 = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        nome2 = scan_nome2.nextLine();
        System.out.println("" + string.repeat(count));

        if (numero_jogador == 1) {
            jogador1 = nome1;
            Scanner scan_escolha_ip = new Scanner(System.in);
            System.out.printf("" + jogador1 + " Voce quer impar ou par? \n");
            System.out.println("" + string.repeat(count));
            ip1 = scan_escolha_ip.nextLine();

        } else {
            jogador1 = nome2;
            Scanner scan_escolha_ip2 = new Scanner(System.in);
            System.out.printf("" + jogador1 + " Voce quer impar ou par? \n");
            ip2 = scan_escolha_ip2.nextLine();
        };

        if (jogador1 == nome1) {
            System.out.println("" + string.repeat(count));
            System.out.printf(nome1 + " escolheu " + ip1 + "\n");
        } else {
            System.out.println("" + string.repeat(count));
            System.out.printf(nome2 + " escolheu " + ip2+ "\n");
        };

        if (numero_aleatorio % 2 == 0) {
            System.out.printf("O numero sorteado foi " + numero_aleatorio + ", par venceu" + "\n");
        } else {
            System.out.printf("O numero sorteado foi " + numero_aleatorio + ", impar venceu" + "\n");
        };

    }
}
