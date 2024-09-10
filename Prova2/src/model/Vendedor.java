package model;

import java.time.LocalDate;

public class Vendedor extends Pessoa {
    
    private double percentualComissao;

    public Vendedor(String nome, LocalDate dataNascimento, double percentualComissao) {
        super(nome, dataNascimento);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
