import java.util.Date;
class RestaurantReservation extends Reserva {
    private int numeroMesa;

    public RestaurantReservation(String nombre, String documento, String numeroContacto, Date fechaHora, int numeroMesa) {
        super(nombre, documento, numeroContacto, fechaHora, "mesa de restaurante");
        this.numeroMesa = numeroMesa;
    }

}
