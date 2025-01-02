package ExerciciosPreProvaPoo1.Livraria;

public abstract class Produto {
    private int codigo;
    private String nome;
    private int valor;

    public Produto(int codigo, String nome, int valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public void mostrarDetalhes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
    }
}
