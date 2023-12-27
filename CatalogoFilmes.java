package ProjetoFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoFilmes {
    public static void main(String[] args) {
    }
    private Map<String, Filme> filmes;
    private List<Diretor> diretores;
    private final List<Atores> atores;

    public CatalogoFilmes() {
        filmes = new HashMap<>();
        diretores = new ArrayList<>();
        atores = new ArrayList<>();
    }

    public void cadastrarFilme(String nome, String dataLancamento, double orcamento, String descricao,
                               Diretor diretor, List<Atores> listaAtores) {
        Filme filme = new Filme(nome, dataLancamento, orcamento, descricao, diretor, listaAtores);
        filmes.put(nome.toLowerCase(), filme);
    }

    public void cadastrarDiretor(String nome, String sobrenome, String nacionalidade) {
        Diretor diretor = new Diretor(nome, sobrenome, nacionalidade);
        diretores.add(diretor);
    }

    public void cadastrarAtor(String nome, String sobrenome, String nacionalidade) {
        Atores ator = new Atores(nome, sobrenome, nacionalidade);
        atores.add(ator);
    }

    public void associarFilme(String nomeFilme, Diretor diretor, List<Atores> listaAtores) {
        Filme filme = filmes.get(nomeFilme.toLowerCase());
        if (filme != null) {
            filme.setDiretor(diretor);
            filme.setAtores(listaAtores);
        } else {
            System.out.println("Filme não encontrado no catálogo.");
        }
    }

    public void pesquisarFilme(String nome) {
        Filme filme = filmes.get(nome.toLowerCase());
        if (filme != null) {
            System.out.println("Filme encontrado:");
            System.out.println(filme);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public Map<String, Filme> getFilmes() {
        return filmes;
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public List<Atores> getAtores() {
        return atores;
    }
}



public class Diretor {
    private String nome;
    private String sobrenome;
    private String nacionalidade;

    public Diretor(String nome, String sobrenome, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}



public class Atores {
    private String nome;
    private String sobrenome;
    private String nacionalidade;

    public Atores(String nome, String sobrenome, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}



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
