package Ej3;

public class Estudiante {
    private String nombre, apellido, comision, email, direccion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getComision() {
        return comision;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String tusDatos() {
        return "Estudiante [nombre=" + getNombre() + ", apellido=" + getApellido() + ", comision=" + getComision() + ", email=" + getEmail()
                + ", direccion=" + getDireccion() + "]";
    }
}
