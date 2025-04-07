package clases;

import java.util.GregorianCalendar;
import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargo;
    private List<String> responsabilidades;

   public Administrativo(  String celular,
                           String nombre,
                           String apellido,
                           String telefono,
                           String correoElectronico,
                           List<Direccion> direcciones,
                           List<String> cargo,
                           List<String> responsabilidades) {
       super(celular, nombre, apellido, telefono, correoElectronico, direcciones);
   }

    public List<String> getCargo() {
        return cargo;
    }

    public void setCargo(List<String> cargo) {
        this.cargo = cargo;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}
