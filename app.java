import java.io.*;

public class app {
     public static void main(String[] args) {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         cuenta c = new cuenta();
         c.setSaldo(1000d);

         System.out.printf("\nSaldo inicial: %.2f", c.getSaldo());

         boolean running = true;
         while (running) {
             System.out.print("\n\n==========================Opciones==========================");
             System.out.println("1. Credito moneda local");
             System.out.println("2. Credito dolar");
             System.out.println("3. Credito moneda local");
             System.out.println("4. Credito dolar");
             System.out.println("5. Salir");

             switch (leerInt("Digite su opcion", bf)) {
                 case 1:
                     //OPCION 1
                     break;
                 case 2:
                     //OPCION 2
                     break;
                 case 3:
                     //OPCION 3
                     break;
                 case 4:
                     //OPCION 4
                     break;
                 case 5:
                     running = false;
                     System.out.println("\n\nBye");
                     break;
             }
         }



    }

    private static double leerDouble(String mensaje, BufferedReader in) {
         boolean noPass = true;
         Double value = null;
         while (noPass) {
             try {
                 System.out.println(mensaje.concat(": "));
                 value = Double.parseDouble(in.readLine());
                 noPass = false;
             }catch (IOException e) {
                 System.err.println("\n\tEl argumento no es un número");
             }
         }
         return value;
    }
    private static int leerInt(String mensaje, BufferedReader in) {
        boolean noPass = true;
        Integer value = null;
        while (noPass) {
            try {
                System.out.println(mensaje.concat(": "));
                value = Integer.parseInt(in.readLine());
                noPass = false;
            }catch (IOException e) {
                System.err.println("\n\tEl argumento no es un número entero");
            }
        }
        return value;
    }
}
