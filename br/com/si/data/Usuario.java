package br.com.si.data;

import java.util.ArrayList;

/**
 * Classe que representa um usuário.
 *
 * @version 1.0
 */

public class Usuario {
    // Características
    private String nome, email, senha, cpf, celular;
    private double saldoTotal, saldoDisponivel;
    private ArrayList<Cofrinho> cofrinhos = new ArrayList<Cofrinho>();

    /**
     * Construtor da classe Usuario.
     * 
     * @param nome    O nome do usuário.
     * @param email   O endereço de e-mail do usuário.
     * @param senha   A senha do usuário.
     * @param cpf     O cpf do usuário.
     * @param celular O número de celular do usuário.
     */
    public Usuario(String nome, String email, String senha, String cpf, String celular) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.celular = celular;
    }

    /**
     * Altera o saldo disponível do usuário.
     *
     * @param novoSaldo O novo saldo a ser definido.
     */

    public void alterarSaldoDisponivel(double novoSaldo) {
        this.saldoDisponivel += novoSaldo;
    }

    // Getters & Setters

    /**
     * Obtém o nome do usuário.
     *
     * @return O nome do usuário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do usuário.
     *
     * @param nome O novo nome do usuário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço de e-mail do usuário.
     *
     * @return O endereço de e-mail do usuário.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de e-mail do usuário.
     *
     * @param email O novo endereço de e-mail do usuário.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o cpf do usuário.
     *
     * @return O cpf do usuário.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o cpf do usuário.
     *
     * @param cpf O novo cpf do usuário.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o cpf do usuário.
     *
     * @return O cpf do usuário.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o celular do usuário.
     *
     * @param celular O novo celular do usuário.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return A senha do usuário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuário.
     *
     * @param senha A nova senha do usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém o saldo total do usuário.
     *
     * @return O saldo total do usuário.
     */
    public double getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * Define o saldo total do usuário.
     *
     * @param saldoTotal O novo saldo total do usuário.
     */
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
        this.saldoDisponivel = saldoTotal;
    }

    /**
     * Obtém o saldo disponível do usuário.
     *
     * @return O saldo disponível do usuário.
     */
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    /**
     * Define o saldo disponível do usuário.
     *
     * @param saldoDisponivel O novo saldo disponível do usuário.
     */
    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    /**
     * Obtém a lista de cofrinhos do usuário.
     *
     * @return A lista de cofrinhos do usuário.
     */
    public ArrayList<Cofrinho> getCofrinhos() {
        return cofrinhos;
    }

    /**
     * Define a lista de cofrinhos do usuário.
     *
     * @param cofrinhos A nova lista de cofrinhos do usuário.
     */
    public void setCofrinhos(ArrayList<Cofrinho> cofrinhos) {
        this.cofrinhos = cofrinhos;
    }
}