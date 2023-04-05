public class Jogador{
    private String name;
    private String posicao;
    private int numeroCamisa;
    private Time time;

    public Jogador(String name, String posicao, int numeroCamisa) {
        this.name = name;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }


}
