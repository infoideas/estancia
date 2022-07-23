package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * PorcentajeIva generated by hbm2java
 */
public class PorcentajeIva  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private BigDecimal porcentaje;
     private Set<Venta> ventas = new HashSet<Venta>(0);

    public PorcentajeIva() {
    }

	
    public PorcentajeIva(String nombre, BigDecimal porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    public PorcentajeIva(String nombre, BigDecimal porcentaje, Set<Venta> ventas) {
       this.nombre = nombre;
       this.porcentaje = porcentaje;
       this.ventas = ventas;
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
    public BigDecimal getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }




}

