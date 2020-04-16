package modelo;

public abstract class Persona {

        protected String nombre;
        protected String apellido;
        protected String dni;
        protected String telefono;
        protected String domicilio;
        protected String correo;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



         public void CargarPersona(){
                // Implementation Here.
        }

        public void EliminarPersona(){
                // Implementation Here.
        }

        public void ModificarPersona(){
                // Implementation Here.
        }

}
