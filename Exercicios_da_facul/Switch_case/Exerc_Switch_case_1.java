package Switch_case;
import java.util.Scanner;
public class Exerc_Switch_case_1{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Escreva um número de 1 a 7:");
       int dia = scanner.nextInt();
       scanner.close();
       switch (dia) {
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Segunda");
               break;
           case 3:
               System.out.println("Terca");
               break;
           case 4:
               System.out.println("Quarta");
               break;
           case 5:
               System.out.println("Quinta");
               break;
           case 6:
               System.out.println("Sexta");
               break;
           case 7:
               System.out.println("Sabado");
               break;
           default:
               System.out.println("Operacao invalida!");
       }
   }
}
/*
 * Exercício 1. Desenvolva, em Linguagem Java, um programa que solicite um número
de 1 a 7 ao usuário e informe o dia da semana correspondente, sendo domingo o
número 1. Caso o número não corresponda a um dia da semana, deve ser exibida uma
mensagem de erro.

 */