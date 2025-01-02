package For;
import java.util.Scanner;
public class Exerc_For_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int totalPar = 0;
        int totalImpar = 0;
        int mediaPar = 0;
        int mediaImpar = 0;
        System.out.println("Digite 20 numeros abaixo:");
        for (int i = 0; i < 20; i++){
            System.out.print("Numero: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("É par!");
                par ++;
                totalPar += num;
            } else {
                System.out.println("É impar!");
                impar ++;
                totalImpar += num;
            }
        }
        mediaPar = totalPar / par;
        mediaImpar = totalImpar / impar;
        System.out.println("Media dos pares: " + mediaPar);
        System.out.println("Media dos impares: " + mediaImpar);
        scanner.close();
    }
}
/*
 * Exercício 7. Faça um algoritmo para ler 20 números e escrever a média dos
números que são ímpares e dos números que são pares.
 */