package com.mycompany.impar_par;
import java.util.Scanner;

public class Impar_par {

    public static void main(String[] args) {
        
        int numero; //numero informado pelo usuario
        int cont_par = 0; //contador que conta os numeros pares
        int cont_impar = 0; //contador que conta os numeros impares
        String repetido = ""; //contador que diz se foi mais informado impar ou par
        int count = 40; // numero de vezes que a o caractere -= sera reptido
        String tipo; //tipo de conta que o usuario ira escolher (+,-,/,*)        
        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario

        for (int i = 1; i <= 7; i++) {

            System.out.println("" + string.repeat(count));
            Scanner input_n1 = new Scanner(System.in);
            System.out.printf("Informe um numero:");
            numero = input_n1.nextInt();

            if (numero % 2 == 0) {
                cont_par = cont_par + 1;
            } else {
                cont_impar = cont_impar + 1;
            };

        }
        if(cont_par == cont_impar){
            repetido = repetido.replace("","foram informado a mesma quantidade de numeros impares e pares");
        };

        if (cont_par > cont_impar) {
            repetido = repetido.replace("", "o tipo de numero mais informado foi par");
        } else {
            repetido = repetido.replace("", "o tipo de numero mais informado foi impar");
        };
        
        System.out.println("" + string.repeat(count));
        System.out.printf("%s : %d %s", "Os numeros pares são:", cont_par, "\n");
        System.out.printf("%s : %d %s", "Os numeros impares são:", cont_impar, "\n");
        System.out.printf("%s", repetido);
    }
}
