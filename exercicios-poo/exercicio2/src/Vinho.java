public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(String descricao, double preco, int quantidadeEstoque, String uva, String paisOrigem) {
        super(descricao, preco, quantidadeEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public void MostrarDados(){
        System.out.println("\n Descricao: " + getDescricao() +
                "\n Uva: " + getUva()+
                "\n Pais de Origem: " + getPaisOrigem());}
}
