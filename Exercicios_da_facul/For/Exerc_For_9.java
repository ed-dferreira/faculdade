package For;
import java.util.Scanner;
public class Exerc_For_9{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    for (int aluno = 1; aluno <= 10; aluno++){
        System.out.println("Digite a nota da prova 1 para o aluno " + aluno + ":");
        int p1 = scanner.nextInt();
        System.out.println("Digite a nota da prova 2 para o aluno " + aluno + ":");
        int p2 = scanner.nextInt();
        System.out.println("Digite a nota da prova 3 para o aluno " + aluno + ":");
        int p3 = scanner.nextInt();
        scanner.close();
        int media = (p1 + p2 + p3) / 3;
            if (media > 6) {
            System.out.println("Parabéns Aprovado!");
            } else {
            System.out.println("Você foi Reprovado!");
            }
        }
    }
}
/*
 Faça um algoritmo para ler a nota de três provas (p1, p2, p3) de 10
alunos e escrever a média aritmética de cada aluno, se a média for maior que 6
escrever “Parabéns Aprovado!”, senão “Você foi Reprovado!”:
Tá incompleto!
 */