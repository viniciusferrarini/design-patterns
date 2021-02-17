package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoCincoItens(new DescontoValorMaiorQueQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
