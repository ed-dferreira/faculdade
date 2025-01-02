package Switch_case;
import java.util.Scanner;
public class Exerc_Switch_case_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua opção desejada:");
        System.out.println("1- Cadastrar");
        System.out.println("2- Editar");
        System.out.println("3- Consultar");
        System.out.println("4- Remover");
        System.out.println("5- Sair");
        int escolha = scanner.nextInt();
        scanner.close();
        switch (escolha) {
            case 1:
                System.out.println("Cadastrar:");
                break;
            case 2:
                System.out.println("Editar");
                break;
            case 3:
                System.out.println("Consultar");
                break;
            case 4:
                System.out.println("Remover");
                break;
            case 5:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Invalido");
        }
    }
    
}
/*
 * Exercício 5. Desenvolva, em Linguagem Java, um programa que apresente um menu
ao usuário com as opções apresentadas na tabela abaixo e solicite ao usuário qual a
opção desejada. Para cada opção, o programa deverá exibir a ação que foi escolhida.
Opção Ação
a Cadastrar
b Editar
c Consultar
d Remover
e Sair
 */