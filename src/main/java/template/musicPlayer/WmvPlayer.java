package template.musicPlayer;

public class WmvPlayer extends Player {

  @Override
  public void play() {
    System.out.println("Executando um vídeo WMV...");
  }

  @Override
  public void stop() {
    System.out.println("Parando um vídeo WMV...");
  }

  @Override
  public void fastFoward() {
    System.out.println("Avançando vídeo em 30 seg");

  }

  @Override
  public void skipSong() {
    // TODO Auto-generated method stub
  }

  @Override
  public void startOver() {
    System.out.println("Recomeçando vídeo");
  }
}