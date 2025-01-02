package Sub_Rotinas;
import java.util.Scanner;
public class Exerc_Sub_Rotinas_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva uma palavara e a terceira letra será mostrada: ");
        String palavra = scanner.nextLine();
        System.out.print("A palavra é: " + palavra);
        scanner.close();
        informarTerceiraLetra(palavra);
    }
    public static void informarTerceiraLetra (String palavra){
        if (palavra.length() >= 3) {
            char terceiraLetra = palavra.charAt(2);
            System.out.println("A terceira letra é: " + terceiraLetra);
        } else {
            System.out.println("Erro: A palavra informada tem menos de três letras.");
        }
    }
}
/*
 * 5. Faça um programa em Java que receba do usuário uma palavra e invoque uma
sub-rotina chamada “informarTerceiraLetra”. Em seguida, crie a sub-rotina indicada
que tem como parâmetro a String fornecida pelo usuário e que não tem retorno. Essa
sub-rotina deve mostrar qual é a terceira letra da palavra digitada pelo usuário ou
mostrar uma mensagem de erro se a palavra informada tiver menos que três letras.
OBS.: lembre-se dos métodos length( ) e charAt( X ) dos objetos String do Java para
ajudar a resolver esse problema.
 */