package ExerciciosPreProvaPoo1.Livraria;

public class Dvd extends Produto {
    private String autor;
    private String estilo;

    public Dvd(int codigo, String nome, int valor, String autor, String estilo){
        super(codigo, nome, valor);
        this.autor = autor;
        this.estilo = estilo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public String getEstilo() {
        return estilo;
    }
    // Sobrescrever o método mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chama o método da superclasse
        System.out.println("Autor: " + autor);
        System.out.println("Estilo: " + estilo);
    }
}