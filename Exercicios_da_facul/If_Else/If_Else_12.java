package If_Else;
import java.util.Scanner;
public class If_Else_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salario bruto mensal: ");
        double salario = scanner.nextDouble();
        double imposto = 0;
        scanner.close();
        if (salario <= 1999.18){
            System.out.println("Isento de leão");
        } else if (salario >= 1999.18 && salario <= 2967.98){
            imposto = salario * 0.075 - 149.94;
            System.out.print("Precisa pagar essa quantidade de impostos: " + imposto);
        } else if (salario >= 2967.98 && salario <= 3938.60){
            imposto = salario * 0.015 - 372.54;
            System.out.print("Precisa pagar essa quantidade de impostos: " + imposto);
        } else if (salario >= 3938.60 && salario <= 4897.91){
            imposto = salario * 0.0225 - 667.93;

        } else if (salario >= 4897.91){
            imposto = salario * 0.0275 - 912.83;
            System.out.print("Precisa pagar essa quantidade de impostos: " + imposto);
        }
    }
}
/*
 * 12. Um contador da comunidade local precisa conferir o valor básico de Imposto
de Renda (IR) anual que famílias devem pagar. Considere que (1) o contador vai
informar apenas o salário bruto mensal da família, (2) a porcentagem de pagamento
de imposto (alíquota) por mês é calculada com base no salário bruto mensal conforme
a tabela a seguir (se alguém ganha R$ 3000, pagará 15% como IR mensal, ou seja, R$
450), e (3) existe um valor que deve ser reduzido (dedução) do imposto de renda
calculado mensalmente conforme a tabela a seguir (se alguém ganha R$ 3000 e
pagaria R$450 de imposto pela alíquota, devem ser deduzidos R$ 372.54, fazendo
com que a pessoa pague R$ 77.46 de imposto por mês). Faça um algoritmo que ajude
o contador a calcular o Imposto de Renda anual pago.
Faixa de salário Alíquota Dedução
Até 1999.18 isento de imposto de renda
De 1999.18 até 2967.98 7.5% 149.94
De 2967.98 até 3938.60 15% 372.54
De 3938.60 até 4897.91 22.5% 667.93
Acima de 4897.92 27.5% 912.83
 */