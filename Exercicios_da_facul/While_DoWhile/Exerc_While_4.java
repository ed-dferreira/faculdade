package While_DoWhile;
import java.util.Scanner;
public class Exerc_While_4{
    public static void main(String[] args) {
        double desconto = 0;
        double valorFinal = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o valor da compra:");
            
            double valor = scanner.nextDouble();
            if (valor == 0){
                break;
            }
            desconto = valor * 0.10;
            valorFinal = valor - desconto;
            System.out.println(valorFinal);
            scanner.close();
        }    
    }
}
/*
Exercício 4. Escreva um programa que solicita o valor de uma compra à vista,
calcule e mostre o valor da compra, sabendo-se que o desconto do dia é de 10%. O
algoritmo deve repetir esses passos enquanto forem informados valores positivos
para compras.
 */