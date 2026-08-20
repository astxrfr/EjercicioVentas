public class DetalleFactura {
    private Producto producto;
    private Factura factura;
    private int cantidad;

    public DetalleFactura(Producto producto, Factura factura, int cantidad) {
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;

        this.producto.addDetalle(this);
        this.factura.addDetalle(this);
    }

    public double calcularSubtotal() {
        return this.producto.getPrecioBase() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
}
