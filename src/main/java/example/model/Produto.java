package example.model;

public class Produto {
    private int idProduto;
    private int quantidadeProduto;
    private String nomeProduto;
    private double preco;

    public Produto(int idProduto, int quantidadeProduto, String nomeProduto, double preco) {
        this.idProduto = idProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nProduto:" + '\n' +
                "ID do Produto=" + idProduto  + '\n' +
                " Quantidade_Produto=" + quantidadeProduto + '\n' +
                " Nome do Produto='" + nomeProduto + '\'' + '\n' +
                " Preço=" + preco + '\n';
    }
}

