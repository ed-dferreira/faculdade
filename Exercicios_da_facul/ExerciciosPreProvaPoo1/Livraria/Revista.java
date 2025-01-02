package ExerciciosPreProvaPoo1.Livraria;

public class Revista extends Produto {
    private String editora;

    public Revista(int codigo, String nome, int valor, String editora){
        super(codigo, nome, valor);
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    // Sobrescrever o método mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chama o método da superclasse
        System.out.println("Editora: " + editora);
    }
}