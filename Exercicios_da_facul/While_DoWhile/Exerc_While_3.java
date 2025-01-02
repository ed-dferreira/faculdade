package While_DoWhile;
import java.util.Scanner;
public class Exerc_While_3 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Impressão de quadrados, digite quantos numeros inteiros desejar;");
        System.out.println("Quando digitar 0 o programa encerra.");
        int resultado = 0;
        int numInt = 0;
            while (true) {
                System.out.println("Digite um número inteiro:");
                numInt = scanner.nextInt();
                 if (numInt == 0){
                   break;
                }
                resultado = numInt*numInt;
                System.out.println(resultado);
            }
        scanner.close();
    }
    
}
/*
 * Exercício 3. Faça um programa que leia números inteiros e escreva o quadrado do
número até que o usuário informe zero.
Por exemplo:
Informe um número inteiro ou zero para sair: 3
O quadrado de 3 é 9
Informe um número inteiro ou zero para sair: 4
O quadrado de 4 é 16
Informe um número inteiro ou zero para sair: 0
 */