package orcamento.situacao;

import java.math.BigDecimal;
import orcamento.DomainException;
import orcamento.Orcamento;

public abstract class SituacaoOrcamento {

  public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
    return BigDecimal.ZERO;
  }

  public void aprovar(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser aprovado");
  }

  public void reprovar(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser reprovado");
  }

  public void finalizara(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser finalizar");
  }

}
