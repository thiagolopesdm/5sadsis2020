package strategy.comissoes;

import java.math.BigDecimal;

public class AppStrategyComissoes {
	
	public static void main(String[] args) {
		//CalculoDeComissao cdcn = new CalculoDeComissaoNormal();
		CalculoDeComissao cdcn = new CalculoDeComissaoBonificado(new BigDecimal("5.00"));
		Pedido p1 = new Pedido(555, new BigDecimal("200.00"));
		p1.setCalculoDeComissao(cdcn);
		System.out.println(p1.getValorDaComissao());
	}

}
