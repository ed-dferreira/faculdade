package If_Else;
import java.util.Scanner;
public class If_Else_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hora da entrada: ");
        int entradaHora = scanner.nextInt();
        System.out.print("Minutos da entrada: ");
        int entradaMins = scanner.nextInt();
        System.out.print("Hora da saida: ");
        int saidaHora = scanner.nextInt();
        System.out.print("Minutos da saida: ");
        int saidaMins = scanner.nextInt();
        int tempoVisita = 0;
        scanner.close();
        if (entradaHora >= 8 && saidaHora <= 20){
            entradaHora = entradaHora * 60;
            saidaHora = saidaHora * 60;
            tempoVisita = saidaHora - entradaHora + saidaMins + entradaMins;
            System.out.print("Tempo total de visita: " + tempoVisita);
        } else {
            System.out.println("Invalido");
        }
    }
}
/*
 * 11. Um porteiro de um prédio comercial precisa saber quantos minutos cada
visitante ficou nas dependências do prédio, mas ele apenas possui o registro de
entrada e saída como referência. Considere que (1) o porteiro fornecerá quatro
valores inteiros distintos (as horas na entrada, os minutos na entrada, as horas na
saída, e os minutos na saída), e (2) o prédio fica aberto apenas das 08:00 às 20:00 e
ninguém pode entrar ou sair fora desse horário. Faça um algoritmo que ajude o
porteiro
 */