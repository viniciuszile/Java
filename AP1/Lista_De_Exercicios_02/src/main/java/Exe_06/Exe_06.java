/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe_06;

import java.util.Scanner;

/**
 *
 * @author Zile 
 * Faça um programa para ler e escrever dados de uma turma de 5
 * alunos. O programa deve pedir dados como nome, idade e sexo. O programa deve
 * imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
 */
public class Exe_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        String sexo = "";
        int idade = 0;
        int m_idade = 0;
        String m_nome = "";
        String m_sexo = "";
        int i = 1;

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=--=-");
            System.out.println("Insira o nome do aluno " + i + " :");
            nome = scan.nextLine();

            System.out.println("Insira o sexo do aluno " + i + " :");
            sexo = scan.nextLine();

            System.out.println("Insira a idade do aluno " + i + " :");
            idade = scan.nextInt();
            scan.nextLine(); // Consumir a quebra de linha

            if (idade > m_idade) {
                m_idade = idade;
                m_nome = nome;
                m_sexo = sexo;
            }

            i++;
        } while (i < 6);

        System.out.println("Os dados do aluno mais velho informado foram:");
        System.out.println("Nome: " + m_nome);
        System.out.println("Idade: " + m_idade);
        System.out.println("Sexo: " + m_sexo);
    }
}
