public class CreditoCordobas {
    public void realizarCreditoCordobas(cuenta cuenta, Double monto) {
        if(cuenta != null && monto != null && monto > 0) {
            Double saldo = cuenta.getSaldo();
            if (saldo == null || saldo <= 0 || saldo < monto){
                System.out.println("El saldo disponible es insuficiente");
            } else {
                saldo -= monto;
                cuenta.setSaldo(saldo);
                System.out.println("el saldo de su cuenta es: "+ cuenta.getSaldo());
            }
        }else {
            System.out.println("debe ingresar un monto mayor a 0 y la cuenta debe estar disponible");
        }
    }
}
