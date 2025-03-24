package trenSpot.controller;

import trenSpot.model.*;
import trenSpot.model.Conteudo;

import java.util.ArrayList;
import java.util.List;

public class ConteudoController {
    private List<Conteudo> conteudos;

    public ConteudoController() {
        this.conteudos = new ArrayList<>();
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
        System.out.println("conteudo adicionado: " + conteudo.getTema());
    }

    public void removerConteudo(int idConteudo) {
        conteudos.removeIf(conteudo -> conteudo.getIdConteudo() == idConteudo);
        System.out.println("Conteúdo removido com: " + idConteudo);
    }

    public void listarConteudos() {
        System.out.println("lista de cobteudo:");
        for (Conteudo conteudo : conteudos) {
            System.out.println("Id: " + conteudo.getIdConteudo() + "tema: " + conteudo.getTema());
        }
    }
}
