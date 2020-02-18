package template;

public class AppTemplate {
	
	public static void main(String[] args) {
		CalculadoraDeFolhaDePagamento calcFP = new CalculadoraDeFolhaDePagamentoConcreta();
		
		CalculoMensal calculoMensalDoJoaquim = calcFP.calcular(2,2020, "55545-4");
	
		System.out.println(calculoMensalDoJoaquim.getTotal());
		
	}

}
