package composite;

public class PilhaAlcalina implements FornecedorDeEnergia {

  @Override
  public void fornecer() {
    System.out.println("PilhaAlcalina fornecendo energia...");
  }

}