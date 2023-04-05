import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Time time = new Time("Brasil", 5);

        Jogador jogador1 = new Jogador("Neymar", "meia",10);


        time.adicionarJogador(jogador1);

        List<Partida> partidas= new ArrayList<Partida>();
        partidas.add(new Partida("12/12/2022","12:00",2,3));
        List<Jogador> jogadores = time.getJogadores();

        for (Jogador jogador : jogadores) {
            System.out.println("Nome:"+jogador.getName()+"\n" + "Posicao:" + jogador.getPosicao()+"\n"+"Numero da Camisa:"+jogador.getNumeroCamisa());
        }
        Estadio estadio =  new Estadio("Meu estadio","sao carlos",partidas);
        estadio.MostrarDados();
        time.MostrarDados();






    }
}