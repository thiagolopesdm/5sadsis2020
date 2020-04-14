package template.musicPlayer;

public abstract class Player {

  public final void executar() {
    play();
    skipSong();
    fastFoward();
    startOver();
    stop();
  }

  public abstract void play();

  public abstract void stop();

  public abstract void skipSong();

  public abstract void fastFoward();

  public abstract void startOver();

}