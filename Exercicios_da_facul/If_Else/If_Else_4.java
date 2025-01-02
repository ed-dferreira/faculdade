package If_Else;
import java.util.Scanner;
public class If_Else_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imforme um numero inteiro");
        int num = scanner.nextInt();
        scanner.close();
        if ((num % 2 == 0) && (num % 3 == 0) && (num % 5 == 0)){
            System.out.println("É multiplo de 2, 3 e 5");
        } else {
            System.out.println("É multiplo de 2, 3 e 5");
        }
    }
}
/*
 * 4. Faça um algoritmo que receba um número inteiro e informe se ele é ou não
múltiplo de 2, 3 e 5 simultaneamente. (resolver usando pseudocódigo e Java)
 */