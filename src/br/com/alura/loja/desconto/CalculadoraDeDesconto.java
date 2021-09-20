package br.com.alura.loja.desconto;

import br.com.alura.loja.desconto.TiposDeDescontos.DescontoParaOrcamentosComMaisDeCincoItens;
import br.com.alura.loja.desconto.TiposDeDescontos.DescontoParaOrcamentosComValorMaiorQueQuinhentos;
import br.com.alura.loja.desconto.TiposDeDescontos.SemDesconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    // Pattern Chain of Reponsability
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentosComMaisDeCincoItens(
                new DescontoParaOrcamentosComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}

