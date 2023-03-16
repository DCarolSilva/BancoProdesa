import java.io.*;

public class app {
     public static void main(String[] args) {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         Cuenta c = new Cuenta();
         c.setSaldo(1000d);

         System.out.printf("\nSaldo inicial: C$%.2f", c.getSaldo()); 

         boolean running = false;
         while (running) {
             System.out.println("\n\n==========================Opciones==========================");
             System.out.println("1. Credito moneda local");
             System.out.println("2. Credito dolar");
             System.out.println("3. Debito moneda local");
             System.out.println("4. Debito dolar");
             System.out.println("5. Salir");

             switch (leerInt("Digite su opcion", bf)) {
                 case 1:
                     //OPCION 1 - Credito moneda local
                     new CreditoCordobas().realizarCreditoCordobas(c, leerDouble("Monto a acreditar en moneda local", bf));
                     break;
                 case 2:
                     //OPCION 2 - Credito dolar
                     System.err.println("\n\n\t*****EN DESARROLLO*****\n\n");
                     break;
                 case 3:
                     //OPCION 3 - Debito moneda local
                     new DebitoCordoba().debitoCordoba(c, leerDouble("Monto a debitar moneda local", bf));
                     break;
                 case 4:
                     //OPCION 4 - Debito dolar
                     new debitoDolares().new ConvertidorDeMoneda().debitoDolares(c, leerDouble("Monto a debitar dolares", bf));
                     break;
                 case 5:
                     running = false;
                     System.out.println("\n\nBye... until tomorrow");
                     break;
             }

             System.out.printf("\n\t*** Saldo actual: C$%.4f ***\n", c.getSaldo());
         }

/// modificación Danny

    }
    /// modificación Danny
    private static double leerDouble(String mensaje, BufferedReader in) {
         boolean noPass = true;
         Double value = null;
         while (noPass) {
             try {
                 System.out.print(mensaje.concat(": "));
                 value = Double.parseDouble(in.readLine());
                 noPass = false;
             }catch (IOException e) {
                 System.out.println("\n\tEl argumento no es un número");
             }
         }
         return value;
    }
    private static int leerInt(String mensaje, BufferedReader in) {
        boolean noPass = true;
        Integer value = null;
        while (noPass) {
            try {
                System.out.print(mensaje.concat(": "));
                value = Integer.parseInt(in.readLine());
                noPass = false;
            }catch (NumberFormatException | IOException e) {
                System.out.println("\n\tEl argumento no es un número");
            }
        }
        return value;
    }
    /// modificación Danny
}
