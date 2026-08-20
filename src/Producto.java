public class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;
    private DetalleFactura[] ventas;

    public Producto(String codigo, String nombre, double precioBase, int ventasMaximas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.ventas = new DetalleFactura[ventasMaximas];
    }

    public double calcularIngresosTotales() {
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] == null) continue;
            total += ventas[i].calcularSubtotal();
        }

        return total;
    }

    public void addDetalle(DetalleFactura detalle) {
        for (int i = 0; i < ventas.length ; i++) {
            if (ventas[i] == null) {
                ventas[i] = detalle;
                return;
            }
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public DetalleFactura[] getVentas() {
        return ventas;
    }
}
