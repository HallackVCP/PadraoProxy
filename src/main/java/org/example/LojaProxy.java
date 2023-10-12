package org.example;

import java.util.List;

public class LojaProxy implements ILoja{

    private Loja loja;

    private Integer nrUnidade;

    public LojaProxy(Integer nrUnidade) {
        this.nrUnidade = nrUnidade;
    }


    @Override
    public String obterDadosLoja() {
        if (this.loja == null) {
            this.loja = new Loja(this.nrUnidade);
        }
        return this.loja.obterDadosLoja();
    }

    @Override
    public double obterFaturamento(Funcionario funcionario) {
        if (!funcionario.isGerente()) {
            throw new IllegalArgumentException("Funcionário não é gerente, sem autorizacao");
        }
        if (this.loja == null) {
            this.loja = new Loja(this.nrUnidade);
        }
        return this.loja.obterFaturamento(funcionario);
    }
}
