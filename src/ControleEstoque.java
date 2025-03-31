import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidadeEmEstoque = scanner.nextInt();

        System.out.println("\nInformações do produto antes da venda:");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);

        System.out.print("\nDigite a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        if (quantidadeVendida > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidadeEmEstoque -= quantidadeVendida;
        }

        System.out.println("\nInformações do produto após a venda:");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);

        scanner.close();
    }
}
