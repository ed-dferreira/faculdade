package If_Else;
import java.util.Scanner;
public class If_Else_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero real:");
        float real = scanner.nextFloat();
        if (real >= 10) {
            System.out.println("VIVA OS ORNITORRINCOS!");
        } else {
            System.out.println("MORTE AOS ORNITORRINCOS!");
        }      
        scanner.close();
    }
}
/*
 * 1. Faça um algoritmo que receba um número real e mostre a frase “VIVA OS
ORNITORRINCOS” se ele for maior que 10.0 . (resolver usando fluxograma,
pseudocódigo e Java)
 */