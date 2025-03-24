package trenSpot.model;



public class Investidor {
    private int idInvestidor;
    private String nomeInvestidor;
    private int quantidade;

    public Investidor(int idInvestidor, String nomeInvestidor, int quantidade) {
        this.idInvestidor = idInvestidor;
        this.nomeInvestidor = nomeInvestidor;
        this.quantidade = quantidade;
    }

    public int getIdInvestidor() {
        return idInvestidor;
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void investirEmConteudo(int idConteudo) {
        System.out.println("Investidor " + nomeInvestidor + " investindo no conteúdo " + idConteudo);
    }
}