public class DebitoCordoba {

    public void debitoCordoba(Cuenta cuenta, double monto){
        double saldoActual = cuenta.getSaldo();
        cuenta.setSaldo(saldoActual - monto);
    }

}
