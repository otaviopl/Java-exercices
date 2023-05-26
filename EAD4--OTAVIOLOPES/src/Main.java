import data.*;
import model.Candidato;
import model.Cargo;
import model.Partido;

public class Main {
    public static void main(String[] args) {
        Partido partido1 = new Partido(1,"Partido dos Trabalhadores","PT");
        Partido partido2 = new Partido(2,"Partido do Otavio", "PO");
        Cargo cargo1 = new Cargo(7,"Deputado");
        Cargo cargo2 = new Cargo(4,"Presidente");
        Candidato candidato1 = new Candidato(10, "TEITAS", cargo1, partido1);
        Candidato candidato = new Candidato(20,"FEFE",cargo2,partido2);

        CargoDAO cargoDAO = new CargoSQliteDAO();
        cargoDAO.salvar(cargo1);
        cargoDAO.salvar(cargo2);

        PartidoDAO partidoDAO = new PartidoSQliteDAO();
        partidoDAO.salvar(partido1);
        partidoDAO.salvar(partido2);

        CandidatoDAO candidatoDAO = new CandidatoSQliteDAO();
            candidatoDAO.salvar(candidato1);
            candidatoDAO.salvar(candidato);
        System.out.println("\nPartidos:");
        for (Partido p : partidoDAO.buscarTodos())
            p.mostrarDados();


        System.out.println("\nCargos:");
        for (Cargo c :cargoDAO.buscarTodos())
            c.mostrarDados();

        System.out.println("\nCandidatos:");
        for (Candidato c : candidatoDAO.buscarTodos())
            c.mostrarDados();



    }
}