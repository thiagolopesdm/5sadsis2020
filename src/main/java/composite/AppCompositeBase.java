package composite;

public class AppCompositeBase {

  public static void main(String[] args) {
    PilhaNormal pilhaNormal = new PilhaNormal();
    PilhaAlcalina pilhaAlcalina = new PilhaAlcalina();

    FornecedorComposite fornecedor = new FornecedorComposite();
    fornecedor.add(pilhaNormal);
    fornecedor.add(pilhaAlcalina);

    ControleRemoto controleDaSala = new ControleRemoto();

    // controleDaSala.setFornecedorDeEnergia(pilhaAlcalina);
    // controleDaSala.setFornecedorDeEnergia(pilhaNormal);
    controleDaSala.setFornecedorDeEnergia(fornecedor);

    controleDaSala.ligar();
    controleDaSala.trocarCanal(72);
    controleDaSala.trocarCanal(25);
    controleDaSala.desligar();

    System.out.println("Fim.");
  }

}