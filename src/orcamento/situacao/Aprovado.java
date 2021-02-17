package orcamento.situacao;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.02"));
  }

  @Override
  public void finalizara(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
  }
}
