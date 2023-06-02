package br.com.si.data;

/**
 * Classe que representa um cofrinho.
 */
public class Cofrinho {

    // Características
    private String nome, descricao;
    private double saldoGuardado;


    /**
     * Construtor da classe Cofrinho.
     *
     * @param nome O nome do cofrinho.
     * @param descricao A descrição do cofrinho.
     * @param saldoGuardado O saldo guardado no cofrinho.
     */
    public Cofrinho(String nome, String descricao, double saldoGuardado) {
        this.nome = nome;
        this.descricao = descricao;
        this.saldoGuardado = saldoGuardado;
    }

    /**
     * Obtém o nome do cofrinho.
     *
     * @return O nome do cofrinho.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cofrinho.
     *
     * @param nome O novo nome do cofrinho.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a descrição do cofrinho.
     *
     * @return A descrição do cofrinho.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do cofrinho.
     *
     * @param descricao A nova descrição do cofrinho.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o saldo guardado no cofrinho.
     *
     * @return O saldo guardado no cofrinho.
     */
    public double getSaldoGuardado() {
        return saldoGuardado;
    }

    /**
     * Define o saldo guardado no cofrinho.
     *
     * @param saldoGuardado O novo saldo guardado no cofrinho.
     */
    public void setSaldoGuardado(double saldoGuardado) {
        this.saldoGuardado = saldoGuardado;
    }
}
