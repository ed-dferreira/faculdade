package Matrizes;
import java.util.Random;
public class Exerc_Matrizes_Random {
    public static boolean verificarRep(int[][] cartela, int num, int linha, int coluna) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < linha || (i == linha && j < coluna)) {
                    if (cartela[i][j] == num) {
                        return true; //achou algum repetido
                    }
                }
            }
        }
        return false; // o numero não repitiu então bye
    }
    public static void main(String[] args) {
        Random random = new Random();
        int cartela[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numAleatorio;
                boolean numeroRepetido;
                do {
                    numAleatorio = random.nextInt(100);
                    numeroRepetido = verificarRep(cartela, numAleatorio, i, j);
                } while (numeroRepetido);
                cartela[i][j] = numAleatorio;
            }
        }
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "\t"); // sem esse "\t" o print da matriz vira uma zona
            }
            System.out.println();
        }
    }
}