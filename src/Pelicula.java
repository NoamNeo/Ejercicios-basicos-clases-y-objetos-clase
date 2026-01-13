public class Pelicula {
  private String titulo;
  private String director;
  private int anhoEstreno;
  private int duracion;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getDirector() {
    return this.director;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public int getDuracion() {
    return this.duracion;
  }

  public void setEstreno(int anhoEstreno) {
    this.anhoEstreno = anhoEstreno;
  }

  public int getEstreno() {
    return this.anhoEstreno;
  }
}
