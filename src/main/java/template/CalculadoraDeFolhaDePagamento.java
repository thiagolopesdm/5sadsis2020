package template;

import java.util.List;

public abstract class CalculadoraDeFolhaDePagamento {

	/**
	 * Processa a folha de pagamento retornando um CalculoMensal para determinado mes e ano de determinada matrícula
	 * @param mes
	 * @param ano
	 * @param matricula
	 * @return O cálculo mensal que representa a folha do mês em questão
	 */
	public CalculoMensal calcular(int mes, int ano, String matricula) {
		double salarioBase = obterSalarioBase(matricula, mes, ano);
		double salarioFamilia = calcularSalarioFamilia(matricula, mes, ano);
		double descontoConsignado = obterDescontoConsignado(matricula, mes, ano);
		double horasExtras = calcularHorasExtras(recuperarRegistrosDeHorasExtras(matricula, mes, ano));
		
		double baseDeCalculo = salarioBase + salarioFamilia + horasExtras;
		double irRetidoNaFonte = calcularIrRetido(baseDeCalculo);
		
		
		return new CalculoMensal(baseDeCalculo-irRetidoNaFonte-descontoConsignado);
	}

	protected abstract List<RegistroDeHorasExtras> recuperarRegistrosDeHorasExtras(String matricula, int mes, int ano);

	protected abstract double calcularIrRetido(double baseDeCalculo);

	protected abstract double calcularHorasExtras(List<RegistroDeHorasExtras> registros);

	protected abstract double obterDescontoConsignado(String matricula, int mes, int ano);

	protected abstract double calcularSalarioFamilia(String matricula, int mes, int ano);

	protected abstract double obterSalarioBase(String matricula, int mes, int ano);

}
