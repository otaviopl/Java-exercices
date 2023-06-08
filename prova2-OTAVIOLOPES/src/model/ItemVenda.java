package model;

public class ItemVenda implements IMostrarDados{
    public ItemVenda(int idItemVenda, int quantidadeVendida,Venda venda, Produto produto,double valorTotal) {
        this.idItemVenda = idItemVenda;
        this.quantidadeVendida = quantidadeVendida;
        this.venda = venda;
        this.produto = produto;
        this.valorTotal = valorTotal;
    }

    private int idItemVenda;
    private int quantidadeVendida;
    private double valorTotal;
    private Venda venda;
    private Produto produto;
    public void calcularValorTotal(){
        valorTotal = this.quantidadeVendida *this.getProduto().getPrecoUnitario();
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getValorTotal() {
        calcularValorTotal();
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    @Override
    public void mostrarDados(){
        System.out.println("ItemVENDA->\n" +
                "Id:"+getIdItemVenda()+
                "\nquantidade:"+getQuantidadeVendida()+
                "\nvalorTOTAL:"+getValorTotal()+
                "\nProduto:"+getProduto().getDescricao()+
                "\nVenda id"+getVenda().getIdVenda());

    }
}
