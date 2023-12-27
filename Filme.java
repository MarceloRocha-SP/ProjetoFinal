package ProjetoFinal;

import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Atores> atores;

    public Filme(String nome, String dataLancamento, double orcamento, String descricao,
                 Diretor diretor, List<Atores> atores) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Atores> getAtores() {
        return atores;
    }

    public void setAtores(List<Atores> atores) {
        this.atores = atores;
    }
}
