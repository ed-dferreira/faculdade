package If_Else;
import java.util.Scanner;
public class If_Else_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro:");
        int num = scanner.nextInt();
        scanner.close();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
/*
 * 3. Faça um algoritmo que receba um número inteiro e informe se ele é par ou
ímpar. (resolver usando fluxograma, pseudocódigo e Java)
 */