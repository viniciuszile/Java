
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zile
 */
public class Exercicio_15 {

    public static int potencia(int x, int y) {
        int resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("informe o valor da base: ");
        int x = scan.nextInt();
        
        System.out.println("informe o valor do expoente: ");
        int y = scan.nextInt();
        
        int resultado = potencia(x,y);
        
        System.out.println("o valor da potencia é de: " + resultado);
    }
}
