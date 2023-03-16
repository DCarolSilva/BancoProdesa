public class debitoDolares {

    private class ConvertidorDeMoneda {

        public static void main(String[] args) {
            double tasaDeCambio = 36.5;
            double montoEnDolares = monto;
            double montoEnCordobas = montoEnDolares * tasaDeCambio;
        }

        public void debitoDolares(cuenta cuenta, double montoEnCordobas) {
            double saldoActual = cuenta.getSaldo();
            cuenta.setSaldo(saldoActual - montoEnCordobas);
        }

    }
}