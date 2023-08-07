/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Renato
 */
abstract class clssPersona {
    private String Nombre;  
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String Fecha_na;

    public clssPersona(){};
    public clssPersona(String Nombre, String Apellido, String Direccion, String Telefono, String Fecha_na) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Fecha_na = Fecha_na;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFecha_na() {
        return Fecha_na;
    }

    public void setFecha_na(String Fecha_na) {
        this.Fecha_na = Fecha_na;
    }
    // metodos
    protected String[] crear(){return null;}
    protected void modificar(){}
    protected void buscar(){}
    protected void eliminar(){}
    
}
