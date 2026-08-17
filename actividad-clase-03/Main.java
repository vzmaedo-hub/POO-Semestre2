public class Main {
    public static void main(String[] args) {

        Reserva reserva1 = new Reserva("Control Xbox", 40000, 10);
        Reserva reserva2 = new Reserva("Cascos inalambricos Logitech", 60000, 5);

        reserva1.mostrarInformacion();
        reserva2.mostrarInformacion();

        reserva1.reservar(5);
        reserva1.reservar(30);

        reserva1.reservar(0);
        reserva1.reservar(-5);

        double total1 = reserva2.calcularTotal(2);
        System.out.println("Total sin descuento: " + total1);
        double total2 = reserva2.calcularTotal(2, 10);
        System.out.println("Total con un 10% de descuento: " + total2);

        reserva2.reservar(2);


    }
}
