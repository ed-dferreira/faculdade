package ExerciciosPreProvaPoo1.Livraria;

public class Livro extends Produto {
    private String autor;
    private String editora;

    public Livro(int codigo, String nome, int valor, String autor, String editora) {
        super(codigo, nome, valor); 
        this.autor = autor;
        this.editora = editora;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chama o método da superclasse
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
    }
}