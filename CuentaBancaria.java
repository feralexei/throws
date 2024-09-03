package Throws;

public class CuentaBancaria {
    private double saldoInicial;

    // constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public CuentaBancaria() {
        this.saldoInicial = 0;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    // método para realizar retiros
    public void retirar(double cantidad) throws SaldoInsuficienteException {

        // vrifica si el saldo es suficiente
        if (cantidad > saldoInicial) {
            //si no es suficiente lanza una excepcion
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro");
        } else {
            // actualiza el saldo
            saldoInicial -= cantidad;
            System.out.println("Retiro exitoso. Saldo restante: " + saldoInicial);
        }
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}