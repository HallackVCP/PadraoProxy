package org.example;

public class Funcionario {
    private String nome;
    private boolean isGerente;

    public Funcionario(String nome, boolean isGerente) {
        this.nome = nome;
        this.isGerente = isGerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGerente() {
        return isGerente;
    }

    public void setGerente(boolean gerente) {
        this.isGerente = gerente;
    }
}
