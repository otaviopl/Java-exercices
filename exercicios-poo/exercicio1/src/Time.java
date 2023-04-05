import java.util.ArrayList;
import java.util.List;

public class Time {
    private String pais;
    private int quantidadeTitulos;
    private List<Jogador> jogadores;

    public Time(String pais, int quantidadeTitulos) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
        this.jogadores = new ArrayList<Jogador>();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
    public void MostrarDados(){
        System.out.println("TIME:\n Quantidade de titulos: " + getQuantidadeTitulos() +
                "\n Pais" + getPais()+
                "\n Jogadores:");

        for (Jogador jogador : getJogadores()) {
            System.out.println("- " + jogador.getName());
        }}
}
