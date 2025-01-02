package For;
public class Exerc_For_3 {
    public static void main(String[] args) {
        int soma = 0; 
        int produto = 1;
        for (int i = 1; i <= 10; i++) {
            soma = soma + i;
            produto = produto * i;
            System.out.print(i + " ");
        }
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
    }   
}
/*
 * Exercício 3. Faça um programa para mostrar a soma e o produto dos números
entre 1 e 10.
 */