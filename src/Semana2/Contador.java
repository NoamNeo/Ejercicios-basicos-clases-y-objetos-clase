package Semana2;

public class Contador {
  private int valor;

  private int getValor() {
    return valor;
  }

  private void setValor(int valor) {
    this.valor = valor;
  }

  public Contador(int valor) {
    setValor(valor);
  }

  public void valorActual() {
    System.out.println("Valor actual: " + getValor());
  }

  public void incrementarContador() {
    setValor(getValor() + 5);
  }

  public void decrementarContador() {
    setValor((getValor() - 5 <= 0) ? 0 : getValor() - 5);
  }

  public void incrementarContador(int valor) {
    setValor((getValor() + valor <= 0) ? 0 : getValor() + valor);
  }

  public void decrementarContador(int valor) {
    setValor((getValor() - valor <= 0) ? 0 : getValor() - valor);
  }

  public void resetContador() {
    setValor(0);
  }
}
