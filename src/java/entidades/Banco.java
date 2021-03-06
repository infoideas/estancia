package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Banco generated by hbm2java
 */
public class Banco  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private char estado;
     private Set<CuentaBanco> cuentaBancos = new HashSet<CuentaBanco>(0);

    public Banco() {
    }

	
    public Banco(String nombre, char estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public Banco(String nombre, char estado, Set<CuentaBanco> cuentaBancos) {
       this.nombre = nombre;
       this.estado = estado;
       this.cuentaBancos = cuentaBancos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set<CuentaBanco> getCuentaBancos() {
        return this.cuentaBancos;
    }
    
    public void setCuentaBancos(Set<CuentaBanco> cuentaBancos) {
        this.cuentaBancos = cuentaBancos;
    }




}


