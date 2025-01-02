package If_Else;
import java.util.Scanner;
public class If_Else_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro número real: ");
        double num1 = scanner.nextDouble();
        System.out.print("Segundo numero real: ");
        double num2 = scanner.nextDouble();
        System.out.print("Terceiro numero real: ");
        double num3 = scanner.nextDouble();
        scanner.close();
        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O maior é " + num1);
        } else if ((num2 > num1) && (num2 > num3)){
            System.out.println("O maior é " + num2);
        } else {
            System.out.println("O maior é " + num3);
        }
    }
}
/*
 * 5. Faça um algoritmo que receba três números reais e mostre apenas o maior
deles. (resolver usando pseudocódigo e Java)
 */