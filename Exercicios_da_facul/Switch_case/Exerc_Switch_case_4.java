package Switch_case;
import java.util.Scanner;
public class Exerc_Switch_case_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();
        System.out.println("Digite o código de pagamento (1 para à vista, 2 para duas vezes, 3 para três vezes, 4 para 4 a 6 vezes):");
        int codigoPagamento = scanner.nextInt();
        double valorParcela = 0;
        int numeroPrestacoes = 1;
        switch (codigoPagamento) {
            case 1:
                valorParcela = precoProduto * 0.7; // 30% de desconto
                break;
            case 2:
                valorParcela = precoProduto * 0.5; // 20% de desconto
                numeroPrestacoes = 2;
                break;
            case 3:
                valorParcela = precoProduto * 0.9; // 10% de desconto
                numeroPrestacoes = 3;
                break;
            case 4:
                valorParcela = precoProduto / 4; // Sem desconto
                numeroPrestacoes = 4;
                break;
            default:
                System.out.println("Código de pagamento inválido.");
        }
        scanner.close();
        System.out.println("Número de prestações: " + numeroPrestacoes);
        System.out.println("Valor de cada prestação: " + valorParcela);
    }

}

/*
Exercício 4. Desenvolva, em Linguagem Java, um programa que solicite ao usuário o
preço de um produto e o código relativo à forma de pagamento. De acordo com a tabela
dada abaixo, deve ser aplicado o desconto especificado e o programa deve exibir o
número de prestações e o valor de cada prestação a ser paga:
Forma de Pagamento Código Desconto em cada parcela
À vista (parcela única) 1 30%
Em duas vezes 2 20%
Em três vezes 3 10%
De 4 a 6 vezes 4 Sem desconto
 */