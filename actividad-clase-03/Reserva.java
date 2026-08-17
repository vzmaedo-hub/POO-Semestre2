public class Reserva {

    private String producto;
    private double precio;
    private int cantidadDisponible;

    public Reserva(String producto, double precio, int cantidadDisponible) {
        this.producto = producto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;

    }

    public void mostrarInformacion() {
        System.out.println("-----Reserva-----");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
    }

    public void reservar(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe de ser mayor a 0");
            return;
        }
        if (cantidad > cantidadDisponible) {
            System.out.println("Stock insuficiente para reservar " + cantidad + " unidades disponibles");
            return;
        }

        cantidadDisponible -= cantidad;
        System.out.println("Reserva realizada: " + cantidad + " unidades de " + producto);
        System.out.println("Stock restante: " + cantidadDisponible);
    }

    public double calcularTotal(int cantidad) {
        if (cantidad <= 0 || cantidad > cantidadDisponible) {
            System.out.println("Cantidad invalida para calcular el total");
            return 0;
        }
        return precio * cantidad;
    }

    public double calcularTotal(int cantidad, double porcentajeDescuento) {
        double totalSinDescuento = calcularTotal(cantidad);
        double montoDescuento = totalSinDescuento * porcentajeDescuento / 100;
        return totalSinDescuento - montoDescuento;
    }
}
