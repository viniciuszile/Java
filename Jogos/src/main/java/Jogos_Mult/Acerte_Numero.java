/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos_Mult;

/**
 *
 * @author Zile
 */
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Acerte_Numero {

    public static void main(String[] args) {

        double numero_aleatorio = Math.floor(Math.random() * 101);

        double n_m = 0;
        double n_j = 0;

        int cont_j = 0;
        int cont_m = 0;

        double tentativa_j = 0;
        double tentativa_m = 0;

        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        Scanner scan = new Scanner(System.in);

        System.out.println("o adversario ja escolheu o numero dele.");
        n_m = Math.floor(Math.random() * 6);

        System.out.println("infome o numero que voce deseja entre 0 e 100: ");
        n_j = scan.nextDouble();

        do {
            System.out.println("Vamos Começar,tente acertar Qual o numero do seu adversario: ");
            tentativa_j = scan.nextDouble();

            if (tentativa_j == n_m) {
                System.out.println("parabens voce acertou.");
                cont_j = cont_j + 1;
            } else if (tentativa_j < n_m) {
                System.out.println("Chutou baixo");
                cont_j = cont_j + 1;
            } else if (tentativa_j > n_m) {
                System.out.println("chutou alto");
                cont_j = cont_j + 1;
            }

            System.out.println("Vez Da Maquina: ");
            System.out.println("chute maquina " + n_m);

            if (tentativa_j == n_m) {
                System.out.println("A Maquina acertou seu numero.");
                cont_m = cont_m + 1;
                n_m = Math.floor(Math.random() * 6);
            } else if (tentativa_j < n_m) {
                System.out.println("A Maquina Chutou baixo");
                cont_m = cont_m + 1;
                n_m = Math.floor(Math.random() * 6);
            } else if (tentativa_j > n_m) {
                System.out.println("A Maquina chutou alto");
                cont_m = cont_m + 1;
                n_m = Math.floor(Math.random() * 6);
                
                
            }

        } while (tentativa_j != n_m || tentativa_m != n_j);

        System.out.println("sai");
    }
}
