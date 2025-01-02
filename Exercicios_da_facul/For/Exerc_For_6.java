package For;
import java.util.Scanner;;
public class Exerc_For_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros abaixo:");
        for (int i = 0; i < 10; i++){
            System.out.print("Numero: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("É par!");
            } else {
                System.out.println("É impar!");
            }
        }
        scanner.close();
    }
}
/*
 * Exercício 6. Faça um algoritmo para ler 10 números e mostrar quantos são pares e
quantos são ímpares.
 */