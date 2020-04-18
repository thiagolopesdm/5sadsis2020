package builder.lanche;

public class LancheApplication {

  public static void main(String[] args) {
    Lanche lancheNormal = new Lanche.Builder().bacon().calabresa().frango().alface().tomate().build();
    System.out.println(lancheNormal.getInfoLanche());

    Lanche lancheSemSalada = new Lanche.Builder().bacon().calabresa().frango().build();
    System.out.println(lancheSemSalada.getInfoLanche());

  }
}