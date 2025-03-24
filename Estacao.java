package trenSpot.model;

public class Estacao {
    private int idEstacao;
    private String nomeLocal;
    private float mediaPassageiro;

    public Estacao(int idEstacao, String nomeLocal, float mediaPassageiro) {
        this.idEstacao = idEstacao;
        this.nomeLocal = nomeLocal;
        this.mediaPassageiro = mediaPassageiro;
    }

    public int getIdEstacao() {
        return idEstacao;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public float getMediaPassageiro() {
        return mediaPassageiro;
    }

    public void atualizarMediaPassageiro(float novaMedia) {
        this.mediaPassageiro = novaMedia;
        System.out.println("Média de passageiros na estação " + nomeLocal + " atualizada para " + novaMedia);
    }
}