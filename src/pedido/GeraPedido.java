package pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import orcamento.Orcamento;

public class GeraPedido {

  private String cliente;
  private BigDecimal valorOrcamento;
  private int quantidadeItens;

  public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
    this.cliente = cliente;
    this.valorOrcamento = valorOrcamento;
    this.quantidadeItens = quantidadeItens;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public BigDecimal getValorOrcamento() {
    return valorOrcamento;
  }

  public void setValorOrcamento(BigDecimal valorOrcamento) {
    this.valorOrcamento = valorOrcamento;
  }

  public int getQuantidadeItens() {
    return quantidadeItens;
  }

  public void setQuantidadeItens(int quantidadeItens) {
    this.quantidadeItens = quantidadeItens;
  }

  public void executa() {
    Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
    Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

    System.out.println("Salvar no banco de dados");
    System.out.println("Enviar email com dados do novo pedido");
  }

}
