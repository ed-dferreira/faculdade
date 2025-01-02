package ExerciciosPreProvaPoo1.Livraria;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ListaProdutos listaProdutos = new ListaProdutos();
        Scanner scanner = new Scanner(System.in);
        // Adicionando alguns produtos iniciais
        Revista r1 = new Revista(414, "Revistinha", 10, "Ciclano Cultura");
        Revista r2 = new Revista(871, "Revistão", 15, "Ciclano Cultura");
        listaProdutos.incluirProduto(r1);
        listaProdutos.incluirProduto(r2);

        while (true) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1. Listar os produtos da livraria");
            System.out.println("2. Consultar um produto");
            System.out.println("3. Remover um produto");
            System.out.println("4. Adicionar um novo produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
            case 1:
                System.out.println("Produtos na Livraria:");
                for (Produto produto : listaProdutos.listarTodos()) {
                    produto.mostrarDetalhes(); // Certifique-se de que o método mostrarDetalhes está implementado
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("Digite o código do produto para consultar: ");
                int codigoConsulta = scanner.nextInt();
                Produto produtoConsultado = listaProdutos.consultarProduto(codigoConsulta);
                if (produtoConsultado != null) {
                    System.out.println("Produto Consultado:");
                    produtoConsultado.mostrarDetalhes();
                } else {
                    System.out.println("Produto com código " + codigoConsulta + " não encontrado.");
                }
                break;
            case 3:
                System.out.print("Digite o código do produto para remover: ");
                int codigoRemover = scanner.nextInt();
                listaProdutos.removerProduto(codigoRemover);
                System.out.println("Produto com código " + codigoRemover + " removido.");
                break;
            case 4:
                System.out.print("Escolha o tipo do produto (1: Livro, 2: Revista, 3: DVD): ");
                int tipoProduto = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome do autor/editor: ");
                    String autorEditora = scanner.nextLine();
                    Produto novoProduto = null;
                    switch (tipoProduto) {
                    case 1: // Livro
                        System.out.print("Digite o nome da editora: ");
                        String editora = scanner.nextLine();
                        novoProduto = new Livro(codigo, nome, (int) preco, autorEditora, editora);
                        break;
                    case 2: // Revista
                        novoProduto = new Revista(codigo, nome, (int) preco, autorEditora);
                        break;
                    case 3: // DVD
                        System.out.print("Digite o estilo do DVD: ");
                        String estilo = scanner.nextLine();
                        novoProduto = new Dvd(codigo, nome, (int) preco, autorEditora, estilo);
                        break;
                    default:
                        System.out.println("Tipo de produto inválido.");
                        continue; 
                    }
                    listaProdutos.incluirProduto(novoProduto);
                    System.out.println("Novo produto adicionado.");
                    break;
            case 5:
                System.out.println("Saindo...");
                scanner.close();
                System.exit(0); // Encerra o programa
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
