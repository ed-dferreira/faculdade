package While_DoWhile;
public class Exerc_While_2 {
    public static void main(String[] args) {
        int soma = 0;
        int produto = 1;
        int i = 1;
        while (i<=10) {
            soma += i;
            produto *= i;
            i++;
        }
        System.out.println("Soma:" +soma);
        System.out.println("Produto:" +produto);
    }
}
/*
 * Exercício 2. Faça um programa para mostrar a soma e o produto dos números
entre 1 e 10 (incluindo 1 e 10) usando o comando while.
 */