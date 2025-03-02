import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura o descripción: ");
        String nombreFactura = scanner.nextLine();

        System.out.print("Ingrese el precio del primer producto: ");
        double precio1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String resultado = "Factura: " + nombreFactura + "\n" +
                "Total Bruto: $" + String.format("%.2f", totalBruto) + "\n" +
                "Impuesto (19%): $" + String.format("%.2f", impuesto) + "\n" +
                "Total Neto: $" + String.format("%.2f", totalNeto);

        System.out.println("\n" + resultado);

        scanner.close();
    }
}
