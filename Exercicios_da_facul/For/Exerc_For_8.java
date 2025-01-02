package For;
import java.util.Scanner;
public class Exerc_For_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quadrado = 0;
        System.out.println("Digite 20 numeros abaixo:");
        for (int i = 0; i < 20; i++){
            System.out.print("Numero: ");
            int num = scanner.nextInt();
            if (num * num <= 200){
                quadrado += num;
            }
        }
        System.out.print("A soma dos numeros cujos valores do quadrados menores que 200." + quadrado);
        scanner.close();
    }
}
/*
 * Exercício 8. Faça um algoritmo que leia 20 números e imprimir a soma dos
números cujos valores do quadrado dos números são menores que 200.
 */