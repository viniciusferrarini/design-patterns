import java.math.BigDecimal;
import java.util.Arrays;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesDePedidos {

  public static void main(String[] args) {
    String cliente = "Vinicius";
    BigDecimal valorOrcamento = new BigDecimal(200);
    int quantidadeItens = 5;

    GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    GeraPedidoHandler handler = new GeraPedidoHandler(
        Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
    );
    handler.execute(gerador);

  }

}
