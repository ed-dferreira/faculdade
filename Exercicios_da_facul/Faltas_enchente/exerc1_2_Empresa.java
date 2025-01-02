package Faltas_enchente;
import java.util.Scanner;
public class exerc1_2_Empresa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double valorHora = 12.0;
        final double valorDependente = 40.0;  //como tem contas envolvendo isso no for, é melhor usar para não explodir
        final double descontoINSS = 0.085;
        final double descontoIR = 0.05;
        int[] codigos = new int[10];
        int[] horasTrabalhadas = new int[10];
        int[] dependentes = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.print("Código: ");
            codigos[i] = scanner.nextInt();
            System.out.print("Número de horas trabalhadas: ");
            horasTrabalhadas[i] = scanner.nextInt();
            System.out.print("Número de dependentes: ");
            dependentes[i] = scanner.nextInt();
        }
        System.out.println("Relatório de Salários:");
        
        for (int i = 0; i < 10; i++) {
            double salarioBruto = (horasTrabalhadas[i] * valorHora) + (dependentes[i] * valorDependente);
            double tempDescontoINSS = salarioBruto * descontoINSS;
            double tempDescontoIR = salarioBruto * descontoIR;
            double salarioLiquido = salarioBruto - (descontoINSS - descontoIR);
            System.out.println("Código: " + codigos[i]);
            System.out.printf("Desconto INSS: R$ %.2f%n", tempDescontoINSS);
            System.out.printf("Desconto IR: R$ %.2f%n", tempDescontoIR);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
            System.out.println("----------------------------");
        }
        scanner.close();
    }
}

/*
 * Uma determinada empresa armazena para cada funcionário (10 no total) uma ficha contendo o código,
 *  o número de horas trabalhadas e o seu nº de dependentes. Considerando que:
a. A empresa paga 12 reais por hora e 40 reais por dependentes.
b. Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR.
Faça um programa para ler o código, número de horas trabalhadas e número de dependentes de cada 
funcionário. Após a leitura, escreva qual o código, os valores descontados para cada tipo de imposto 
e finalmente o salário líquido de cada um dos funcionários. 
 */