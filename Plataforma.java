package trenSpot.model;

public class Plataforma {
    private int idPlataforma;
    private String nome;
    private boolean status;

    public Plataforma(int idPlataforma, String nome, boolean status) {
        this.idPlataforma = idPlataforma;
        this.nome = nome;
        this.status = status;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public String getNome() {
        return nome;
    }

    public boolean getStatus() {
        return status;
    }

    public void ativar() {
        this.status = true;
        System.out.println("Plataforma " + nome + " ativada.");
    }

    public void desativar() {
        this.status = false;
        System.out.println("Plataforma " + nome + " desativada.");
    }
}