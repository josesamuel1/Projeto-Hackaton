package data;

import java.util.ArrayList;

public class Usuario {
    // Características
    private String nome, email, senha;
    private double saldoTotal, saldoDisponivel;
    private ArrayList<Cofrinho> cofrinhos = new ArrayList<Cofrinho>();

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Métodos
    public void alterarSaldoDisponivel(double novoSaldo) {
        this.saldoDisponivel += novoSaldo;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
        this.saldoDisponivel = saldoTotal;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public ArrayList<Cofrinho> getCofrinhos() {
        return cofrinhos;
    }

    public void setCofrinhos(ArrayList<Cofrinho> cofrinhos) {
        this.cofrinhos = cofrinhos;
    }
}