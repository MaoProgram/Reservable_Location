import java.util.Date;
class HotelReservation extends Reserva {
    private int numeroHabitacion;

    public HotelReservation(String nombre, String documento, String numeroContacto, Date fechaHora, int numeroHabitacion) {
        super(nombre, documento, numeroContacto, fechaHora, "hotel");
        this.numeroHabitacion = numeroHabitacion;
    }

}