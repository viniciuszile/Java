package com.mycompany.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zile
 *
 *
 */
import javax.swing.*;

public class Conexao {
    

    public static void main(String[] args) {
        

        long cpf;
        int escolha;

        Scanner input = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
        System.out.println("|seja bem vindo a conexao com o banco de dados.              |");
        System.out.println("|Digite 1 para acessar as informações dos nossos clientes.   |");
        System.out.println("|Digite 2 para cadastrar um cliente no nosso banco de dados. |");
        System.out.println("|Digite 3 para deletar um cliente no nosso banco.            |");
        System.out.println("|Digite 4 para atualizar um cliente em nosso banco de dado.  |");
        System.out.println("|Digite 5 para sair.                                         |");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
        escolha = input.nextInt();

        while (escolha != 5) {
            if (escolha == 1) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/zile", "root", "");
                    ResultSet rsexemplo = conexao.createStatement().executeQuery("SELECT * FROM exemplo");

                    while (rsexemplo.next()) {
                        System.out.println("nome: " + rsexemplo.getString("nome") + " - " + ("idade: " + rsexemplo.getInt("idade") + " - " + ("cpf: " + rsexemplo.getLong("CPF") + "\n")));
                    }

                } catch (ClassNotFoundException ex) {
                    System.out.println("Driver nao encontrado");
                } catch (SQLException ex) {
                    System.out.println("erro de conexao com o banco" + ex.getMessage());
                }
            } else if (escolha == 2) {
                System.out.println("Digite o nome do cliente:");
                String nome = input.next();
                System.out.println("Digite a idade do cliente:");
                int idade = input.nextInt();
                System.out.println("Digite o CPF do cliente:");
                cpf = input.nextLong();

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/zile", "root", "");
                    String consulta = "INSERT INTO exemplo (nome, idade, cpf) VALUES ('" + nome + "', " + idade + ", " + cpf + ")";
                    conexao.createStatement().executeUpdate(consulta);
                    System.out.println("Cliente cadastrado com sucesso!");

                } catch (ClassNotFoundException ex) {
                    System.out.println("Driver nao encontrado");
                } catch (SQLException ex) {
                    System.out.println("Erro de conexao com o banco" + ex.getMessage());
                }
            } else if (escolha == 3) {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/zile", "root", "");
                    ResultSet rsexemplo = conexao.createStatement().executeQuery("SELECT * FROM exemplo");

                    while (rsexemplo.next()) {
                        System.out.println("nome: " + rsexemplo.getString("nome") + " - " + ("idade: " + rsexemplo.getInt("idade") + " - " + ("cpf: " + rsexemplo.getLong("CPF") + "\n")));
                    }

                    System.out.println("Digite o CPF do cliente que deseja excluir:");
                    cpf = input.nextLong();

                    String consulta = "DELETE FROM exemplo WHERE cpf = " + cpf;
                    int linhasAfetadas = conexao.createStatement().executeUpdate(consulta);

                    if (linhasAfetadas > 0) {
                        System.out.println("Cliente excluído com sucesso!");
                    } else {
                        System.out.println("Nenhum cliente encontrado com o CPF informado.");
                    }

                } catch (ClassNotFoundException ex) {
                    System.out.println("Driver nao encontrado");
                } catch (SQLException ex) {
                    System.out.println("Erro de conexao com o banco" + ex.getMessage());
                }
            } else if (escolha == 4) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/zile", "root", "");
                    ResultSet rsexemplo = conexao.createStatement().executeQuery("SELECT * FROM exemplo");

                    while (rsexemplo.next()) {
                        System.out.println("nome: " + rsexemplo.getString("nome") + " - " + ("idade: " + rsexemplo.getInt("idade") + " - " + ("cpf: " + rsexemplo.getLong("CPF") + "\n")));
                    }

                    System.out.println("Digite o CPF do cliente que deseja atualizar:");
                    cpf = input.nextLong();
                    String consulta = "SELECT * FROM exemplo WHERE cpf = " + cpf;
                    ResultSet resultado = conexao.createStatement().executeQuery(consulta);

                    if (resultado.next()) {
                        System.out.println("Nome atual: " + resultado.getString("nome"));
                        System.out.println("Idade atual: " + resultado.getInt("idade"));

                        System.out.println("Digite o novo nome:");
                        String novoNome = input.next();

                        System.out.println("Digite a nova idade:");
                        int novaIdade = input.nextInt();

                        consulta = "UPDATE exemplo SET nome = '" + novoNome + "', idade = " + novaIdade + " WHERE cpf = " + cpf;
                        int linhasAfetadas = conexao.createStatement().executeUpdate(consulta);

                        if (linhasAfetadas > 0) {
                            System.out.println("Cliente atualizado com sucesso!");
                        } else {
                            System.out.println("Nenhum cliente encontrado com o CPF informado.");
                        }
                    } else {
                        System.out.println("Nenhum cliente encontrado com o CPF informado.");
                    }

                } catch (ClassNotFoundException ex) {
                    System.out.println("Driver nao encontrado");
                } catch (SQLException ex) {
                    System.out.println("Erro de conexao com o banco" + ex.getMessage());
                }
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            System.out.println("|seja bem vindo a conexao com o banco de dados.              |");
            System.out.println("|Digite 1 para acessar as informações dos nossos clientes.   |");
            System.out.println("|Digite 2 para cadastrar um cliente no nosso banco de dados. |");
            System.out.println("|Digite 3 para deletar um cliente no nosso banco.            |");
            System.out.println("|Digite 4 para atualizar um cliente em nosso banco de dado.  |");
            System.out.println("|Digite 5 para sair.                                         |");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            escolha = input.nextInt();
        }
        System.out.println("Obrigado por usar nosso programa!!!");

    }
}
