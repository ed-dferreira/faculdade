package While_DoWhile;
import java.util.Scanner;
public class Exerc_While_7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa sobre qual time você torce");
        System.out.println("G. Gremio");
        System.out.println("I. Inter");
        System.out.println("O. Outros");
        System.out.println("F. Fim");
        int gremio = 0;
        int inter = 0;
        int outros = 0;
        while (true){
            System.out.print("Para quem você torce: ");
            char t = scanner.next().charAt(0); //t = time
            if (t == 'F'){
            break;
            }
                switch ('t') {
                    case 'G':
                        gremio ++;
                        break;
                    case 'I':
                        inter ++;
                        break;
                    case 'O':
                        outros ++;  
                        break;
                    default:
                        System.out.println("Invalido");
                        break;
                    }
        System.out.println("Gremio: " + gremio);
        System.out.println("Inter: " + inter);
        System.out.println("Outros: " + outros);
        scanner.close();
        }
    }
} 
/*
 * Exercício 7. Fazer um programa que leia um número não conhecido de respostas
do time que torce: g – Gremio, i – Inter ou o - outros. O programa deve encerrar
quando for digitado f – Fim. Escrever ao final o total de torcedores entrevistados, a
quantidade de gremistas e a quantidade de colorados.
Por exemplo:
Pesquisa das torcidas:
g – Gremio
i – Inter
o – Outro
f – Fim
Opcao: o
g – Gremio
i – Inter
o – Outro
f – Fim
Opcao: i
g – Gremio
i – Inter
o – Outro
f – Fim
Opcao: f
Resultado:
Número total de torcedores: 2
Torcedores gremistas: 0
Torcedores colorados: 1
 */