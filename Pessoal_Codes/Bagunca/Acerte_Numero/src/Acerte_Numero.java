import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Acerte_Numero {
    public static void main(String[] args) {

        double numero_aleatorio = Math.floor(Math.random() * 101);
        double numero;
        int contador = 0;
        int entrar;
        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        System.out.println("" + string.repeat(count));
        System.out.println("|Ola Seja Muito bem vindo ao nosso jogo.                                      |"); // 39
        System.out.println("|Nosso Jogo consiste em voce tentar adivinha um numero aleatorio entre 0 e 100|"); // 77

        Scanner input_entrar = new Scanner(System.in);
        System.out.println("|Deseja Jogar o Nosso Jogo ? 1- sim 2 - nao                                   |"); //42
        entrar = input_entrar.nextInt();

        while (entrar == 1) {

            System.out.println("" + string.repeat(count));
            Scanner input_numero = new Scanner(System.in);
            System.out.print("Chute um numero: ");
            numero = input_numero.nextInt();

            if (numero < numero_aleatorio) {
                System.out.println("Chutou Baixo!!! tente novamente");
                contador = contador + 1;
            }

            if (numero > numero_aleatorio) {
                System.out.println("Chutou Alto!!! tente novamente");
                contador = contador + 1;
            }

            if (numero == numero_aleatorio) {

                System.out.println("" + string.repeat(count));
                System.out.println("Parabens voce acertou o numero escondido!!!: ");
                System.out.printf("numero de tentativas foi de: " + contador + "\n");

                System.out.println("" + string.repeat(count));
                Scanner input_entrar2 = new Scanner(System.in);
                System.out.println("Deseja Jogar o Nosso Jogo novamente ? 1- sim 2 - nao ");
                entrar = input_entrar2.nextInt();
                System.out.println("" + string.repeat(count));

            }
        }

        System.out.println("Obrigador Por participar.");
    }
}
