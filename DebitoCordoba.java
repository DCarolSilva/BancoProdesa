public class DebitoCordoba {

    public void debitoCordoba(Cuenta cuenta, double monto){
        Double saldo = cuenta.getSaldo();
        saldo -= monto; 
        cuenta.setSaldo(saldo);
        System.out.println("el saldo de su cuenta es: "+ cuenta.getSaldo());
    }

}
