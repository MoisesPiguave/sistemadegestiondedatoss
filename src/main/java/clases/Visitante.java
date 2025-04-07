package clases;
import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivoVisita;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String cedula,
                     String nombre,
                     String apellido,
                     String celular,
                     String correoElectronico,
                     List<Direccion> direcciones,
                     String motivoVisita,
                     GregorianCalendar fechaEntrada,
                     GregorianCalendar fechaSalida) {

        super(cedula, nombre, apellido, celular, correoElectronico, direcciones);
        this.motivoVisita = motivoVisita;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


}