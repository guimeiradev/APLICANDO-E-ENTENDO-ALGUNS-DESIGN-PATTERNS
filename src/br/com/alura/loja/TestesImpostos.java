package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.imposto.tipoDeImposto.ICMS;
import br.com.alura.loja.imposto.tipoDeImposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        ISS iss = new ISS();
        ICMS icms = new ICMS();

        System.out.println(calculadora.calcular(orcamento, iss));
    }
}
