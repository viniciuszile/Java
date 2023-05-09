import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        int condicao; //condicao que sera usada para entrar ou sair do loop while
        int n1 ; //priemiro numero que sera informado
        int n2; //segundo numero que sera informado
        int res; //resultado da conta entre o n1 e n2
        String tipo; //tipo de conta que o usuario ira escolher (+,-,/,*)
        
        String string="=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count=40; // numero de vezes que a o caractere -= sera reptido
        
        System.out.println(""+string.repeat(count));
      
        Scanner input_condicao = new Scanner(System.in);
        System.out.println("Deseja usar nossa calculadora ? 1- sim - 2- nao:");
        condicao = input_condicao.nextInt();
        System.out.println(""+string.repeat(count));

        
        while (condicao == 1) {
            
            Scanner input_n1 = new Scanner(System.in);
            System.out.printf("Informe o primeiro numero :");
            n1 = input_n1.nextInt();
            
            Scanner input_tipo = new Scanner(System.in);
            System.out.print("informe o tipo de conta (-,+,*,/):");
            tipo = input_tipo.nextLine();

            Scanner input_n2 = new Scanner(System.in);
            System.out.printf("Informe o segundo numero:");
            n2 = input_n2.nextInt();

            if(tipo.equals("+")){
                res = n1 + n2;
                
                System.out.printf("%s : %d %s","O resultado da conta é:",res,"\n");            
                System.out.println(""+string.repeat(count));            
            }

            if(tipo.equals("-")){
                res = n1 - n2;
                System.out.printf("%s : %d %s","O resultado da conta é:",res,"\n");
                System.out.println(""+string.repeat(count));                
            }
            if(tipo.equals("*")){
                res = n1 * n2;
                System.out.printf("%s : %d %s","O resultado da conta é:",res,"\n");
                System.out.println(""+string.repeat(count));            
            }                
            if(tipo.equals("/")){
                res = n1 / n2;
                System.out.printf("%s : %d %s","O resultado da conta é:",res,"\n");
                System.out.println(""+string.repeat(count));            
            } 
            
            Scanner input_condicao_2 = new Scanner(System.in);
            System.out.println("Deseja usar nossa calculadora novamente? 1- sim - 2- nao:");
            condicao = input_condicao_2.nextInt();
        }
        
        System.out.println("obrigado por usar nossa calculadora");
        
    }
}



