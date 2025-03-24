package trenSpot.controller;
import trenSpot.model.*;
import trenSpot.model.Passageiro;
import java.util.ArrayList;
import java.util.List;

public class PassageiroController {
    private List<Passageiro> passageiros;

    public PassageiroController() {
        this.passageiros = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
        System.out.println("Passageiro adicionado: " + passageiro.getNome());
    }

    public void listarPassageiros() {
        System.out.println("Lista de Passageiros:");
        for (Passageiro passageiro : passageiros) {
            System.out.println("ID: " + passageiro.getIdPassageiro() + " - Nome: " + passageiro.getNome() + " - Email: " + passageiro.getEmail());
        }
    }
}