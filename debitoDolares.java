public class debitoDolares {
    public void hacerDebitoDolares (cuenta cuenta,Double monto)
    {
        if(cuenta != null && monto != null) {
            Double saldo = cuenta.getSaldo();
            if (saldo == null || saldo <= 0 || saldo <) {
                System.out.println("El saldo disponible no es suficiente");
            }
        }
    }
}