package composite;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
  private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();
  private double energiaTotal = 0.0;

  public void add(FornecedorDeEnergia fe) {
    this.fornecedoresDeEnergia.add(fe);
  }

  @Override
  public double fornecer() {
    for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
      fe.fornecer();
      System.out.println(fe);
    }
    if (energiaTotal >= 0.1) {
      return energiaTotal;
    }

    System.out.println("Não tem mais energia");
    return 0;

  }
}