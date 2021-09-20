package br.com.alura.loja.desconto.TiposDeDescontos;

import br.com.alura.loja.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentosComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentosComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }
}
