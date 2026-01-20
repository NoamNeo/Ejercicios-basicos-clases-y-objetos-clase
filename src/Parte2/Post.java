package Parte2;

public class Post {
  private String titulo;
  private int likes;
  private int dislikes;

  public Post() {
    setTitulo("Mega Título");
    setDislikes(0);
    setLikes(0);
  }

  public String getTitulo() {
    return titulo;
  }

  public int getDislikes() {
    return dislikes;
  }

  public int getLikes() {
    return likes;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDislikes(int dislikes) {
    this.dislikes = dislikes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public void darLike() {
    setLikes(getLikes() + 1);
  }

  public void darDislike() {
    setDislikes(getDislikes() + 1);
  }

  public int getPopularidad() {
    return getLikes() - getDislikes();
  }
}
