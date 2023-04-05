import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        // Cria uma lista de ingredientes
        List<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
        ingredientes.add(new Ingredientes("farinha"));
        ingredientes.add(new Ingredientes("ovo"));
        ingredientes.add(new Ingredientes("molho de tomate"));
        ingredientes.add(new Ingredientes("queijo"));

        // Cria um objeto Pizza com a lista de ingredientes criada acima
        Pizza pizza = new Pizza("Pizza muito gostosa", 12.0, true, ingredientes);
        Bebida bebida = new Bebida("Bebida muito boa", 12.00,2);
        Cerveja cerveja= new Cerveja("toma cerveja",3.50,100,5.00);

        pizza.MostrarDados();
        cerveja.MostrarDados();
        bebida.MostrarDados();




    }



}




