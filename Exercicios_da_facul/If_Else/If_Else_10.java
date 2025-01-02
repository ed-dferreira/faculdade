package If_Else;
import java.util.Scanner;
public class If_Else_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota do aluno: ");
        int nota = scanner.nextInt();
        System.out.println("Frequencia do aluno: ");
        int frequencia = scanner.nextInt();
        scanner.close();
        if (nota >= 6 && frequencia >= 75) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
/*
 * 10. Um professor precisa verificar quais estudantes foram aprovados em sua
disciplina de Algoritmos e Programação. Considere que (1) o professor fornecerá a
nota do estudante e sua frequência (referente à porcentagem de aulas assistidas), e (2)
um estudante precisa de nota mínima 6.0 e de frequência mínima 75% para
aprovação. Faça um algoritmo que mostre se um estudante foi ou não aprovado.
 */