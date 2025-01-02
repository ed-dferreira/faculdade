package If_Else;
import java.util.Scanner;
public class If_Else_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros");
        System.out.print("Primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Opções de calculo:");
        System.out.println("Soma, aperte +");
        System.out.println("Subtração, aperte -");
        System.out.println("multiplicação, aperte *");
        System.out.println("Divisão, aperte /");
        char escolha = scanner.next().charAt(0);
        scanner.close();
        int resultado = 0;
        if (escolha == '+') {
            resultado = num1 + num2;
            System.out.println("A soma é: " + resultado);
        } else if (escolha == '-'){
            resultado = num1 - num2;
            System.out.println("A subtração é: " + resultado);
        } else if (escolha == '*'){
            resultado = num1 * num2;
            System.out.println("A multiplicação é: " + resultado);
        } else if (escolha == '/'){
            resultado = num1 / num2;
            System.out.println("A divisão é:" + resultado);
        } else {
            System.out.println("Operação invalida");
        }
    }
}
/*
 * 6. Faça um algoritmo que receba dois números inteiros e um caractere. Se o
caractere recebido for ‘ + ’, os números devem ser somados e o resultado mostrado.
Se o caractere recebido for ‘ – ’, os segundo número deve ser subtraído do primeiro e
o resultado mostrado. Se o caractere recebido for ‘ * ’, os números devem ser
multiplicados e o resultado mostrado. Se o caractere recebido for ‘ / ’, o primeiro
número deve ser dividido pelo primeiro e o resultado mostrado. Se qualquer outro
caractere for recebido, deve ser mostrado “Operação inválida”. (resolver usando
pseudocódigo e Java)
 */