public class DebitoCordoba {

    public void debitoCordoba(cuenta cuenta, double monto){
        double saldoActual = cuenta.getSaldo();
        cuenta.setSaldo(saldoActual - monto);
    }

}
