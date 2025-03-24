package trenSpot.controller;
import trenSpot.model.Estacao;
import java.util.ArrayList;
import java.util.List;

public class EstacaoController {
    private List<Estacao> estacoes;

    public EstacaoController() {
        this.estacoes = new ArrayList<>();
    }

    public void adicionarEstacao(Estacao estacao) {
        estacoes.add(estacao);
        System.out.println("estação adicionada: " + estacao.getNomeLocal());
    }

    public void atualizarMediaPassageiro(int idEstacao, float novaMedia) {
        for (Estacao estacao : estacoes) {
            if (estacao.getIdEstacao() == idEstacao) {
                estacao.atualizarMediaPassageiro(novaMedia);
                return;
            }
        }
        System.out.println("estação com Id " + idEstacao + " nao encontrada.");
    }

    public void listarEstacoes() {
        System.out.println("lista de estações:");
        for (Estacao estacao : estacoes) {
            System.out.println("Id: " + estacao.getIdEstacao() + "nome: " + estacao.getNomeLocal() + " - Média Passageiros: " + estacao.getMediaPassageiro());
        }
    }
}
