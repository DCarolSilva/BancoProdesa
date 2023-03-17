public class CreditoDolares {

    public void acreditando(Cuenta cuenta, double montoEnCordobas) {
        double tasa = 36.7;
        double saldoActual = cuenta.getSaldo();
        cuenta.setSaldo(saldoActual + tasa * montoEnCordobas);
    }
}