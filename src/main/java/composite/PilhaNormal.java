package composite;

public class PilhaNormal implements FornecedorDeEnergia {

  private double energia = 0.4;

  @Override
  public double cargaDisponivel() {
    return energia;
  }

  @Override
  public double fornecer() {
    if (this.cargaDisponivel() >= 0.1) {
      energia -= 0.1;
      System.out.println("PilhaNormal fornecendo energia....");
      return this.cargaDisponivel();
    } else {
      System.out.println("A pilha nao contem energia");
      return 0;
    }
  }

}