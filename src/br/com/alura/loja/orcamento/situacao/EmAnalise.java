package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return  orcamento.getValor().multiply(new BigDecimal("0.0.5"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
