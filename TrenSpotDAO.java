package trenSpotDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import trenSpot.controller.*;
import trenSpot.model.Conteudo;

public class TrenSpotDAO {
    public void inserirConteudo(Conteudo conteudo) {
        String sql = "INSERT INTO Conteudo (idConteudo, video, tema, trajeto, audio) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, conteudo.getIdConteudo());
            stmt.setString(2, conteudo.getVideo());
            stmt.setString(3, conteudo.getTema());
            stmt.setInt(4, conteudo.getTrajeto());
            stmt.setString(5, conteudo.getAudio());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Conteúdo inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir o conteúdo.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao inserir conteúdo: " + e.getMessage());
        }
    }
}