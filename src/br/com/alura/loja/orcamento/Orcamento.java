package br.com.alura.loja.orcamento;

import br.com.alura.loja.desconto.TiposDeDescontos.DescontoParaOrcamentosComValorMaiorQueQuinhentos;
import br.com.alura.loja.orcamento.situacao.EmAnalise;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeDeItens;
    public SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDescontosExtra() {

        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

}
