package trenSpot.model;


public class Passageiro {
    private int idPassageiro;
    private String nome;
    private String email;
    private int idPlataforma;

    public Passageiro(String nome, int idPassageiro, String email, int idPlataforma) {
        this.idPassageiro = idPassageiro;
        this.nome = nome;
        this.email = email;
        this.idPlataforma = idPlataforma;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void interagirComConteudo(int idConteudo) {
        System.out.println(nome + " está interagindo com o conteúdo de ID " + idConteudo);
    }
}
