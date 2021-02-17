import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;
import imposto.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 0);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }

}
