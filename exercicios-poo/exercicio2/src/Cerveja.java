public class Cerveja extends Bebida{
    private double teorAlcoolico;

    public Cerveja(String descricao, double preco, int quantidadeEstoque, double teorAlcoolico) {
        super(descricao, preco, quantidadeEstoque);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
    public void MostrarDados(){
        System.out.println("\n Descrição: " + getDescricao() +
                "\n preco " + getPreco()+
                "\n teor alcoolico" + getTeorAlcoolico()+
                "\n quantidade em estoque: " + getQuantidadeEstoque());}
}
