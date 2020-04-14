package template.musicPlayer;

public class Mp3Player extends Player {

  @Override
  public void play() {
    System.out.println("Executando musica em MP3...");
  }

  @Override
  public void stop() {
    System.out.println("Parando musica em MP3...");
  }

  @Override
  public void fastFoward() {
    System.out.println("Avançando música em 30 seg");

  }

  @Override
  public void skipSong() {
    System.out.println("Pulando Música");
  }

  @Override
  public void startOver() {
    System.out.println("Recomeçando música");
  }
}