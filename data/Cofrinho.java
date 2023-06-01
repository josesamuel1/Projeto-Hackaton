package data;

public class Cofrinho {
    // Características
    private String nome, descricao;
    private double saldoGuardado;

    // Construtor
    public Cofrinho(String nome, String descricao, double saldoGuardado) {
        this.nome = nome;
        this.descricao = descricao;
        this.saldoGuardado = saldoGuardado;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldoGuardado() {
        return saldoGuardado;
    }

    public void setSaldoGuardado(double saldoGuardado) {
        this.saldoGuardado = saldoGuardado;
    }
}
