package Switch_case;
import java.util.Scanner;
public class Exerc_Switch_case_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Um número de 1 a 4:");
        int estacao = scanner.nextInt();
        scanner.close();
        switch (estacao){
            case 1:
                System.out.println("Verão"); 
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
/*
 * Exercício 3. Desenvolva, em Linguagem Java, um programa que solicite um número
de 1 a 4 ao usuário e informe a estação do ano correspondente, sendo verão o número
1, outono o número 2, inverno o número 3, e primavera o número 4. Caso o número não
corresponda a uma estação, deve ser exibida uma mensagem de erro.
 */