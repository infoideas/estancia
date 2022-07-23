package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Preferencia generated by hbm2java
 */
public class Preferencia  implements java.io.Serializable {


     private Integer id;
     private Rubro rubro;
     private String nombre;
     private Set<MesaDetPreferencia> mesaDetPreferencias = new HashSet<MesaDetPreferencia>(0);
     private Set<MesaDet> mesaDets = new HashSet<MesaDet>(0);

    public Preferencia() {
    }

	
    public Preferencia(Rubro rubro, String nombre) {
        this.rubro = rubro;
        this.nombre = nombre;
    }
    public Preferencia(Rubro rubro, String nombre, Set<MesaDetPreferencia> mesaDetPreferencias, Set<MesaDet> mesaDets) {
       this.rubro = rubro;
       this.nombre = nombre;
       this.mesaDetPreferencias = mesaDetPreferencias;
       this.mesaDets = mesaDets;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Rubro getRubro() {
        return this.rubro;
    }
    
    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<MesaDetPreferencia> getMesaDetPreferencias() {
        return this.mesaDetPreferencias;
    }
    
    public void setMesaDetPreferencias(Set<MesaDetPreferencia> mesaDetPreferencias) {
        this.mesaDetPreferencias = mesaDetPreferencias;
    }
    public Set<MesaDet> getMesaDets() {
        return this.mesaDets;
    }
    
    public void setMesaDets(Set<MesaDet> mesaDets) {
        this.mesaDets = mesaDets;
    }




}

