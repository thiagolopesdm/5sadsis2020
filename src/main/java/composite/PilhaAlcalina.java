package composite;

public class PilhaAlcalina implements FornecedorDeEnergia {

  private double energia = 0.4;

  @Override
  public double cargaDisponivel() {
    return energia;
  }

  public double fornecer() {
    if (this.cargaDisponivel() >= 0.1) {
      energia -= 0.1;
      System.out.println("PilhaAlcalina fornecendo energia...");
      return this.cargaDisponivel();
    } else {
      System.out.println("A pilha nao contem energia");
      return 0;
    }
  }

}