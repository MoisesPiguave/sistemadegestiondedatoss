package clases;
import java.util.List;
public class Docente extends Persona {
        private List<String> titulosAcademicos;
        private List<String> areaEspecializacion;

        // Constructor
        public Docente(String cedula,
                       String nombre,
                       String apellido,
                       String celular,
                       String correoElectronico,
                       List<Direccion> direcciones,
                       List<String> titulosAcademicos,
                       List<String> areaEspecializacion) {

            super(cedula, nombre, apellido, celular, correoElectronico, direcciones);
            this.titulosAcademicos = titulosAcademicos;
            this.areaEspecializacion = areaEspecializacion;

        }
        // Getters y Setters
        public List<String> getTitulosAcademicos() {
            return titulosAcademicos;
        }

        public void setTitulosAcademicos(List<String> titulosAcademicos) {
            this.titulosAcademicos = titulosAcademicos;
        }

        public List<String> getAreaEspecializacion() {
            return areaEspecializacion;
        }

        public void setAreaEspecializacion(List<String> areaEspecializacion) {
            this.areaEspecializacion = areaEspecializacion;
        }
    }


