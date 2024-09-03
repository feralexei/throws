package Throws;

public class GestionDeCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        try {
            cuenta.retirar(500);
            cuenta.retirar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
