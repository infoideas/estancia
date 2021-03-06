package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private Tipoid tipoid;
     private char tipo;
     private String numIdentificacion;
     private String apellido;
     private String nombre;
     private String nombreFantasia;
     private String razonSocial;
     private Set<Venta> ventas = new HashSet<Venta>(0);
     private Set<PersonaDireccion> personaDireccions = new HashSet<PersonaDireccion>(0);
     private Set<Mesa> mesas = new HashSet<Mesa>(0);

    public Persona() {
    }

	
    public Persona(Empresa empresa, char tipo) {
        this.empresa = empresa;
        this.tipo = tipo;
    }
    public Persona(Empresa empresa, Tipoid tipoid, char tipo, String numIdentificacion, String apellido, String nombre, String nombreFantasia, String razonSocial, Set<Venta> ventas, Set<PersonaDireccion> personaDireccions, Set<Mesa> mesas) {
       this.empresa = empresa;
       this.tipoid = tipoid;
       this.tipo = tipo;
       this.numIdentificacion = numIdentificacion;
       this.apellido = apellido;
       this.nombre = nombre;
       this.nombreFantasia = nombreFantasia;
       this.razonSocial = razonSocial;
       this.ventas = ventas;
       this.personaDireccions = personaDireccions;
       this.mesas = mesas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Tipoid getTipoid() {
        return this.tipoid;
    }
    
    public void setTipoid(Tipoid tipoid) {
        this.tipoid = tipoid;
    }
    public char getTipo() {
        return this.tipo;
    }
    
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public String getNumIdentificacion() {
        return this.numIdentificacion;
    }
    
    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreFantasia() {
        return this.nombreFantasia;
    }
    
    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }
    public Set<PersonaDireccion> getPersonaDireccions() {
        return this.personaDireccions;
    }
    
    public void setPersonaDireccions(Set<PersonaDireccion> personaDireccions) {
        this.personaDireccions = personaDireccions;
    }
    public Set<Mesa> getMesas() {
        return this.mesas;
    }
    
    public void setMesas(Set<Mesa> mesas) {
        this.mesas = mesas;
    }




}


