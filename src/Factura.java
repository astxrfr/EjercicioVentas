import java.time.LocalDate;

public class Factura {
    private int numero;
    private LocalDate fecha;
    private String nombreCliente;
    private DetalleFactura[] detalles;

    public Factura(int numero, LocalDate fecha, String nombreCliente, int ventas) {
        this.numero = numero;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.detalles = new DetalleFactura[ventas];
    }

    public void addDetalle(DetalleFactura detalle) {
        for (int i = 0; i < detalles.length ; i++) {
            if (detalles[i] == null) {
                detalles[i] = detalle;
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (DetalleFactura detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public DetalleFactura[] getDetalles() {
        return detalles;
    }
}
