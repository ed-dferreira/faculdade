package For;
import java.util.Scanner;
public class Exerc_For_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero para a tabuada: ");
        int numTabuada = scanner.nextInt();
        scanner.close();
        int soma = 0;
        for (int i = 1; i <= 10; i++){
            soma = numTabuada + i;
            System.out.println(soma);
       }
    }
}
/*
 * Exercício 5. Faça um programa que apresente a tabuada de soma de um número
qualquer.
 */