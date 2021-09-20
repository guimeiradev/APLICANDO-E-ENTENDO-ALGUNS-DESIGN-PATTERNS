package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Finalizado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
