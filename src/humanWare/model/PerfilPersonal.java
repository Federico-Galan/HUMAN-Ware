package humanWare.model;
 
import java.util.Date;
import enums.Sexo;
 
public class PerfilPersonal {
 
    private String cuit;
    private Sexo sexo;
    private Date fechaNacimiento;
    private String nombre;
    private String mail;
    private String telefono;
 
    public PerfilPersonal(String cuit, Sexo sexo, Date fechaNacimiento,
            String nombre, String mail, String telefono) {
        this.cuit = cuit;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
    }
 
    public void actualizarDatos(String cuit, Sexo sexo, Date fechaNacimiento,
            String nombre, String mail, String telefono) {
        this.cuit = cuit;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        System.out.println("Datos personales actualizados correctamente.");
    }
 
    public void verDatos() {
        System.out.println("=== PERFIL PERSONAL ===");
        System.out.println("Nombre:          " + nombre);
        System.out.println("CUIT:            " + cuit);
        System.out.println("Sexo:            " + sexo);
        System.out.println("Fecha Nac.:      " + fechaNacimiento);
        System.out.println("Mail:            " + mail);
        System.out.println("Teléfono:        " + telefono);
        System.out.println("=======================");
    }
 
    public String getCuit() { return cuit; }
    public void setCuit(String cuit) { this.cuit = cuit; }
 
    public Sexo getSexo() { return sexo; }
    public void setSexo(Sexo sexo) { this.sexo = sexo; }
 
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
 
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
 
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
 
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
 
    @Override
    public String toString() {
        return "PerfilPersonal{nombre='" + nombre + "', cuit='" + cuit + "', mail='" + mail + "'}";
    }
}
 