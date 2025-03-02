import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura:");
             String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto:");
             double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto:");
             double precio2 = scanner.nextDouble();

             double totalBruto = precio1 + precio2;
             double impuesto = totalBruto * 0.19;
             double totalNeto = totalBruto + impuesto;

        String detalle = "Nombre de la factura: " + nombreFactura + "\n" +
                         "Monto total bruto: " + totalBruto + "\n" +
                         "Impuesto: " + impuesto + "\n" +
                         "Monto total neto: " + totalNeto + "\n";

        System.out.println(detalle);
    }
}
