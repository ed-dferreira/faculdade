package Poo_Aula_1;
import java.util.Scanner; 
public class RevEstruturaControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número ímpar menor que 20:");
        while (true){
            int num = scanner.nextInt();
            if (num % 2 != 0 && num < 20){
                for (int i = 0; i < num; i++){
                    for (int j = 0; j < num; j++){
                        if (j == i || j == num - i - 1){
                            System.out.print("X");
                        } else {
                            System.out.print(" ");
                        }
                    }
                System.out.println();
                }
            break;
            } else {
                System.out.println("Numero invalido, precisa ser impar e menor que 20!");
            }
        }
        scanner.close();
    }
}
// j == i escreve as letras onde a linha é igual a coluna e o j == num - i - 1 escrevo no lado inverso 
//da matriz 
/*
As borboletas (ou panapanás) são insetos da ordem Lepidoptera. Elas têm dois pares de asas membranosas 
cobertas de escamas, que apresentam formas e cores variadas, além de peças bucais para sucção. 
Distinguem-se das mariposas pelas antenas retilíneas que terminam numa bola, pelos hábitos de vida diurnos, 
pela metamorfose que decorre dentro de uma crisálida rígida e pelo abdómen fino e alongado.

Sabendo de todas essas maravilhosas informações sobre borboletas que são absolutamente irrelevantes para a 
realização desse exercício, você deve fazer um programa em Java que receba do usuário um número inteiro ímpar 
referente à altura das asas de uma borboleta e que desenha um padrão de borboleta na tela conforme os exemplos 
a seguir.

Para N = 3

X X
XxX
X X

Para N = 5

X       X
 XX   XX
  XXXXX
 XX   XX
X       X

Observação: seu programa não deve aceitar números pares e nem números acima de 20.

 */