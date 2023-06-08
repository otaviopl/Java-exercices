package model;

public class Produto implements IMostrarDados{
    public Produto(int idProduto, String descricao, double precoUnitario, int quantidadeEstoque) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    private int idProduto;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;
    public void atualizarEstoque(){};

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public void mostrarDados(){
        System.out.println("produtos->\n" +
                "\nID:"+getIdProduto()+
                "\nDescricao:"+getDescricao()+
                "\nQuantidade em estoque:"+getQuantidadeEstoque()+
                "\nPreco:"+getPrecoUnitario());
    }
}
