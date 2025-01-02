package For;
import java.util.Scanner;
public class Exerc_For_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero para a tabuada: ");
        int tabuada = scanner.nextInt();
        scanner.close();
        int multi = 0;
        for (int i = 1; i <= 10; i++){
            multi = tabuada * i;
            System.out.println(multi);
       }
    }
}
/*
 * Exercício 4. Faça um programa que apresente a tabuada de multiplicar de um
número qualquer.
 */