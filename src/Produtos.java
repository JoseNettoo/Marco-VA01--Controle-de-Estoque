public class Produtos {
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public int quantidadeVendida;

    public Produtos(String nome, double preco, int quantidadeEmEstoque, int quantidadeVendida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.quantidadeVendida = quantidadeVendida;
    }

    public int saldoNoEstoque(int quantidadeEmEstoque) {
        return saldoNoEstoque()-=quantidadeEmEstoque ;
    }

    public int quantidadeVendida(int vendidos) {
        return quantid-=vendidos;
    }
}
