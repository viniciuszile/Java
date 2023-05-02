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
public class Exercicio_10 {

    public static String categoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else {
            return "Adulto";
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade = 0;
        String categoria = "";

        System.out.println("informe a sua idade: ");
        idade = scan.nextInt();

        categoria = categoria(idade);
        System.out.println("A categoria do nadador é: " + categoria);

    }
}
