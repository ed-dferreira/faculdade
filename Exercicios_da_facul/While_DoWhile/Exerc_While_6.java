package While_DoWhile;
import java.util.Scanner;
public class Exerc_While_6 {
    public static void main(String[] args) {
        int saldo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual das opções abaixo?");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Saque");
        System.out.println("3. Depósito");
        System.out.println("4. Sair");
        while (true){
            System.out.print("Escolha a opção: ");
            int escolha = scanner.nextInt();
            if (escolha == 4){
                System.out.println("Saindo");
                break;
            }
            switch (escolha){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja sacar?");
                    int sacar = scanner.nextInt();
                    saldo = saldo - sacar;
                    break;
                case 3: 
                    System.out.println("Quanto deseja depositar?");
                    int deposito = scanner.nextInt();
                    saldo = saldo + deposito;
                    break;
                default:
                System.out.println("Invalido");
                scanner.close();
            }
        }
    }
}
/*
 * Exercício 6. Escreva um programa que apresente quatro opções: (a) consulta
saldo, (b) saque e (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada
saque ou depósito o valor do saldo deve ser atualizado.
Por Exemplo:
(a) consulta saldo
(b) saque
(c) deposito
(d) sair
Opção: a
Saldo R$ 0.00
(a) consulta saldo
(b) saque
(c) deposito
(d) sair
Opção: c
Valor: 20.00
(a) consulta saldo
(b) saque
(c) deposito
(d) sair
Opção: a
Saldo R$ 20.00
(a) consulta saldo
(b) saque
(c) deposito
(d) sair
Opção: d
 */
