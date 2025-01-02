package ExerciciosPreProvaPoo1.Livraria;
import java.util.List;

public interface IListaProdutos {
    void incluirProduto(Produto produto);  
    Produto consultarProduto(int codigo); 
    void removerProduto(int codigo);       
    List<Produto> listarTodos();          
}
