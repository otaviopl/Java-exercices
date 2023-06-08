package data;



import model.Produto;



import java.util.List;



public interface ProdutoDAO extends DAO<Produto> {

    void salvar (Produto p);

    void atualizar(Produto p);

    void apagar  (Produto p);

    Produto buscar (int id);

    List<Produto> buscarTodos();



}