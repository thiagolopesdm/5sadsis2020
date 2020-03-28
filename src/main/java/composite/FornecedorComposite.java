package composite;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
  private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();

  public void add(FornecedorDeEnergia fe) {
    this.fornecedoresDeEnergia.add(fe);
  }

  @Override
  public void fornecer() {
    for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
      fe.fornecer();
    }
  }
}