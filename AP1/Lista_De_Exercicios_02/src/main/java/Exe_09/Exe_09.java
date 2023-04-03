/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_09;

import java.util.Scanner;

/**
 *
 * @author Zile Escreva um programa para ler a quantidade de alunos existentes
 * em uma turma. Depois disso, o programa deve ler as notas de cada um destes
 * alunos, calcular e mostrar na tela a média aritmética destas notas. Utilize o
 * laço WHILE
 */
public class Exe_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double alunos;
        double nota = 0;
        double t_notas = 0;
        double media = 0;

        System.out.println("informe a quantidade de alunos: ");
        alunos = scan.nextInt();

        for (int i = 1; i < alunos + 1; i++) {
            System.out.println("informe a nota do aluno " + i + " :");
            nota = scan.nextDouble();

            t_notas = t_notas + nota;

        }

        media = t_notas / alunos;

        System.out.println("a media das notas dos " + alunos + " informados é: " + media);

    }
}
