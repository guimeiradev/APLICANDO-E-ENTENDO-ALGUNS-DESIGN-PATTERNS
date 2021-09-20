package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

// Utilizando o comportamento Strategy
public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
