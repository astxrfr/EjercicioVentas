import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("lays", "Lays Clasicas", 10, 10);
        Producto prod2 = new Producto("pepsi", "Pepsi", 5, 10);
        Producto prod3 = new Producto("cereal", "Cereal", 20, 10);
        Producto prod4 = new Producto("doritos", "Doritos", 8, 10);
        Producto[] productos = {prod1, prod2, prod3, prod4};

        Factura factura1 = new Factura(1, LocalDate.now(), "Carlos", 3);
        Factura factura2 = new Factura(2, LocalDate.now(), "David", 2);
        Factura factura3 = new Factura(3, LocalDate.now(), "Daniel", 3);
        Factura[] facturas = {factura1, factura2, factura3};

        DetalleFactura det1 = new DetalleFactura(prod1, factura1, 2);
        DetalleFactura det2 = new DetalleFactura(prod2, factura1, 4);
        DetalleFactura det3 = new DetalleFactura(prod4, factura1, 1);

        DetalleFactura det4 = new DetalleFactura(prod4, factura2, 3);
        DetalleFactura det5 = new DetalleFactura(prod3, factura2, 10);

        DetalleFactura det6 = new DetalleFactura(prod2, factura3, 9);
        DetalleFactura det7 = new DetalleFactura(prod4, factura3, 2);
        DetalleFactura det8 = new DetalleFactura(prod1, factura3, 4);

        for (Factura factura : facturas) {
            System.out.println(factura.getNombreCliente()+" debe pagar "+factura.calcularTotal());
        }

        Producto menor = productos[0];
        for (Producto producto : productos) {
            if (producto.calcularIngresosTotales() < menor.calcularIngresosTotales()) menor = producto;
        }

        System.out.println(menor.getNombre()+" genero la menor cantidad de ingresos: "+menor.calcularIngresosTotales());

        Factura mayor = facturas[0];
        for (Factura factura : facturas) {
            if (factura.calcularTotal() > mayor.calcularTotal()) mayor = factura;
        }

        System.out.println("La factura #"+mayor.getNumero()+" genero la mayor cantidad de ingresos con: "+mayor.calcularTotal());
    }
}
