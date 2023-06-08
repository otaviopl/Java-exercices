import data.*;
import model.ItemVenda;
import model.Produto;
import model.Venda;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Avalicao 2---");
        Produto p = new Produto(1,"O melhor Pordutoo",10.00,10);
        Produto p2 = new Produto(2,"O melhor Pordutoo de todos",11.00,20);
        Venda v = new Venda(1,"10/10/2020",100);

        ItemVenda i = new ItemVenda(1,8,v,p,100);

        ProdutoDAO produtoDAO= new ProdutoSQLiteDAO();
        //ja salvo
        //produtoDAO.salvar(p2);

        VendaDAO vendaDAO = new VendaSQLiteDAO();
        //ja salvo
        //vendaDAO.salvar(v);

        ItemVendaDAO itemVendaDAO = new ItemVendaSQLiteDAO();
        //ja salvo
        //itemVendaDAO.salvar(i);

        for(Produto p1 : produtoDAO.buscarTodos()){
            p1.mostrarDados();}

        for(Venda v1 : vendaDAO.buscarTodos()){
            v1.mostrarDados();}


        //produtoDAO.apagar(p);

        //for(ItemVenda i1 : itemVendaDAO.buscarTodos()){
            //i1.mostrarDados();}


    }
}