/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

import java.util.Scanner;

/**
 *
 * @author Zile
 */
public class Personagem {

    public static void main(String[] args) {
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Variaveis ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        String jogar = ""; // variavel que salva a decisao de jogar ou nao(condicao while)

        String nome = ""; // variavel que salva o nome do jogador
        int confirma_nome = 0; // variavel que confrima a escolha do nome

        String classe = ""; //variavel que salva a classe do jogador
        int confirma_classe = 0; // variavel que confrima a escolha da classe

        String descricao = ""; //variavel guarda a descricao da classe

        String barra = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario

        String situacao1_p1 = "";
        String situacao2_p1 = "";

        String situacao1_p2 = "";

        String situacao1_p3 = "";

        String situacao1_p5 = "";
        String situacao2_p5 = "";

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção Variaveis ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Menu ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\        
        Scanner input_menu = new Scanner(System.in); //Scanner reservado para o menu

        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");;
        System.out.println("|       Seja bem vindo ao nosso RPG!!       |");
        System.out.println("|       Selecione uma das opções.           |");
        System.out.println("|       Aperte qualquer tecla para jogar    |");
        System.out.println("|       Digite não para sair.               |");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");
        jogar = input_menu.nextLine();
        jogar = jogar.toLowerCase();

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção menu ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\    
        while (!"nao".equals(jogar) && !"n".equals(jogar) && !"não".equals(jogar)) { // inicio do jogo

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Criar Personagem ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\  
            Scanner input_personagem = new Scanner(System.in); // scanner reservado para as informações do jogador nome,classe,etc...

            while (confirma_nome != 1) {
                Scanner scanner_verifica_nome = new Scanner(System.in);
                System.out.println("" + barra.repeat(25));
                System.out.println("Vamos criar o seu personagem, Digite o seu nome:");
                nome = input_personagem.nextLine();

                System.out.printf("seu nome é " + nome + " ? (1- sim 2- nao)");

                while (!scanner_verifica_nome.hasNextInt()) {;
                    System.out.println("" + barra.repeat(25));
                    System.out.println("Entrada inválida! Digite 1- para sim ou 2- para nao");
                    scanner_verifica_nome.next(); // limpa a entrada inválida
                }

                confirma_nome = scanner_verifica_nome.nextInt();

                if (confirma_nome == 2) {
                    System.out.println("Sem Problemas.");
                } else if (confirma_nome == 1) {
                    System.out.printf("ola " + nome + " :) \n");
                } else {
                    System.out.println("ERror, resposta invalida tente novamente.");
                }
            };

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ escolher classe ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\  
            while (confirma_classe != 1) {
                Scanner input_classe = new Scanner(System.in);
                Scanner scanner_verifica_classe = new Scanner(System.in); // scanner responsavel para verificar se o usuario informara um numero inteiro

                System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");;
                System.out.println("|       Escolha sua classe!!                |");
                System.out.println("|       1- Guerreiro.                       |");
                System.out.println("|       2- Mago.                            |");
                System.out.println("|       3- Arqueiro.                        |");
                System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");

                while (!scanner_verifica_classe.hasNextInt()) {;
                    System.out.println("Entrada inválida! Digite um número entre 1 e 3. ");
                    scanner_verifica_classe.next(); // limpa a entrada inválida
                }
                int escolha_classe = scanner_verifica_classe.nextInt();

                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ escolher classe ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ confirmar classe ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
                if (escolha_classe == 1) {
                    classe = "Guerreiro";
                    descricao = " Um guerreiro pode ser uma escolha sólida para jogadores que gostam de combate corpo a corpo e de causar grandes quantidades de dano. \n"
                            + "Eles são resistentes e capazes de usar várias armas e armaduras.";

                } else if (escolha_classe == 2) {
                    classe = "Mago";
                    descricao = " Um mago pode ser uma escolha poderosa para jogadores que gostam de conjurar magia e causar grandes danos de longe. \n"
                            + "Eles também podem curar aliados e manipular o ambiente.";
                } else if (escolha_classe == 3) {
                    classe = "Arqueiro";
                    descricao = "Arqueiro: Um arqueiro é um especialista em combate a distância que usa um arco e flechas para atacar seus inimigos com precisão. \n"
                            + "Eles são ágeis e podem se mover rapidamente pelo campo de batalha, tornando-se difíceis de atingir.";
                } else {
                    System.out.println("ERror, resposta invalida tente novamente.");
                }

                if (escolha_classe == 1 || escolha_classe == 2 || escolha_classe == 3) {

                    System.out.println("" + barra.repeat(30));
                    System.out.printf("Voce escolheu a classe " + classe + "," + descricao + "\n");
                    System.out.printf("Voce é " + nome + " o " + classe + "? (1- sim 2- não)\n");

                    while (!scanner_verifica_classe.hasNextInt()) {;
                        System.out.println("Entrada inválida! Digite um número entre 1 e 3. ");
                        scanner_verifica_classe.next(); // limpa a entrada inválida
                    }
                    confirma_classe = scanner_verifica_classe.nextInt();

                    if (confirma_classe == 2) {
                        System.out.println("Sem Problemas.");
                    } else if (escolha_classe != 1 && escolha_classe != 2) {
                        System.out.println("ERror, resposta invalida tente novamente.");
                    }
                }

                jogar = "nao";
                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ confirma classe ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
            }

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção Criar Personagens ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\    
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

        Scanner input_historia = new Scanner(System.in);
        System.out.println("" + barra.repeat(30));
        System.out.println("Espero que esteja preparado para finalmente começar o nosso RPG!!!");
        System.out.println("Pressione enter para iniciar o nosso jogo.");
        String comecar = input_historia.nextLine();

        if (classe.equals("Guerreiro")) {
            situacao1_p1 = "informações sobre uma espada lendaria de Excalibur a lendária espada do Rei Arthur, que segundo a lenda, \nfoi forjada em uma ilha mística e concedia poderes mágicos ao seu portador.\n";
            situacao2_p1 = "depois de vagar por horas pela vila, dentro de uma taverna ele comprou um mapa que supostamente daria informaçoes sobre a tal espada,\nporem repentinamente goblins atacaram a taverna.";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o mapa da espada Excalibur e fugido para dentro \nde "
                    + "uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros em uma destas pilhas voce avista o seu mapa roubado.\n";

            situacao1_p5 = "o tesouro encontrado na caverno junto do seu mapa";
            situacao2_p5 = "da lendaria espada Excalibur, porem agora com o mapa em mãos.";

        } else if (classe.equals("Mago")) {
            situacao1_p1 = "informções sobre o lendario livro de Grimoire of Armadel um livro de magia cerimonial escrito\nno século XVII que inclui invocações de anjos e demônios, existem um total de 3 livros.\n";
            situacao2_p1 = "depois de vagar horas pela vila, dentro de uma bilbioteca antiga ele encontrou um livro com certas infomações sobre o livro, porem repentinamente\ngoblins atacaram a biblioteca.\n";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o lendario livro de Grimoire of Armadel e fugido\n"
                    + "para dentro de uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros, em uma destas pilhas voce avista o seu livro roubado.\n";

            situacao1_p5 = "o tesouro encontrado na caverno junto do seu livro";
            situacao2_p5 = "dos lendarios livros de Grimoire of Armadel, agora faltam apenas 2 livros para ele completar seu objetivo.";

        } else if (classe.equals("Arqueiro")) {
            situacao1_p1 = "informações sobre o lendario arco The Full Moon Bow é feito de madeira da árvore mais antiga\n"
                    + "da floresta e é capaz de aumentar a precisão do arqueiro sob a luz da lua cheia. Diz-se que foi criada por um arqueiro excepcionalmente habilidoso que aprimorou sua técnica de tiro com arco\n"
                    + "ao longo de toda a sua vida.";

            situacao2_p1 = "depois de vagar por horas pela vila, ele chegou no armeiro da vila ele encontrou o mapa que supostamente levaria ele\n"
                    + "ao lendario arco, porem repentinamente goblins atacaram o armeiro.";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o mapa do arco lendário The Full Moon Bow e fugido\n"
                    + "para dentro de uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros, em uma destas pilhas voce avista o seu mapa roubado.\n";

            situacao1_p5 = "lendario arco lendário The Full Moon Bow,porem agora com o mapa em mãos.";
            situacao2_p5 = "do lendario arco da lua, porem agora com o mapa em mãos.";
        }

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 1 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Era uma vez um aventureiro solitário chamado " + nome + ", que vagava pelas estradas em busca de " + situacao1_p1 + " Ele havia chegado a pequena vila de Stonehill, "
                + "" + situacao2_p1 + " " + nome + ", com seu instinto de herói, rapidamente se juntou aos habitantes da vila para enfrentar os invasores.");
        comecar = input_historia.nextLine();
        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com goblins↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 2 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Depois de uma batalha árdua, " + nome + " e os habitantes da vila conseguiram derrotar os goblins. Porém " + situacao1_p2 + "a vitória foi amarga mas com a ajuda dos habitantes da vila " + nome + " descobriram que os goblins "
                + "foram enviados por um troll temível que protegia a entrada de uma caverna misteriosa que\n"
                + "ficava floresta a dentro.");
        System.out.println("\n");

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 3 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("" + nome + " entao explorou a floresta em busca da tal caverna que o troll protegia, depois de uma longa caminhada floresta a dentro " + nome + " avistou goblins junto de um enorme troll\n"
                + "levando " + situacao1_p3 + "curioso em saber quais mais tesouros o troll guardava dentro daquela misteriosa caverna,voce decide enfrentalo para recuperar seus itens roubados e descobrir\n"
                + "quais segredos a caverna guarda.");
        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com troll↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 4 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Depois de uma das batalhas mais épicas de sua vida," + nome + " não imaginava o que o aguardava dentro da caverna. Após descansar e se recuperar dos ferimentos por algumas horas, " + nome + " decide finalmente\n"
                + "entrar na caverna. Conforme avança, o ar vai ficando mais quente e escasso. Um dos diversos caminhos da caverna chama sua atenção está repleto de tesouros completamente derretidos.\n"
                + "Isso parece muito estranho e" + nome + "começa a seguir a trilha que os tesouros formam. No final da trilha, ele encontra algo incrível: um terrível e enorme dragão deitado sobre uma montanha\n"
                + "de ouro e tesouros. Rapidamente, o dragão avista " + nome + " e parte para cima dele. Não há escapatória você terá que enfrentar o terrível dragão.");
        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com o dragao↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \

        System.out.println("Com " + situacao1_p5 + " " + nome + " retornou à vila de Stonehill e como forma de agradecimento " + nome + " entrega todo o tesouro encontrado,\n"
                + "na caverna junto da cabeça do dragão deixando todos habitantes agradecidos. Sua coragem e dedicação tornaram-no um herói na vila, e sua fama se espalhou por todo o reino. " + nome + " continuou\n"
                + "sua jornada em busca " + situacao2_p5 + " ,mas a lembrança de sua vitória contra os goblins, o troll e o dragão permaneceu viva em sua memória para sempre.");

        System.out.println(
                "" + barra.repeat(21));
        System.out.println(
                "| Confira o Github dos nossos Devs       |");
        System.out.println(
                "| viniciuszile                           |");
        System.out.println(
                "| janainaacosta                          |");
        System.out.println(
                "| wesleww                                |");
        System.out.println(
                "| RodrigoAnjos2004                       |");
        System.out.println(
                "| Obrigado por Entrar no nosso jogo!!    |");
        System.out.println(
                "" + barra.repeat(21));
    }
}
