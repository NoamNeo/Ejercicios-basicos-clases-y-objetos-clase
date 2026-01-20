package Semana2;

public class CuentaBancaria {
  private String nombreTitular;
  private int saldo;

  public void imprimirEstado() {
    System.out.println(toString());
  }

  public String toString() {
    return "\nNombre Titular: " + getNombreTitular() + "\nSaldo de la cuenta: " + getSaldo();
  }

  public CuentaBancaria() {
    setNombreTitular(null);
    setSaldo(0);
  }

  public CuentaBancaria(String nombreTitular, int saldo) {
    setNombreTitular(nombreTitular);
    setSaldo(saldo);
  }

  private String getNombreTitular() {
    return nombreTitular;
  }

  private int getSaldo() {
    return saldo;
  }

  private void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
  }

  private void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public void ingresar(int saldo) {
    setSaldo((saldo < 0) ? 0 : saldo + getSaldo());
  }

  public int retirarSaldo(int saldo) {
    int dineroRetirar = (saldo <= 0) ? 0 : saldo;
    if (saldo > getSaldo()) {
      System.out.println("Saldo insuficiente");
      dineroRetirar = 0;
    } else {
      setSaldo(getSaldo() - dineroRetirar);
    }
    return dineroRetirar;
  }
}
