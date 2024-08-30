package example.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Produto> produtos;
    private static int contadorPedidos = 1;
    private int idPedido;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
        this.idPedido = contadorPedidos++;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    @Override
    public String toString() {
        return "\nPedido:" + '\n' +
                "Nome do cliente='" + nomeCliente + '\n' +
                "Nome do produto=" + produtos + '\n' +
                "ID do pedido=" + idPedido + '\n';
    }
}

