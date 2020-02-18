package template;

import java.util.List;

public class CalculadoraDeFolhaDePagamentoConcreta extends CalculadoraDeFolhaDePagamento {

	@Override
	protected List<RegistroDeHorasExtras> recuperarRegistrosDeHorasExtras(String matricula, int mes, int ano) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected double calcularIrRetido(double baseDeCalculo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcularHorasExtras(List<RegistroDeHorasExtras> registros) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double obterDescontoConsignado(String matricula, int mes, int ano) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcularSalarioFamilia(String matricula, int mes, int ano) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double obterSalarioBase(String matricula, int mes, int ano) {
		// TODO Auto-generated method stub
		return 0;
	}

}
