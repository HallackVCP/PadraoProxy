package org.example;

import java.util.Arrays;
import java.util.List;

public class Loja implements ILoja{

    private Integer nrUnidade;

    private String nome;

    private String numero;

    private String cidade;

    private String bairro;

    private String rua;

    private double faturamento;

    public Loja(Integer nrUnidade, String nome, String numero, String cidade, String bairro, String rua, double faturamento) {
        this.nrUnidade = nrUnidade;
        this.nome = nome;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.faturamento = faturamento;
    }
    public Loja(Integer nrUnidade) {
        this.nrUnidade = nrUnidade;
        Loja objeto = BD.getLoja(nrUnidade);
        this.nome = objeto.getNome();
        this.numero = objeto.getNumero();
        this.cidade = objeto.getCidade();
        this.bairro = objeto.getBairro();
        this.rua = objeto.getRua();
        this.faturamento = objeto.getFaturamento();
    }

    public Integer getNrUnidade() {
        return nrUnidade;
    }

    public void setNrUnidade(Integer nrUnidade) {
        this.nrUnidade = nrUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String  numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String obterDadosLoja() {
        return (this.getNome() +", " +this.getCidade() +", " + this.getBairro() +", " + this.getRua() +", " + this.getNumero());
    }

    @Override
    public double obterFaturamento(Funcionario funcionario) {
        return this.getFaturamento();
    }
}
