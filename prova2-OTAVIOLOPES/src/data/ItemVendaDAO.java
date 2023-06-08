package data;



import model.ItemVenda;



import java.util.List;



public interface ItemVendaDAO extends DAO<ItemVenda> {

    void salvar (ItemVenda i);

    void atualizar(ItemVenda i);

    void apagar  (ItemVenda i);

    ItemVenda buscar (int id);

    List<ItemVenda> buscarTodos();



}