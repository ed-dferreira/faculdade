package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vendas[][] = new int[12][4];
        int vendasJaneiro = 0;
        int vendasFevereiro = 0;
        int vendasMarço = 0;
        int vendasAbril = 0;
        int vendasMaio = 0;
        int vendasJunho = 0;
        int vendasJulho = 0;
        int vendasAgosto = 0;
        int vendasSetembro = 0;
        int vendasOutubro = 0;
        int vendasNovembro = 0;
        int vendasDezembro = 0;

        int vendas1Semana = 0;
        int vendas2Semana = 0;
        int vendas3Semana = 0;
        int vendas4Semana = 0;

        int totalAno = 0;

        System.out.println("A coluna representa os meses e a linha as semanas!");
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Digite o valor de vandas na coluna : [" + i + "] e linha: [" + j + "]");
                vendas[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                switch (i) {
                    case 1:
                        vendasJaneiro =+ vendas[i][j];
                        break;
                    case 2:
                        vendasFevereiro =+ vendas[i][j];
                        break;
                    case 3:
                        vendasMarço =+ vendas[i][j];
                        break;
                    case 4:
                        vendasAbril =+ vendas[i][j];
                        break;
                    case 5:
                        vendasMaio =+ vendas[i][j];
                        break;
                    case 6:
                        vendasJunho =+ vendas[i][j];
                        break;
                    case 7:
                        vendasJulho =+ vendas[i][j];
                        break;
                    case 8:
                        vendasAgosto =+ vendas[i][j];
                        break;
                    case 9:
                        vendasSetembro =+ vendas[i][j];
                        break;
                    case 10:
                        vendasOutubro =+ vendas[i][j];
                        break;
                    case 11:
                        vendasNovembro =+ vendas[i][j];
                        break;
                    case 12:
                        vendasDezembro =+ vendas[i][j];
                        break;
                    default:
                        break;
                }
            }
        }    
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                switch (j) {
                    case 1:
                        vendas1Semana =+ vendas[i][j];
                        break;
                    case 2:
                        vendas2Semana =+ vendas[i][j];
                        break;
                    case 3:
                        vendas3Semana =+ vendas[i][j];
                        break;
                    case 4:
                        vendas4Semana =+ vendas[i][j];
                        break;
                    default:
                        break;
                }
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                totalAno =+ vendas[i][j];
            }
        }
        System.out.println("Total vendido a cada mês do ano:");
        System.out.println("Janeiro: " + vendasJaneiro);
        System.out.println("Fevereiro: " + vendasFevereiro);
        System.out.println("Março: " + vendasMarço);
        System.out.println("Abril: " + vendasAbril);
        System.out.println("Maio: " + vendasMaio);
        System.out.println("Junho: " + vendasJunho);
        System.out.println("Julho: " + vendasJulho);
        System.out.println("Agosto: " + vendasAgosto);
        System.out.println("Setembro: " + vendasSetembro);
        System.out.println("Outubro: " + vendasOutubro);
        System.out.println("Novembro: " + vendasNovembro);
        System.out.println("Dezembro: " + vendasDezembro);
        System.out.println();
        System.out.println("Total vendido em cada semana do ano:");
        System.out.println("Primeira semana: " + vendas1Semana);
        System.out.println("Segunda semana: " + vendas2Semana);
        System.out.println("Terceira semana: " + vendas3Semana);
        System.out.println("Quarta semana: " + vendas4Semana);
        System.out.println();
        System.out.println("Total vendido no ano inteiro: " + totalAno);
        scanner.close();
    }
}
/*
 * Exercício 11. Escreva um programa Java que leia uma matriz 12 x 4 com os valores
das vendas de uma loja, em que cada linha represente um mês do ano, e cada
coluna, uma semana do mês. Calcule e imprima:
● Total vendido em cada mês do ano;
● Total vendido em cada semana durante todo o ano;
● Total vendido no ano.
 */