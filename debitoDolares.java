public class debitoDolares {

    public class ConvertidorDeMoneda {

        public  void main(String[] args) {
            double tasaDeCambio = 36.5;
            double montoEnDolares = 1;
            double montoEnCordobas = montoEnDolares * tasaDeCambio;
        }

        public void debitoDolares(Cuenta cuenta, double montoEnCordobas) {
            double saldoActual = cuenta.getSaldo();
            cuenta.setSaldo(saldoActual - montoEnCordobas);
        }

    }
}