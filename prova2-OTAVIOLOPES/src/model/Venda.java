package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Venda implements IMostrarDados{
    public Venda(int idVenda, String dataVenda, double valorTotalVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;

    }

    private int idVenda;
    private String dataVenda;
    private double valorTotalVenda;
    private List<ItemVenda> itemVendaList = new ArrayList<>();
    public void calcularValorTotalVenda(){
    double total = 0;
    for(ItemVenda i : itemVendaList)
        total = total + i.getValorTotal();
    valorTotalVenda = total;

    };

    public void incluirItemVenda(ItemVenda...itemVenda){
        Collections.addAll(itemVendaList,itemVenda);
        this.calcularValorTotalVenda();
    };
    public void removerItemVenda(ItemVenda...itemVenda){
        itemVendaList.remove(itemVenda);
    };

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotalVenda() {
        calcularValorTotalVenda();
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public List<ItemVenda> getItemVendaList() {

        return itemVendaList;

    }



    public void setItemVendaList(List<ItemVenda> itemVendaList) {

        this.itemVendaList = itemVendaList;

    }


    @Override
    public void mostrarDados(){
        System.out.println("Venda:\n" +
                "Id:"+getIdVenda()+
                "\nData:"+getDataVenda()+
                "\nTotal:"+getValorTotalVenda());
    }


}
