package Semana2;

public class Main {
  public static void main(String[] args) {
    // Ejercicio 1
    CuentaBancaria cuentaChula = new CuentaBancaria("Gabi", 5000);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos retirar 10000 de saldo");
    cuentaChula.retirarSaldo(10000);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos retirar 300 de saldo");
    cuentaChula.retirarSaldo(300);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos ingresar 100 de saldo");
    cuentaChula.ingresar(100);
    cuentaChula.imprimirEstado();
    // Fin ejercicio 1
  }
}
