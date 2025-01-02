package ExerciciosPreProvaPoo1.Livraria;
import java.util.ArrayList;
import java.util.List;

public class ListaProdutos implements IListaProdutos {
    private List<Produto> produtos;

    public ListaProdutos() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void incluirProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Produto consultarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void removerProduto(int codigo) {
        produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }

    @Override
    public List<Produto> listarTodos() {
        return produtos;
    }
}
