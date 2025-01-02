package ExerciciosPreProvaPoo1.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após nextInt()

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Cadastro do Produto " + (i + 1));

            System.out.print("Nome do Produto: ");
            String nome = scanner.nextLine(); // Agora este vai funcionar corretamente

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer novamente

            Produto produto = new Produto(nome, quantidade, preco);
            estoque.add(produto);
        }

        System.out.println("\nProdutos em estoque:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
