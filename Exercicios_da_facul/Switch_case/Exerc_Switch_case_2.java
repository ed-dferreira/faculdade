package Switch_case;
import java.util.Scanner;
public class Exerc_Switch_case_2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um horario entre de 0 a 23:");
       int dia = scanner.nextInt();
       scanner.close();
       switch (dia) {
           case 6,7,8,9,10,11,12:
               System.out.println("Bom dia!");
               break;
           case 13,14,15,16,17,18:
               System.out.println("Boa tarde!");
               break;
           case 19,20,21,22,23,0,1,2,3,4,5:
               System.out.println("Boa noite!");
               break;
           default:
               System.out.println("Operacao invalida!");
            }
       }    
    }
/*
 * Exercício 2. Desenvolva, em Linguagem Java, um programa que solicite ao usuário um
algarismo de 0 a 9 e escreva-o por extenso. Caso o número não corresponda a um dos
algarismos, deve ser exibida uma mensagem de erro.
 */