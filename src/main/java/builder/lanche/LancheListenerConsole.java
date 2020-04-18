package builder.lanche;

public class LancheListenerConsole implements LancheListener {

  @Override
  public void foiAdicionadoFrango() {
    System.out.println(">> Foi adicionado Frango no lanche");
  }

  @Override
  public void foiAdicionadoBacon() {
    System.out.println(">> Foi adicionado Bacon no lanche");
  }

  @Override
  public void foiAdicionadoCalabresa() {
    System.out.println(">> Foi adicionado Calabresa no lanche");
  }

  @Override
  public void foiAdicionadoTomate() {
    System.out.println(">> Foi adicionado Tomate no lanche");

  }

  @Override
  public void foiAdicionadoAlface() {
    System.out.println(">> Foi adicionado Alface no lanche");
  }

}