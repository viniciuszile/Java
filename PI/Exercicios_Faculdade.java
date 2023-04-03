package com.mycompany.exercicios;

public class Exercicios {

    public static void main(String[] args) {

        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        //exercicio  1        
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 1" + "\n");
        String nome = "vincius zile";
        System.out.printf("%s %s", "Meu nome é:", nome);
        System.out.println("\n" + string.repeat(count));

        // exercicio 2;
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 2" + "\n");
        int produto1 = 28;
        int produto2 = 43;
        int produto = produto1 * produto2;

        System.out.printf("%s %d", "O resultado do produto é", produto);
        System.out.println("\n" + string.repeat(count));

        // exercicio 3 e 4
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 3 e 4" + "\n");
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        int media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%s %d", "a media dos numero é: ", media);
        System.out.println("\n" + string.repeat(count));

        // exercicio 5        
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 5" + "\n");
        int num = 10;
        int n_ant = num - 1;
        int n_suc = num + 1;

        System.out.printf("%s %d %s %d %s %d", "o numero é", num, "o seu antecessor é", n_ant, "seu sucessor é", n_suc);
        System.out.println("\n" + string.repeat(count));

        // exercicio 6
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 6" + "\n");
        int num_terco = 9;
        int terco = num_terco / 3;

        System.out.printf("%s %d", "um terço de 9 é:", terco);
        System.out.println("\n" + string.repeat(count));

        // exercio 7
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 7" + "\n");
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;
        int media_pond = (numero1 * 1 + (numero2 * 2 + (numero3 * 3) + (numero4 * 4))) / 10;

        System.out.printf("%s %d", "a media ponderada entre os numeros 10,20,30,40 divido por 10 é:", media_pond);
        System.out.println("\n" + string.repeat(count));

        // exercicio 8
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 8" + "\n");
        int saldo = 100;
        int porcentagem = saldo / 100;
        int saldo_novo = saldo + porcentagem;

        System.out.printf("%s %d", "o novo saldo é", saldo_novo);
        System.out.println("\n" + string.repeat(count));

        //exercicio 9
        System.out.println("\n" + string.repeat(count));
        System.out.printf("Execicio 9" + "\n");
        int salario = 1302;
        int qw = (1302 / 7) / 100;
        int qw_gasto = 90;
        int total = qw * qw_gasto;

        System.out.printf("o salario minimo é de " + salario + " de acordo com esse salario 1 quilowatts custa" + qw + "o total de "
                + "quilowatts gasto foi de" + qw_gasto + "o total a pagar é de:" + total);
        System.out.println("\n" + string.repeat(count));

        // exercicio 10 e 11
        System.out.println("\n"+string.repeat(count));
        System.out.printf("Execicio 10 e 11" + "\n");
        int base = 20;
        int altura = 10;
        int perimetro = (base + altura) * 2;
        int area = base * altura;
        int base2 = area / 2;

        System.out.printf("a base é: " + base + "\n");
        System.out.printf("a altura é: " + altura + "\n");
        System.out.printf("o perimetro é: " + perimetro + "\n");
        System.out.printf("a area é de: " + area + "\n");
        System.out.printf("a (base x altura) dividido por 2 é: " + base2);
        System.out.println("\n"+string.repeat(count));

        // exercicio 12
        System.out.println("\n"+string.repeat(count));
        System.out.printf("Execicio 12" + "\n");
        int hora = 30;
        int aula = 50;
        int salario_por_hora = 1302; //*5 levando em conta que cada aula tem 5 horas
        double desconto = salario_por_hora * 0.05;
        double novo_salario = salario_por_hora - desconto;

        System.out.printf("o preço da hora trabalhada é: " + hora + "\n");
        System.out.printf("o total de aulas dadas foi de: " + aula + "\n");
        System.out.printf("o seu salario é de:" + salario_por_hora + "\n");
        System.out.printf("O desconto do inss foi de: " + desconto + "\n");
        System.out.printf("o seu salario com desconto do inss é: " + novo_salario + "\n");
        System.out.println("\n"+string.repeat(count));


        // exercicio 13
        System.out.println("\n"+string.repeat(count));
        System.out.printf("Execicio 13" + "\n");
        int tempo = 60;// em minutos
        int velocidade = 100; //em km
        int distancia = tempo * velocidade;
        double litros = distancia / 12;

        System.out.printf("o tempo gasto foi de: " + tempo + "min" + "\n");
        System.out.printf("a velocidade media foi de: " + velocidade + "km" + "\n");
        System.out.printf("a distancia foi de: " + distancia + "km" + "\n");
        System.out.printf("o total de litros gastos foi de: " + litros + "L" + "\n");
        System.out.println("\n"+string.repeat(count));
        
        //exercicio 14
        System.out.println("\n"+string.repeat(count));
        System.out.printf("Execicio 14" + "\n");
        int a = 5, b = 10, c;

        c = a;
        a = b;
        b = c;

        System.out.printf("Valor de a é: " + a + "\n");
        System.out.printf("Valor de b é: " + b);
        System.out.println("\n"+string.repeat(count));
        

        // exercicio 15
        System.out.println("\n"+string.repeat(count));
        System.out.printf("Execicio " + "\n");
        int gastos = 2000;
        double taxa_garcom = 2000 * 0.20;
        double total_gastos = gastos + taxa_garcom;

        System.out.printf("Valor das despezas: " + gastos + "\n");
        System.out.printf("Valor da taxa dos garçons é: " + taxa_garcom + "\n");
        System.out.printf("Valor total com despezas e taxas: " + total_gastos + "\n");
        System.out.println("\n"+string.repeat(count));

    }
}
