package Classes_e_Objetos;

public class Exerc_Classes_e_Objetos_1 {
    public static void main(String[] args) { // Classe externa
        Cliente cliente = new Cliente(         // Criação do objeto da classe interna Cliente
            "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga",
            "000.000.000-00",
            5,
            "Paço de São Cristóvão número 1 - Rio de Janeiro - RJ",
            'S'
            );
    
        System.out.println("Nome: " + cliente.nome);      // Impressão dos atributos do cliente
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Idade: " + cliente.idade);
        System.out.println("Endereço: " + cliente.endereco);
        System.out.println("Estado Civil: " + cliente.estadoCivil);
    }
    
    static class Cliente { // Classe interna
        String nome;
        String cpf;
        int idade;
        String endereco;
        char estadoCivil;
    
            // Construtor da classe interna Cliente
        public Cliente(String nome, String cpf, int idade, String endereco, char estadoCivil) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
            this.endereco = endereco;
            this.estadoCivil = estadoCivil;
            }
        }
    }
/*
 * 1. Faça um algoritmo que crie uma classe interna referente a um cliente contendo
os atributos nome (string), cpf (string), idade (número inteiro), endereço (string) e
estado civil (caractere). Em seguida, crie um objeto dessa classe com os seguintes
atributos:
- nome “Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco
Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga”
- cpf “000.000.000-00”
- idade 5
- endereço “Paço de São Cristóvão número 1 - Rio de Janeiro - RJ”
- estado civil ‘S’
 */