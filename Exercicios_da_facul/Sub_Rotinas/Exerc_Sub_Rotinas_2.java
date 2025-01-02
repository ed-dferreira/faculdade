package Sub_Rotinas;

import java.util.Scanner;

public class Exerc_Sub_Rotinas_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de segundos: ");
        int segundos = scanner.nextInt();
        scanner.close();
        segundosParaMinutos(segundos);
    }
    public static void segundosParaMinutos(int segundos){
        segundos = segundos / 60;
        System.out.println("A quantidade de minutos é: " + segundos);
    }
}
/*
 * 2. Faça um programa em Java que recebe do usuário um número inteiro relativo a
uma quantidade de tempo em segundos e que invoque uma sub-rotina chamada
“paraMinutos”. Em seguida, crie a sub-rotina indicada que tem como parâmetro o
número inteiro fornecido pelo usuário e que não tem retorno. Essa sub-rotina deve
converter aquela quantidade de segundos em minutos e mostrar esse resultado ao
usuário, ignorando valores quebrados. Por exemplo, se o usuário entrar com o valor
de “123” segundos, o programa deve mostrar apenas “2 minutos”.
 */