package example.service;

import example.model.Pedido;
import example.model.Produto;

import java.util.List;
import java.util.Scanner;

public class loja {
    private static int autoIncremento = 0;

    public static void AdicionarProduto(Scanner scanner, List<Produto> produtos) {
        autoIncremento++;
        System.out.println("Adicionar o nome do produto:");
        String nomeProduto = scanner.nextLine();
        System.out.println("Adicionar a quantidade do produto:");
        int quantidadeProduto = scanner.nextInt();
        System.out.println("Adicionar o preço do produto:");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(autoIncremento, quantidadeProduto, nomeProduto, precoProduto);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso:");
        System.out.println(produto);
        return;
    }
    public static void AdicionarPedido(Scanner scanner, List<Produto> produtos, List<Pedido> pedidos) {
        System.out.println("Qual é o seu nome:");
        String nomeCliente = scanner.nextLine();

        Pedido novoPedido = new Pedido(nomeCliente);
        while (true) {
            System.out.println("Produtos disponíveis:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNomeProduto() + " | ID: " + produto.getIdProduto());
            }
            System.out.print("ID do produto (ou 0 para finalizar): ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (id == 0) {
                break;
            }

            Produto produtoEncontrado = null;
            for (Produto produto : produtos) {
                if (produto.getIdProduto() == id) {
                    produtoEncontrado = produto;
                    break;
                }
            }

            if (produtoEncontrado != null) {
                novoPedido.adicionarProduto(produtoEncontrado);
                System.out.println("Produto adicionado ao pedido.");
            } else {
                System.out.println("Produto com o ID " + id + " não encontrado.");
            }
        }

        pedidos.add(novoPedido);
        System.out.println("Pedido registrado com sucesso para o cliente: " + nomeCliente);
        System.out.println("Produtos no pedido: " + novoPedido.getProdutos());
    }

    public static void ListarProdutos(List<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void ListarPedidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            System.out.println(pedidos);
        }
    }

}




