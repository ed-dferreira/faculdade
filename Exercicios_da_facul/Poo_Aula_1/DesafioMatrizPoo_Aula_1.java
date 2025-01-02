package Poo_Aula_1;
import java.util.Scanner;
public class DesafioMatrizPoo_Aula_1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int escolha = scanner.nextInt();
        int ordenado[] = new int[escolha];
        int onda[] = new int[escolha];

        for (int i = 0; i < escolha; i++){
            onda[i] = scanner.nextInt();
        } 
        scanner.close();

        for (int i = 0; i < escolha; i=+2){ 
            if(onda[i] >= onda[i + 1]){
                ordenado[i] = onda[i];
            }
        }

        for (int i = 0; i < escolha; i++){
            System.out.print(ordenado[i] + " ");
        } 
    }
}




/*
Faça um programa em Java que receba do usuário o tamanho de um vetor e os valores desse vetor 
(números inteiros), e que ordene esse vetor na forma de onda.

Um ordenamento em forma de onda é um vetor em que o primeiro elemento é maior ou igual ao segundo, 
e o segundo elemento é menor ou igual ao terceiro, e o terceiro elemento é maior ou igual ao quarto, 
e assim por diante. Assuma que a seguinte relação é verdadeira:

vetor[0] >= vetor[1] <= vetor[2] >= vetor[3] <= vetor[4] ...

Por exemplo, o vetor [1, 2, 3, 4, 5, 6] poderia ser ordenado em forma de onda da seguinte forma: 
[2, 1, 4, 3, 6, 5]. Entretanto, há várias outras formas de ordenar esse mesmo vetor em forma de onda.

Como outro exemplo, o vetor [ 4, 7, 8, 3, 1, 5, 8, 8, 7, 4, 2, 3, 9 ] poderia ser ordenado em forma de onda da 
seguinte forma: [ 4, 7, 3, 8, 1, 5, 4, 8, 7, 8, 2, 9, 3]. 
*/