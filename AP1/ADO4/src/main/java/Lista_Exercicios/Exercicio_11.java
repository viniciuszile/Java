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
public class Exercicio_11 {

    public static String obterConceito(double media) {
        if (media < 5.0) {
            return "D";
        } else if (media < 7.0) {
            return "C";
        } else if (media < 9.0) {
            return "B";
        } else {
            return "A";
        }
    }

    public static void main(String[] args) {
        double mediafinal = 8.2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("informe o sua media final: ");
        mediafinal = scan.nextDouble();
        
        String conceito = obterConceito(mediafinal);
        
        System.out.println("A média final do aluno é " + mediafinal + " e seu conceito é " + conceito);
    }
}
