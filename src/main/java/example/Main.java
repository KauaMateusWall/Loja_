package example;

import example.model.Pedido;
import example.model.Produto;
import example.service.loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static example.service.loja.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();
        String menu;


        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Criar Pedido");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Listar Pedidos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            menu = scanner.nextLine();

            switch (menu) {
                case "1": {
                    AdicionarProduto(scanner, produtos);
                    break;
                }
                case "2": {
                    AdicionarPedido(scanner, produtos, pedidos);
                }
                break;

                case "3": {
                    ListarProdutos(produtos);
                    break;
                }
                case "4": {
                    ListarPedidos(pedidos);
                    break;
                }
                case "5": {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        } while (!menu.equals("5"));
    }
}



