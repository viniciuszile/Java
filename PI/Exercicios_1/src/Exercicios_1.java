import java.util.Scanner;

public class Exercicios_1 {
    public static void main(String[] args) {
        
    String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
    int count = 40; // numero de vezes que a o caractere -= sera reptido
    int acesso;
    int acesso2;
    int escolher_exercicios;

    Scanner input_condicao = new Scanner(System.in);
    System.out.println("Deseja ver a lista de exercicios ? 1- sim - 2- nao:");
    acesso = input_condicao.nextInt();
    System.out.println("" + string.repeat(count));

    while (acesso == 1) {
        System.out.println("\n" + string.repeat(count));
        System.out.println("Exercicio - 1");
        System.out.println("Exercicio - 2");
        System.out.println("Exercicio - 3 e 4");
        System.out.println("Exercicio - 5");
        System.out.println("Exercicio - 6");
        System.out.println("Exercicio - 7");
        System.out.println("Exercicio - 8");
        System.out.println("Exercicio - 9");
        System.out.println("Exercicio - 10 e 11");
        System.out.println("Exercicio - 12");
        System.out.println("Exercicio - 13");
        System.out.println("Exercicio - 14");
        System.out.println("Exercicio - 15");

        Scanner input_exercicio = new Scanner(System.in);
        System.out.print("Qual Exercicio Voce Deseja Vizualizar?");
        escolher_exercicios = input_exercicio.nextInt();

        switch (escolher_exercicios) {

            case 1:

                //exercicio  1      
                System.out.println("\n" + string.repeat(count));
                System.out.printf("1) Imprimir seu nome" + "\n");
                String nome;

                Scanner input_1 = new Scanner(System.in);
                System.out.print("Insira o seu nome");
                nome = input_1.nextLine();

                System.out.printf("%s %s", "Seu nome é:", nome);
                System.out.println("\n" + string.repeat(count));

                break;

            case 2:

                // exercicio 2;
                System.out.println("\n" + string.repeat(count));
                System.out.printf("2) Imprima o produto entre dois valores." + "\n");
                int produto1;
                int produto2;

                Scanner input_2 = new Scanner(System.in);
                System.out.print("Insira o primeiro numero:");
                produto1 = input_2.nextInt();

                Scanner input_2_1 = new Scanner(System.in);
                System.out.print("Insira o segundo numero:");
                produto2 = input_2_1.nextInt();

                int soma = produto1 * produto2;

                System.out.printf("%s %d", "O resultado do produto é", soma);
                System.out.println("\n" + string.repeat(count));

                break;

            case 3:

                // exercicio 3 e 4
                System.out.println("\n" + string.repeat(count));
                System.out.printf("3) Imprima a média aritmética entre os números \n");
                System.out.printf("4) Complemente o exercício anterior e imprima a mensagem “Média:“ antes do resultado + \n");
                int nota1;
                int nota2;
                int nota3;
                int nota4;

                Scanner input_3 = new Scanner(System.in);
                System.out.print("Insira a nota 1: ");
                nota1 = input_3.nextInt();

                Scanner input_3_1 = new Scanner(System.in);
                System.out.print("Insira a nota 2: ");
                nota2 = input_3_1.nextInt();

                Scanner input_3_2 = new Scanner(System.in);
                System.out.print("Insira a nota 3: ");
                nota3 = input_3_2.nextInt();

                Scanner input_3_3 = new Scanner(System.in);
                System.out.print("Insira a nota 4: ");
                nota4 = input_3_3.nextInt();

                int media = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.printf("%s %d", "a media dos numero é: ", media);
                System.out.println("\n" + string.repeat(count));

                break;

            case 5:

                // exercicio 5        
                System.out.println("\n" + string.repeat(count));
                System.out.printf("5)Dado um número inteiro, imprima seu sucessor e seu antecessor" + "\n");
                int num;

                Scanner input_5 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                num = input_5.nextInt();

                int n_ant = num - 1;
                int n_suc = num + 1;

                System.out.printf("%s %d %s %d %s %d", "o numero é", num, "o seu antecessor é", n_ant, "seu sucessor é", n_suc);
                System.out.println("\n" + string.repeat(count));

                break;

            case 6:

                // exercicio 6
                System.out.println("\n" + string.repeat(count));
                System.out.printf("6)Dado um número real, imprima a terça parte desse número" + "\n");
                int num_terco;

                Scanner input_6 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                num_terco = input_6.nextInt();

                int terco = num_terco / 3;

                System.out.printf("%s %d", "um terço de " + num_terco +" é:", terco);
                System.out.println("\n" + string.repeat(count));

                break;

            case 7:

                // exercio 7
                System.out.println("\n" + string.repeat(count));
                System.out.printf("7)Dado 4 números reais, imprima a média ponderada, sabendo-se que os pesos são respectivamente 1,2,3 e 4 (n1 x 1 + n2 x 2 + n3 x 3 + n4 x 4. Resultado dividir por 10)" + "\n");
                int numero1;
                int numero2;
                int numero3;
                int numero4;

                Scanner input_7 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                numero1 = input_7.nextInt();

                Scanner input_7_1 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                numero2 = input_7_1.nextInt();

                Scanner input_7_2 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                numero3 = input_7_2.nextInt();

                Scanner input_7_3 = new Scanner(System.in);
                System.out.print("Insira um numero: ");
                numero4 = input_7_3.nextInt();

                int media_pond = (numero1 * 1 + (numero2 * 2 + (numero3 * 3) + (numero4 * 4))) / 10;

                System.out.printf("%s %d", "a media ponderada entre os numeros 10,20,30,40 divido por 10 é:", media_pond);
                System.out.println("\n" + string.repeat(count));
                break;

            case 8:;

                // exercicio 8
                System.out.println("\n" + string.repeat(count));
                System.out.printf("8) Dado um saldo de uma aplicação, imprima o novo saldo, considerando o reajuste de 1 porcento" + "\n");

                int saldo;

                Scanner input_8 = new Scanner(System.in);
                System.out.print("Insira o saldo: ");
                saldo = input_8.nextInt();

                int porcentagem = saldo / 100;
                int saldo_novo = saldo + porcentagem;

                System.out.printf("%s %d", "o novo saldo é", saldo_novo);
                System.out.println("\n" + string.repeat(count));
                break;

            case 9:
                //exercicio 9
                System.out.println("\n" + string.repeat(count));
                System.out.printf("9)	Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:\n"
                        + "a.	valor em reais de cada quilowatt\n"
                        + "b.	o valor em reais a ser pago\n"
                        + "c.	novo valor a ser pago por essa residência com um desconto de 10%." + "\n");

                int salario;

                Scanner input_9 = new Scanner(System.in);
                System.out.print("Insira o salario: ");
                salario = input_9.nextInt();

                int qw = (1302 / 7) / 100;
                int qw_gasto = 90;
                int total = qw * qw_gasto;

                System.out.printf("o salario minimo é de " + salario + " de acordo com esse salario 1 quilowatts custa" + qw + "o total de "
                        + "quilowatts gasto foi de" + qw_gasto + "o total a pagar é de:" + total);
                System.out.println("\n" + string.repeat(count));
                break;

            case 10:
                // exercicio 10 e 11
                System.out.println("\n" + string.repeat(count));
                System.out.printf("10)	Dada a base e a altura de um retângulo,  imprimir a seguinte saída:\n"
                        + "a.	Perímetro: 2 x (base + altura);\n"
                        + "b.	Área: base x altura;" + "\n"
                        + "11)	Dada a base e a altura de um triangulo, imprimir a área: (base x altura) dividido por 2.\n."
                );

                int base;
                int altura;

                Scanner input_10 = new Scanner(System.in);
                System.out.print("\nInsira a base: ");
                base = input_10.nextInt();

                Scanner input_11 = new Scanner(System.in);
                System.out.print("Insira a altura: ");
                altura = input_11.nextInt();

                int perimetro = (base + altura) * 2;
                int area = base * altura;
                int base2 = area / 2;

                System.out.printf("a base é: " + base + "\n");
                System.out.printf("a altura é: " + altura + "\n");
                System.out.printf("o perimetro é: " + perimetro + "\n");
                System.out.printf("a area é de: " + area + "\n");
                System.out.printf("a (base x altura) dividido por 2 é: " + base2);
                System.out.println("\n" + string.repeat(count));
                break;

            case 12:

                // exercicio 12
                System.out.println("\n" + string.repeat(count));
                System.out.printf("12)efetue o cálculo do salário líquido de um professor. Os dados fornecidos serão: valor da hora aula, número de aulas dadas no mês e percentual de desconto do INSS." + "\n");

                int hora;
                int aula;
                int salario_por_hora; //*5 levando em conta que cada aula tem 5 horas

                Scanner input_12 = new Scanner(System.in);
                System.out.print("Insira as horas: ");
                hora = input_12.nextInt();

                Scanner input_12_1 = new Scanner(System.in);
                System.out.print("Insira as aulas: ");
                aula = input_12_1.nextInt();

                Scanner input_12_2 = new Scanner(System.in);
                System.out.print("Insira o salario por hora: ");
                salario_por_hora = input_12_2.nextInt();

                double desconto = salario_por_hora * 0.05;
                double novo_salario = salario_por_hora - desconto;

                System.out.printf("o preço da hora trabalhada é: " + hora + "\n");
                System.out.printf("o total de aulas dadas foi de: " + aula + "\n");
                System.out.printf("o seu salario é de:" + salario_por_hora + "\n");
                System.out.printf("O desconto do inss foi de: " + desconto + "\n");
                System.out.printf("o seu salario com desconto do inss é: " + novo_salario + "\n");
                System.out.println("\n" + string.repeat(count));
                break;

            case 13:

                // exercicio 13
                System.out.println("\n" + string.repeat(count));
                System.out.printf("13)	Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, sabendo-se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média. Utilizar as seguintes fórmulas: \n"
                        + "a.	distância = tempo x velocidade.\n"
                        + "b.	litros usados = distância dividido por 12.\n"
                        + "Apresentar os valores da velocidade média, tempo gasto na viagem, distância percorrida e a quantidade de litros utilizados na viagem." + "\n");

                int tempo;// em minutos
                int velocidade; //em km

                Scanner input_13 = new Scanner(System.in);
                System.out.print("Insira o tempo em minutos: ");
                tempo = input_13.nextInt();

                Scanner input_13_1 = new Scanner(System.in);
                System.out.print("Insira a velocidade em km: ");
                velocidade = input_13_1.nextInt();

                int distancia = tempo * velocidade;
                double litros = distancia / 12;

                System.out.printf("o tempo gasto foi de: " + tempo + "min" + "\n");
                System.out.printf("a velocidade media foi de: " + velocidade + "km" + "\n");
                System.out.printf("a distancia foi de: " + distancia + "km" + "\n");
                System.out.printf("o total de litros gastos foi de: " + litros + "L" + "\n");
                System.out.println("\n" + string.repeat(count));

                break;

            case 14:
                //exercicio 14
                System.out.println("\n" + string.repeat(count));
                System.out.printf("14)Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da variável A. Apresentar os valores trocados." + "\n");

                int a,
                 b,
                 c;

                Scanner input_14 = new Scanner(System.in);
                System.out.print("insira um valor: ");
                a = input_14.nextInt();

                Scanner input_14_1 = new Scanner(System.in);
                System.out.print("Insira outro valor: ");
                b = input_14_1.nextInt();

                c = a;
                a = b;
                b = c;

                System.out.printf("Valor de a é: " + a + "\n");
                System.out.printf("Valor de b é: " + b);
                System.out.println("\n" + string.repeat(count));

                break;

            case 15:
                // exercicio 15
                System.out.println("\n" + string.repeat(count));
                System.out.printf("15)	Todo restaurante embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas em um restaurante e imprima o valor total com a gorjeta. " + "\n");

                int gastos;

                Scanner input_15 = new Scanner(System.in);
                System.out.print("Insira os gastos: ");
                gastos = input_15.nextInt();

                double taxa_garcom = gastos * 0.20;
                double total_gastos = gastos + taxa_garcom;

                System.out.printf("Valor das despezas: " + gastos + "\n");
                System.out.printf("Valor da taxa dos garçons é: " + taxa_garcom + "\n");
                System.out.printf("Valor total com despezas e taxas: " + total_gastos + "\n");
                System.out.println("\n" + string.repeat(count));
                break;

        };

        Scanner input_condicao2 = new Scanner(System.in);
        System.out.println("Deseja rever a lista de exercicios ? 1- sim - 2- nao:");
        acesso = input_condicao2.nextInt();
        System.out.println("" + string.repeat(count));

    }
 }
}