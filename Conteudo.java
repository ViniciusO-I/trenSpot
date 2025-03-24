package trenSpot.model;


public class Conteudo {
    private int idConteudo;
    private String video;
    private String tema;
    private int trajeto;
    private String audio;

    public Conteudo(int idConteudo, String video, String tema, int trajeto, String audio) {
        this.idConteudo = idConteudo;
        this.video = video;
        this.tema = tema;
        this.trajeto = trajeto;
        this.audio = audio;
    }

    public int getIdConteudo() {
        return idConteudo;
    }

    public String getVideo() {
        return video;
    }

    public String getTema() {
        return tema;
    }

    public int getTrajeto() {
        return trajeto;
    }

    public String getAudio() {
        return audio;
    }

    public void exibirConteudo() {
        System.out.println("Exibindo conteúdo: " + tema + " com vídeo " + video);
    }
}
