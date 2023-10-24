import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date fechaHora = new Date();
        HotelReservation hotelReserva = new HotelReservation("Juan", "12345", "555-1234567", fechaHora, 101);
        hotelReserva.realizarReserva();
    }
    public static void cancelarReserva(){
        Date fechaHora = new Date();
        HotelReservation hotelReserva = new HotelReservation("Juan", "12345", "555-1234567", fechaHora, 101);
        hotelReserva.cancelarReserva();
    }
    }
