package data;



import model.Produto;



import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;



public class ProdutoSQLiteDAO implements ProdutoDAO{



    @Override

    public void salvar(Produto p) {

        String sql = "INSERT INTO produto values (?,?,?,?)";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,p.getIdProduto());

            stmt.setString(2, p.getDescricao());

            stmt.setDouble(3,p.getPrecoUnitario());

            stmt.setInt(4,p.getQuantidadeEstoque());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void atualizar(Produto p) {

        String sql = "UPDATE produto SET descricao=?, precoUnitario=?, quantidadeEstoque=?, WHERE idProduto=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setString(1, p.getDescricao());

            stmt.setDouble(2,p.getPrecoUnitario());

            stmt.setInt(3,p.getQuantidadeEstoque());

            stmt.setInt(4,p.getIdProduto());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void apagar(Produto p) {

        String sql = "DELETE FROM produto WHERE idProduto=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,p.getIdProduto());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public Produto buscar(int idProduto) {

        Produto p=null;

        String sql = "SELECT * FROM produto WHERE idProduto=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){

            stmt.setInt(1,idProduto);

            ResultSet rs = stmt.executeQuery();

            while (rs.next())

                p = new Produto(
                        rs.getInt("idProduto"),

                        rs.getString("descricao"),

                        rs.getDouble("precoUnitario"),

                        rs.getInt("quantidadeEsqtoque"));



        } catch (SQLException e) {

            e.printStackTrace();

        }

        return p;



    }



    @Override

    public List<Produto> buscarTodos() {



        List<Produto> listaProduto = new ArrayList<>();

        String sql = "SELECT * FROM produto";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){



            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

               Produto p = new Produto(
                        rs.getInt("idProduto"),

                        rs.getString("descricao"),

                        rs.getDouble("precoUnitario"),
                        rs.getInt("quantidadeEstoque"));

                listaProduto.add(p);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return listaProduto;

    }

}