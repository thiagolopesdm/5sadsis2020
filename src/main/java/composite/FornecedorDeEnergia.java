package composite;

public interface FornecedorDeEnergia {
  default double cargaDisponivel() {
    return 0;
  };

  double fornecer();

}