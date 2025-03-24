package trenSpot.controller;
import trenSpot.model.*;
import trenSpot.model.Investidor;
import java.util.ArrayList;
import java.util.List;

public class InvestidorController {
    private List<Investidor> investidores;

    public InvestidorController() {
        this.investidores = new ArrayList<>();
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
        System.out.println("Investidor adicionado: " + investidor.getNomeInvestidor());
    }

    public void listarInvestidores() {
        System.out.println("Lista de Investidores:");
        for (Investidor investidor : investidores) {
            System.out.println("ID: " + investidor.getIdInvestidor() + " - Nome: " + investidor.getNomeInvestidor() + " - Investimento: " + investidor.getQuantidade());
        }
    }
}