package trenSpot.controller;
import trenSpot.model.*;
import trenSpot.controller.*;
import java.util.ArrayList;
import java.util.List;

public class PlataformaController {
    private List<Plataforma> plataformas;

    public PlataformaController() {
        this.plataformas = new ArrayList<>();
    }

    public void adicionarPlataforma(Plataforma plataforma) {
        plataformas.add(plataforma);
        System.out.println("Plataforma adicionada: " + plataforma.getNome());
    }

    public void ativarPlataforma(int idPlataforma) {
        for (Plataforma plataforma : plataformas) {
            if (plataforma.getIdPlataforma() == idPlataforma) {
                plataforma.ativar();
                return;
            }
        }
        System.out.println("Plataforma com ID " + idPlataforma + " não encontrada.");
    }

    public void desativarPlataforma(int idPlataforma) {
        for (Plataforma plataforma : plataformas) {
            if (plataforma.getIdPlataforma() == idPlataforma) {
                plataforma.desativar();
                return;
            }
        }
        System.out.println("Plataforma com ID " + idPlataforma + " não encontrada.");
    }
}