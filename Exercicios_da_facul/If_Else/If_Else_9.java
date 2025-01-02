package If_Else;
import java.util.Scanner;
public class If_Else_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaração das variaveis
        double operarioHora = 15.95;
        double gerenciaHora = 22.14;
        int matutino = 1;
        double vespertino = 1.125;
        double noturno = 1.275;
        double salario = 0;
        //pedir o cargo
        System.out.println("Calculadora de sálario");
        System.out.println("Qual o cargo do funcionario? ");
        System.out.println("O – cargo de operário");
        System.out.println("G – cargo de gerência");
        System.out.print("Cargo: ");
        char cargo = scanner.next().charAt(0);
        //pedir o turno
        System.out.print("Qual o turno do funcionario? ");
        System.out.println("M – horário matutino");
        System.out.println("V – vespertino");
        System.out.println("N – noturno");
        System.out.print("Turno: ");
        char turno = scanner.next().charAt(0);     
        //pedir o horario
        System.out.print("Quantas horas o funcionario trabalha? ");
        int totalHoras = scanner.nextInt();
        scanner.close();
        //calculo do operario
        if (cargo == 'O') {
            if (turno == 'M') {
                salario = totalHoras * operarioHora * matutino; 
                System.out.println("O salario é: " + salario);
            } else if (turno == 'V') {
                salario = totalHoras * operarioHora * vespertino;
                System.out.println("O salario é: " + salario);
            } else if (turno == 'N') {
                salario = totalHoras * operarioHora * noturno;
                System.out.println("O salario é: " + salario);
            } else {
                System.out.println("Turno invalido");
            }
        //calculo da gerencia
        } else if (cargo == 'G') {
            if (turno == 'M') {
                salario = totalHoras * gerenciaHora * matutino; 
                System.out.println("O salario é: " + salario);
            } else if (turno == 'V') {
                salario = totalHoras * gerenciaHora * vespertino;
                System.out.println("O salario é: " + salario);
            } else if (turno == 'N') {
                salario = totalHoras * gerenciaHora * noturno;
                System.out.println("O salario é: " + salario);
            } else {
                System.out.println("Turno invalido");
            }
        } else {
            System.out.println("Cargo invalida");
        }

    }
}
/*
 * 9. Faça um algoritmo que receba uma letra referente ao cargo de um funcionário
(confira abaixo), uma letra referente ao horário do dia trabalho (confira abaixo) e um
número inteiro referente à quantidade de horas trabalhadas, e calcule e mostre o
salário desse funcionário. (resolver usando pseudocódigo e Java)
O – cargo de operário – ganha R$ 15.95 por hora trabalhada
G – cargo de gerência – ganha R$ 22.14 por hora trabalhada
M – horário matutino – ganha apenas o salário calculado pela quantidade de horas
V – vespertino – ganha o salário calculado + 12.5%
N – noturno – ganha o salário calculado + 27.5%
 */