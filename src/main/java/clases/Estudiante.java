package clases;
import java.util.List;
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula,
                      String nombre,
                      String apellido,
                      String celular,
                      String correoElectronico,
                      List<Direccion> direcciones,
                      String carrera) {
        super(cedula, nombre, apellido, celular, correoElectronico, direcciones);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
