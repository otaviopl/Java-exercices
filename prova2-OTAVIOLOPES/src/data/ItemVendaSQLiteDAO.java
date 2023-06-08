package data;



import model.ItemVenda;
import model.Produto;
import model.Venda;


import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;



public class ItemVendaSQLiteDAO implements ItemVendaDAO{



    @Override

    public void salvar(ItemVenda i) {

        String sql = "INSERT INTO itemvenda values (?,?,?,?,?)";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,i.getIdItemVenda());
            stmt.setInt(2,i.getProduto().getIdProduto());
            stmt.setInt(3,i.getVenda().getIdVenda());


            stmt.setInt(4, i.getQuantidadeVendida());

            stmt.setDouble(5,i.getValorTotal());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void atualizar(ItemVenda i ){

        String sql = "UPDATE itemvenda SET quantidadeVendida=?, valorTotal=?,WHERE id=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1, i.getQuantidadeVendida());

            stmt.setDouble(2,i.getValorTotal());

            stmt.setInt(3,i.getIdItemVenda());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void apagar(ItemVenda i) {

        String sql = "DELETE FROM itemvenda WHERE id=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,i.getIdItemVenda());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public ItemVenda buscar(int id) {

        ItemVenda i=null;

        String sql = "SELECT * FROM itemvenda WHERE idItemVenda=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){

            stmt.setInt(1,id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {


                Produto p = new ProdutoSQLiteDAO().buscar(rs.getInt("idProduto"));
                Venda v= new VendaSQLiteDAO().buscar(rs.getInt("idVenda"));
                i = new ItemVenda(rs.getInt("iditemVenda"),
                                            rs.getInt("quantidadeVendida"),v,p,rs.getDouble("valorTotal"));

            }





        } catch (SQLException e) {

            e.printStackTrace();

        }

        return i;



    }



    @Override

    public List<ItemVenda> buscarTodos() {



        List<ItemVenda> listaItemVenda= new ArrayList<>();

        String sql = "SELECT * FROM itemvenda";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){



            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new ProdutoSQLiteDAO().buscar(rs.getInt("idProduto"));
                Venda v= new VendaSQLiteDAO().buscar(rs.getInt("idVenda"));

                 ItemVenda i = new ItemVenda(
                        rs.getInt("iditemVenda"),

                        rs.getInt("quantidadeVendida"),v,p,rs.getDouble("valorTotal"));


                listaItemVenda.add(i);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return listaItemVenda;

    }

}