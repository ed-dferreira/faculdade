package While_DoWhile;
import java.util.Scanner;
public class Exerc_While_5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        System.out.println("Digite as notas entre 0.0 e 10.0:");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota < 0) {
                break;
            }
            if (nota >= 0 && nota <= 10){
                soma = soma + nota;
                quantidade++;
            } else {
                System.out.println("Nota inválida. Digite novamente.");
            }
        }
        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A mé4dia das notas válidas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }
        scanner.close();
    }
}
/*
Exercício 5. Faça um programa que leia notas entre 0.0 e 10.0 até que seja
informada uma nota menor que 0.0. Se uma nota maior que 10.0 for informada, o
programa deve ignorar essa nota. Finalmente, o programa deve calcular a média
aritmética simples das notas válidas recebidas (ignorando as notas inválidas e a
nota menor que zero informada por último) depois de receber um nota negativa.   
 */