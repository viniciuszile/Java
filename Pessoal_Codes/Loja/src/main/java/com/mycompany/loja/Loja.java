package com.mycompany.loja;

import java.sql.*;
import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/loja";
        String user = "root";
        String password = "";
        Scanner input = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conexão realizada com sucesso!");
            Connection conn = DriverManager.getConnection(url, user, password);

            // Menu principal
            int opcao = 0;
            while (opcao != 2) {
                System.out.println("\nMenu principal");
                System.out.println("1. Registrar venda");
                System.out.println("2. Sair");

                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o ID do cliente:");
                        int idCliente = input.nextInt();

                        // Verifica se o cliente existe
                        String sql = "SELECT * FROM clientes WHERE idcliente = ?";
                        PreparedStatement stmt = conn.prepareStatement(sql);
                        stmt.setInt(1, idCliente);
                        ResultSet rs = stmt.executeQuery();

                        if (!rs.next()) {
                            System.out.println("Cliente não encontrado.");
                            break;
                        }

                        System.out.println("Digite o ID do produto:");
                        int idProduto = input.nextInt();

                        // Verifica se o produto existe
                        sql = "SELECT * FROM produtos WHERE idproduto = ?";
                        stmt = conn.prepareStatement(sql);
                        stmt.setInt(1, idProduto);
                        rs = stmt.executeQuery();

                        if (!rs.next()) {
                            System.out.println("Produto não encontrado.");
                            break;
                        }

                        System.out.println("Digite a quantidade:");
                        int quantidade = input.nextInt();

                        // Verifica se a quantidade é suficiente
                        int quantidadeDisponivel = rs.getInt("quantidade_produto");
                        if (quantidade > quantidadeDisponivel) {
                            System.out.println("Quantidade insuficiente.");
                            break;
                        }

                        // Atualiza a quantidade do produto
                        sql = "UPDATE produtos SET quantidade_produto = ? WHERE idproduto = ?";
                        stmt = conn.prepareStatement(sql);
                        stmt.setInt(1, quantidadeDisponivel - quantidade);
                        stmt.setInt(2, idProduto);
                        stmt.executeUpdate();

                        // Insere a venda na tabela nota
                        sql = "INSERT INTO nota (total, id_cliente, id_produto) VALUES (?, ?, ?)";
                        stmt = conn.prepareStatement(sql);
                        stmt.setDouble(1, quantidade * rs.getDouble("preco_produto"));
                        stmt.setInt(2, idCliente);
                        stmt.setInt(3, idProduto);
                        stmt.executeUpdate();

                        System.out.println("Venda registrada com sucesso!");
                        break;

                    case 2:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }

            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
