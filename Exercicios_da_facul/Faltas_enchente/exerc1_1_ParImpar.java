package Faltas_enchente;
import java.util.Scanner;
public class exerc1_1_ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int somaImpar = 0;
        int mediaImpar = 0;
        int somaPar = 0;
        int vetor[]= new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor inteiro: ");
            int valor = scanner.nextInt();
            vetor[i] = valor;
            if (vetor[i] % 2 == 0) {
                somaPar += vetor[i];
                par ++;
            } else {
                impar ++;
                somaImpar += vetor[i];
            }
        }
        mediaImpar = somaImpar / impar;
        System.out.println("quantidade de numeros pares: " + par + ". E de numeros impares:" + impar);
        System.out.println("Soma dos numeros pares:" + somaPar);
        System.out.println("Media dos numeros impares:" + mediaImpar);
        scanner.close();
    }
        
}
