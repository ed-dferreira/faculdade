package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos dias: ");
        int dias = scanner.nextInt();
        System.out.print("Quantas horas: ");
        int horas = scanner.nextInt();
        System.out.print("Quantos minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Quantos segundos: ");
        int segundos = scanner.nextInt();
        scanner.close();
        paraSegundos(dias, horas, minutos, segundos);
    }
    public static void paraSegundos(int dias, int horas, int minutos, int segundos){
        horas = horas + dias * 24;
        minutos = minutos + horas * 60;
        segundos = segundos + minutos * 60;
        int totalSegundos = segundos;
        System.out.print("O total de segundos é: " + totalSegundos); 
    }
}

/*
 * 4. Faça um programa em Java que recebe do usuário quatro números inteiros
relativos a uma quantidade de tempo em dias, horas, minutos e segundos, e que
invoque uma sub-rotina chamada “paraSegundos”. Em seguida, crie a sub-rotina
indicada que tem como parâmetros os quatro números inteiros fornecidos pelo
usuário e que não tem retorno. Essa sub-rotina deve converter aquela quantidade de
dias, horas, minutos e segundos em segundos e mostrar esse resultado ao usuário,
ignorando valores quebrados. Por exemplo: se o usuário entrar com os valores de 0
dias, 12 horas, 15 minutos e 2 segundos, o programa deve mostrar apenas “44102
segundos”.
 */