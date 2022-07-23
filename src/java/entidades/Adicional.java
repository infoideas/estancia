package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Adicional generated by hbm2java
 */
public class Adicional  implements java.io.Serializable {


     private Integer id;
     private Rubro rubro;
     private String nombre;
     private BigDecimal precio;
     private Set<MesaDetAdicional> mesaDetAdicionals = new HashSet<MesaDetAdicional>(0);

    public Adicional() {
    }

	
    public Adicional(Rubro rubro, String nombre, BigDecimal precio) {
        this.rubro = rubro;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Adicional(Rubro rubro, String nombre, BigDecimal precio, Set<MesaDetAdicional> mesaDetAdicionals) {
       this.rubro = rubro;
       this.nombre = nombre;
       this.precio = precio;
       this.mesaDetAdicionals = mesaDetAdicionals;
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
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Set<MesaDetAdicional> getMesaDetAdicionals() {
        return this.mesaDetAdicionals;
    }
    
    public void setMesaDetAdicionals(Set<MesaDetAdicional> mesaDetAdicionals) {
        this.mesaDetAdicionals = mesaDetAdicionals;
    }




}


