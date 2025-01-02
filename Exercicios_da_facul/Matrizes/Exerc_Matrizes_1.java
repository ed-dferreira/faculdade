package Matrizes;
public class Exerc_Matrizes_1 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz 5x5 com 1 na diagonal principal e 0 nos demais elementos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

/*
Exercício 1. Escreva um programa Java que declare uma matriz 5 x 5, preencha
com 1 a diagonal principal e com 0 os demais elementos e, ao final, mostre a matriz
obtida.
 */