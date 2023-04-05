import java.util.List;
import java.util.ArrayList;
public class Pizza extends Produto{
    private boolean bordaRecheada;
    private Ingredientes[] ingredientes;

    public Pizza(String descricao, double preco, boolean bordaRecheada, List<Ingredientes> ingredientes) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
        this.ingredientes = ingredientes.toArray(new Ingredientes[ingredientes.size()]);}


    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public Ingredientes[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void MostrarDados(){
        System.out.println("\n Descricao: " + getDescricao() +
                "\n Preco" + getPreco()+
                "\n Ingredientes:");

        for (Ingredientes ingrediente : getIngredientes()) {
            System.out.println("- " + ingrediente.getNome());
        }

        System.out.println("\n Borda Recheada " + isBordaRecheada());
    }

}

