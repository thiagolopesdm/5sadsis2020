package builder.lanche;

import java.util.HashSet;
import java.util.Set;

public class Lanche {

  private Set<LancheListener> listeners;

  private int tamanho;
  private boolean frango;
  private boolean bacon;
  private boolean calabresa;
  private boolean alface;
  private boolean tomate;

  private String infoLanche;

  private Lanche(Builder builder) {
    listeners = builder.listeners;
    frango = builder.frango;
    bacon = builder.bacon;
    calabresa = builder.calabresa;
    alface = builder.alface;
    tomate = builder.tomate;
    infoLanche = builder.infoLanche;
  }

  public String getInfoLanche() {
    return infoLanche;
  }

  public static class Builder {
    private Set<LancheListener> listeners = new HashSet<>();

    private boolean frango = false;
    private boolean bacon = false;
    private boolean calabresa = false;
    private boolean alface = false;
    private boolean tomate = false;
    private String infoLanche = "Lanche com:";

    public Builder() {
      this.listeners.add(new LancheListenerConsole());
    }

    public Builder frango() {
      infoLanche += " Frango";
      frango = true;
      for (LancheListener listener : this.listeners) {
        listener.foiAdicionadoFrango();
      }
      return this;
    }

    public Builder bacon() {
      infoLanche += " Bacon";
      bacon = true;
      for (LancheListener listener : this.listeners) {
        listener.foiAdicionadoBacon();
      }
      return this;
    }

    public Builder calabresa() {
      infoLanche += " Calabresa";
      calabresa = true;
      for (LancheListener listener : this.listeners) {
        listener.foiAdicionadoCalabresa();
      }
      return this;
    }

    public Builder alface() {
      infoLanche += " Alface";
      alface = true;
      for (LancheListener listener : this.listeners) {
        listener.foiAdicionadoAlface();
      }
      return this;
    }

    public Builder tomate() {
      infoLanche += " Tomate";
      tomate = true;
      for (LancheListener listener : this.listeners) {
        listener.foiAdicionadoTomate();
      }
      return this;
    }

    public Lanche build() {
      return new Lanche(this);
    }
  }
}