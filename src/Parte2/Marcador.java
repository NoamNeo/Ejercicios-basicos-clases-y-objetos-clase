package Parte2;

public class Marcador {
  private String equipoLocal;
  private String equipoVisitante;
  private int golesLocal;
  private int golesVisitante;

  public Marcador() {
    golesLocal = 0;
    golesVisitante = 0;
  }

  public void resultado() {
    System.out.println(equipoLocal + " - " + equipoVisitante);
    System.out.println(golesLocal + " - " + golesVisitante);
  }

  public void setEquipoLocal(String equipoLocal) {
    this.equipoLocal = equipoLocal;
  }

  public void setEquipoVisitante(String equipoVisitante) {
    this.equipoVisitante = equipoVisitante;
  }

  public void golLocal() {
    golesLocal++;
  }

  public void golVisitante() {
    golesVisitante++;
  }
}
