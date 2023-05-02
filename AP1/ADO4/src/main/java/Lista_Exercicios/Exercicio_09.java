/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Exercicios;

import java.util.Scanner;
import java.time.LocalDate; // bibliteca responsavel por pegar a data atual
import java.time.temporal.ChronoUnit; // biblioteca responveis para fazer o calculo de dias

/**
 *
 * @author Zile
 */
public class Exercicio_09 {

    public static long calcularDiasDeVida(int dia, int mes, int ano) {
        
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        LocalDate dataAtual = LocalDate.now();

        long diasDeVida = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        return diasDeVida;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento abaixo:");

        System.out.println("Dia: ");
        int dia = scan.nextInt();

        System.out.println("Mês: ");
        int mes = scan.nextInt();

        System.out.println("Ano: ");
        int ano = scan.nextInt();

        long diasDeVida = calcularDiasDeVida(dia, mes, ano);

        System.out.println("O total de dias vividos até hoje é: " + diasDeVida);
    }

}
