package clases;

import java.util.List;

public class Persona {
    private String cedula;
    private String telefono;
    private String nombre;
    private String apellido;
    private String correo;
    private String[] direcciones;
    private String[] instituciones;


    // Constructor
    public Persona(String cedula,
                   String nombre,
                   String apellido,
                   String telefono,
                   String correoElectronico,
                   String[]direcciones,
                   String[] instituciones) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correoElectronico;
        this.direcciones = direcciones;
        this.instituciones = instituciones;
    }

    public Persona(String celular, String nombre, String apellido, String telefono, String correoElectronico, java.util.List<clases.Direccion> direcciones) {
    }


    public String getCedula() {
    return cedula;
}

public void setCedula(String cedula) {
    this.cedula = cedula;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public String[] getDirecciones() {
    return direcciones;
}

public void setDirecciones(String[] direcciones) {
    this.direcciones = direcciones;
}

public String[] getInstitucion() {
    return instituciones;
}

public void setInstitucion(String[] institucion) {
    this.instituciones = institucion;
}

    @Override
    public String toString() {
        return "Persona{" + "cedula='" + cedula +   ", nombre='" + nombre +  ", apellido='" + apellido  + ", telefono='" + telefono +  ", correo='" + correo +  ", direccion=" + ( direcciones) + ", institucion=" + ( instituciones) + '}';
    }


}
