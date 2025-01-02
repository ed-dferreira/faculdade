package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int nun1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int nun2 = scanner.nextInt();
        System.out.print("Terceiro numero: ");
        int nun3 = scanner.nextInt();
        System.out.println("Os numeros iniciais são: " + nun1 + " " + nun2 + " "+ nun3);
        scanner.close();
        int maiorNun = qualMaior(nun1, nun2, nun3);
        System.out.print("Maior numero é: " + maiorNun);
    }
    public static int qualMaior (int nun1, int nun2, int nun3){
        int maior = 0;
        if (nun1 >= nun2 && nun1 >= nun3) {
            maior = nun1;
        } else if (nun2 >= nun1 && nun2 >= nun3) {
            maior = nun2;
        } else {
            maior = nun3;
        }
        return maior;
    }
} 
/*
 * 7. Faça um programa em Java que receba do usuário três números inteiros e
invoque uma sub-rotina chamada “maior”. Em seguida, crie a sub-rotina indicada que
tem como parâmetros os três números inteiros fornecidos pelo usuário e que retorne
um número inteiro. Essa sub-rotina deve retornar o maior dos números passados
como parâmetros. Por exemplo: se os parâmetros forem −1, 7 e 3, o programa deve
retornar 7.
 */