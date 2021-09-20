package br.com.alura.loja.desconto.TiposDeDescontos;

import br.com.alura.loja.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentosComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentosComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
