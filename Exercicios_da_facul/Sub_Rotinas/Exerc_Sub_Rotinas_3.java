package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de segundos: ");
        int segundos = scanner.nextInt();
        scanner.close();
        int minutos = segundosParaMinutos(segundos);
        System.out.println("A quantidade de minutos é: " + minutos);
    }
    public static int segundosParaMinutos(int segundos){
        return segundos / 60;
    }
}

/*
 * 3. Adapte o programa anterior para que o método “paraMinutos” retorne o valor
resultante da conversão para o método “main” e mostre esse resultado ao usuário
(dentro do método main)
 */