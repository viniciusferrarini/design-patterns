package orcamento.situacao;

import orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

  @Override
  public void finalizara(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
  }
}
