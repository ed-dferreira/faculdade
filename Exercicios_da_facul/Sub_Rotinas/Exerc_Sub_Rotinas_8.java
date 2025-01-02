package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_8 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Escreva o primeiro número inteiro: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int soma = calcularSomatorio(num1, num2);
        System.out.println("Entre os números" + num1 + " e " + num2);
        System.out.println("A soma é: " + soma);
    }
    public static int calcularSomatorio (int num1, int num2){
        int soma = 0;
        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++){
            soma += i;
        }
        return soma; 
        }
    }
/*
 * 8. Faça um programa em Java que receba do usuário dois números inteiros e
invoque uma sub-rotina chamada “calcularSomatorio”. Em seguida, crie a sub-rotina
indicada que possui dois parâmetros (os números inteiros) e que retorne um número
inteiro. Essa sub-rotina deve calcular a soma de todos os números inteiros existentes
entre os números passados como parâmetro e retornar o resultado dessa soma.
Por exemplo: se os parâmetros forem 2 e 6, a sub-rotina deve calcular 2+3+4+5+6 e
retornar 20.
 */