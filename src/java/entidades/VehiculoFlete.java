package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * VehiculoFlete generated by hbm2java
 */
public class VehiculoFlete  implements java.io.Serializable {


     private Short id;
     private String nombre;
     private String patente;
     private char estado;
     private Set<Viaje> viajes = new HashSet<Viaje>(0);

    public VehiculoFlete() {
    }

	
    public VehiculoFlete(String nombre, char estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public VehiculoFlete(String nombre, String patente, char estado, Set<Viaje> viajes) {
       this.nombre = nombre;
       this.patente = patente;
       this.estado = estado;
       this.viajes = viajes;
    }
   
    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPatente() {
        return this.patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set<Viaje> getViajes() {
        return this.viajes;
    }
    
    public void setViajes(Set<Viaje> viajes) {
        this.viajes = viajes;
    }




}

