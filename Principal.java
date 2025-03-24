package trenSpot.view;
import trenSpot.controller.*;
import trenSpot.model.Conteudo;
import trenSpotDAO.TrenSpotDAO;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Conectando...");

        // criando um objto 
        Conteudo conteudo = new Conteudo(2, "video", "exemplo", 2, "audio");
        
        //criando instância inserindo no banco
        TrenSpotDAO dao = new TrenSpotDAO();
        dao.inserirConteudo(conteudo);

        System.out.println("Teste concluído!");
    }
}