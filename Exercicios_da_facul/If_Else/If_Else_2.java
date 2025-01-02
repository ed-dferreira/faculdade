package If_Else;
import java.util.Scanner;
public class If_Else_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero inteiro:");
        int num = scanner.nextInt();
        scanner.close();
        if (num >= 0) {
            double raizQuadrada = Math.sqrt(num);
            System.out.println(raizQuadrada);
        } else {
            int elevAoQuadrado = num * num;
            System.out.println(elevAoQuadrado);

            }
        }
    }
/*
 * 2. Faça um algoritmo que receba um número inteiro e calcule e mostre sua raiz
quadrada se for positivo (ou não negativo) ou calcule e mostre ele elevado ao
quadrado se for negativo. (resolver usando fluxograma, pseudocódigo e Java)
 */