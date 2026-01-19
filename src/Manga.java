public class Manga {
  private String titulo;
  private String autor;
  private int numVolumen;
  private boolean leido;

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setNumVolumen(int numVolumen) {
    this.numVolumen = numVolumen;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setLeido(boolean leido) {
    this.leido = leido;
  }

  public String getAutor() {
    return autor;
  }

  public int getNumVolumen() {
    return numVolumen;
  }

  public String getTitulo() {
    return titulo;
  }

  public boolean getLeido() {
    return leido;
  }
}
