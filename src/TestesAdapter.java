import http.JavaHttpClient;
import java.math.BigDecimal;
import orcamento.Orcamento;
import orcamento.RegistroDeOrcamento;

public class TestesAdapter {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
    orcamento.aprovar();
    orcamento.finalizar();

    RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
    registro.regristrar(orcamento);

  }

}
