package data;



import model.Venda;



import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;



public class VendaSQLiteDAO implements VendaDAO{



    @Override

    public void salvar(Venda v) {

        String sql = "INSERT INTO venda values (?,?,?)";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,v.getIdVenda());

            stmt.setString(2, v.getDataVenda());

            stmt.setDouble(3,v.getValorTotalVenda());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void atualizar(Venda v ){

        String sql = "UPDATE venda SET dataVenda=?, valorTotalVenda=?,WHERE idVenda=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setString(1, v.getDataVenda());

            stmt.setDouble(2,v.getValorTotalVenda());

            stmt.setInt(4,v.getIdVenda());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public void apagar(Venda v) {

        String sql = "DELETE FROM venda WHERE idVenda=?";

        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,v.getIdVenda());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    @Override

    public Venda buscar(int id) {

        Venda v=null;

        String sql = "SELECT * FROM venda WHERE idVenda=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){

            stmt.setInt(1,id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next())

                v = new Venda(
                        rs.getInt("idVenda"),

                        rs.getString("dataVenda"),

                        rs.getDouble("valorTotalVenda"));





        } catch (SQLException e) {

            e.printStackTrace();

        }

        return v;



    }



    @Override

    public List<Venda> buscarTodos() {



        List<Venda> listaVenda= new ArrayList<>();

        String sql = "SELECT * FROM venda";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){



            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Venda v = new Venda(
                        rs.getInt("idVenda"),

                        rs.getString("dataVenda"),

                        rs.getDouble("valorTotalVenda"));


                listaVenda.add(v);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return listaVenda;

    }

}