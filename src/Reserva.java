import java.util.Date;
class Reserva implements ReservableI {
        private String nombre;
        private String documento;
        private String numeroContacto;
        private Date fechaHora;
        private String descripcionReserva;

        public Reserva(String nombre, String documento, String numeroContacto, Date fechaHora, String descripcionReserva) {
            this.nombre = nombre;
            this.documento = documento;
            this.numeroContacto = numeroContacto;
            this.fechaHora = fechaHora;
            this.descripcionReserva = descripcionReserva;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public String getNumeroContacto() {
            return numeroContacto;
        }

        public void setNumeroContacto(String numeroContacto) {
            this.numeroContacto = numeroContacto;
        }

        public Date getFechaHora() {
            return fechaHora;
        }

        public void setFechaHora(Date fechaHora) {
            this.fechaHora = fechaHora;
        }

        public String getDescripcionReserva() {
            return descripcionReserva;
        }

        public void setDescripcionReserva(String descripcionReserva) {
            this.descripcionReserva = descripcionReserva;
        }

        @Override
        public void realizarReserva() {
            System.out.println("Reserva realizada con éxito para " + descripcionReserva);
        }

        @Override
        public void cancelarReserva() {
            System.out.println("Reserva cancelada para " + descripcionReserva);
        }

    }
