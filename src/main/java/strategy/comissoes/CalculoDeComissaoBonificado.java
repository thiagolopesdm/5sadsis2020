package strategy.comissoes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoDeComissaoBonificado implements CalculoDeComissao {

	private BigDecimal bonus;

	public CalculoDeComissaoBonificado(BigDecimal bonus) {
		this.bonus = bonus;
	}

	@Override
	public BigDecimal calcular(BigDecimal valor) {
		return valor.multiply(new BigDecimal("0.12")).setScale(2, RoundingMode.DOWN).add(bonus);
	}

}
