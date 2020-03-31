package composite;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
  private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();

  public void add(FornecedorDeEnergia fe) {
    this.fornecedoresDeEnergia.add(fe);
  }

  @Override
  public double cargaDisponivel() {
    return this.fornecedoresDeEnergia.stream().map(FornecedorDeEnergia::cargaDisponivel).reduce(0.00, Double::sum);
  }

  @Override
  public double fornecer() {
    for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
      fe.fornecer();
    }
    if (this.cargaDisponivel() > 0.1) {
      return this.cargaDisponivel();
    }

    System.out.println("Não tem mais energia");
    return 0;

  }
}