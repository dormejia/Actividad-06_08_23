/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Renato
 */
public class clsEmpleado extends clssPersona {
    
    private String codigo,puesto;

    public clsEmpleado(String codigo, String puesto) {
        this.codigo = codigo;
        this.puesto = puesto;
    }

    public clsEmpleado(String codigo, String puesto, String Nombre, String Apellido, String Direccion, String Telefono, String Fecha_na) {
        super(Nombre, Apellido, Direccion, Telefono, Fecha_na);
        this.codigo = codigo;
        this.puesto = puesto;
    }
    public clsEmpleado(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String[] crear(){
        String dato []=new String[7];
        dato[0]= getCodigo();
        dato[1]= getPuesto();
        dato[2] = getNombre();
        dato[3] = getApellido();
        dato[4] = getDireccion();
        dato[5] = getTelefono();
        dato[6] = getFecha_na();
        
          
        System.out.println("Codigo:"+getCodigo());
        System.out.println("Puesto:"+getPuesto()); 
        System.out.println("Nombres:"+getNombre());
        System.out.println("Apellidos:"+getApellido());
        System.out.println("Direccion:"+getDireccion());
        System.out.println("Telefono"+getTelefono());
        System.out.println("Fecha"+getFecha_na());
        
        return dato;}
    
}
