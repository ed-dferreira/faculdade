package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para saber se é negativo: ");
        int nun = scanner.nextInt();
        boolean valorLog = false;
        scanner.close();
        valorLog = ehNegativo(nun);
        System.out.print("O número é:" + valorLog);
    }
    public static boolean ehNegativo (int nun){
        boolean negativo = false;
        if (nun < 0){
            negativo = true;
        }
        return negativo;
    }
}
/*
 * 6. Faça um programa em Java que receba do usuário um número inteiro e invoque
uma sub-rotina chamada “ehNegativo”. Em seguida, crie a sub-rotina indicada que
tem como parâmetro o número inteiro fornecido pelo usuário e que retorne um valor
lógico. Essa sub-rotina deve retornar true se o número recebido como parâmetro for
negativo, ou false se o número recebido for positivo ou zero.
 */