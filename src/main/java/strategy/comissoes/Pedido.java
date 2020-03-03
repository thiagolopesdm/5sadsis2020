package strategy.comissoes;

import java.math.BigDecimal;

public class Pedido {
	private int numero;
	private BigDecimal valor;
	private CalculoDeComissao calculoDeComissao;

	public Pedido(int numero, BigDecimal valor) {
		this.numero = numero;
		this.valor = valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public BigDecimal getValor() {
		return valor;
	}

	public void setCalculoDeComissao(CalculoDeComissao calculoDeComissao) {
		this.calculoDeComissao = calculoDeComissao;		
	}

	public BigDecimal getValorDaComissao() {
		return this.calculoDeComissao.calcular(this.valor);
	}

}
