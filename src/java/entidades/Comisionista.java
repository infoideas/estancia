package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Comisionista generated by hbm2java
 */
public class Comisionista  implements java.io.Serializable {


     private Integer id;
     private CondIva condIva= new CondIva();
     private Localidad localidad= new Localidad();
     private Provincia provincia= new Provincia();
     private Tipoid tipoid= new Tipoid();
     private String tipo;
     private String numId;
     private String nombre;
     private String direccion;
     private String telefono;
     private String email;
     private String ccCostoTropa;
     private char estado;
     private Set<Tropa> tropas = new HashSet<Tropa>(0);
     private Set<Viaje> viajes = new HashSet<Viaje>(0);

    public Comisionista() {
    }

	
    public Comisionista(String tipo, String nombre, char estado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.estado = estado;
    }
    public Comisionista(CondIva condIva, Localidad localidad, Provincia provincia, Tipoid tipoid, String tipo, String numId, String nombre, String direccion, String telefono, String email, char estado, Set<Tropa> tropas, Set<Viaje> viajes) {
       this.condIva = condIva;
       this.localidad = localidad;
       this.provincia = provincia;
       this.tipoid = tipoid;
       this.tipo = tipo;
       this.numId = numId;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.estado = estado;
       this.tropas = tropas;
       this.viajes = viajes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public CondIva getCondIva() {
        return this.condIva;
    }
    
    public void setCondIva(CondIva condIva) {
        this.condIva = condIva;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public Tipoid getTipoid() {
        return this.tipoid;
    }
    
    public void setTipoid(Tipoid tipoid) {
        this.tipoid = tipoid;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNumId() {
        return this.numId;
    }
    
    public void setNumId(String numId) {
        this.numId = numId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCcCostoTropa() {
        return ccCostoTropa;
    }

    public void setCcCostoTropa(String ccCostoTropa) {
        this.ccCostoTropa = ccCostoTropa;
    }
    
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set<Tropa> getTropas() {
        return this.tropas;
    }
    
    public void setTropas(Set<Tropa> tropas) {
        this.tropas = tropas;
    }
    public Set<Viaje> getViajes() {
        return this.viajes;
    }
    
    public void setViajes(Set<Viaje> viajes) {
        this.viajes = viajes;
    }




}


