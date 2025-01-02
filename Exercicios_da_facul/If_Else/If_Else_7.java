package If_Else;
import java.util.Scanner;
public class If_Else_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora:");
        int hora = scanner.nextInt();
        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();
        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();
        scanner.close();
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            System.out.println("Horário válido");
        } else {
            System.out.println("Horário inválido");
        }
    }
}
/*
Faça um algoritmo que receba 3 números inteiros referentes a um horário no
formato Horas:Minutos:Segundos e diga se o horário recebido é ou não válido.
(resolver usando pseudocódigo e Java)
DICA: use o sistema de horas indo de 00 a 23.
 */