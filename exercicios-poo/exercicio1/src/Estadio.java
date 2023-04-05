import java.util.ArrayList;
import java.util.List;
public class Estadio {
    private String nome;
    private String cidade;
    private Partida[] partidas;

    public Estadio(String nome, String cidade, List<Partida> partidas) {
        this.nome = nome;
        this.cidade = cidade;
        this.partidas = partidas.toArray(new Partida[partidas.size()]);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Partida[] getPartidas() {
        return partidas;
    }

    public void setPartidas(Partida[] partidas) {
        this.partidas = partidas;
    }
    public void MostrarDados(){
        System.out.println("Estadio:\n Nome " + getNome() +
                "\n Cidade:" + getCidade()+
                "\n Partidas:");

        for (Partida partida : getPartidas()) {
            System.out.println("- " + partida.getData()+"\n-"+ partida.getHora()+"\nPlacar Time visitante:"+partida.getPlacarTime1()+"\nPlacar Time da casa:"+partida.getPlacarTime2());
        }}


}