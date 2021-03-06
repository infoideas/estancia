package entidades;
// Generated 30/04/2021 15:22:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private Integer id;
     private LocalCarniceria localCarniceria;
     private int idUsuario;
     private Date fecCarga;
     private Date fecCierre;
     private String observaciones;
     private Set<StockDetalle> stockDetalles = new HashSet<StockDetalle>(0);

    public Stock() {
    }

	
    public Stock(LocalCarniceria localCarniceria, int idUsuario, Date fecCarga, Date fecCierre) {
        this.localCarniceria = localCarniceria;
        this.idUsuario = idUsuario;
        this.fecCarga = fecCarga;
        this.fecCierre = fecCierre;
    }
    public Stock(LocalCarniceria localCarniceria, int idUsuario, Date fecCarga, Date fecCierre, String observaciones, Set<StockDetalle> stockDetalles) {
       this.localCarniceria = localCarniceria;
       this.idUsuario = idUsuario;
       this.fecCarga = fecCarga;
       this.fecCierre = fecCierre;
       this.observaciones = observaciones;
       this.stockDetalles = stockDetalles;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalCarniceria getLocalCarniceria() {
        return this.localCarniceria;
    }
    
    public void setLocalCarniceria(LocalCarniceria localCarniceria) {
        this.localCarniceria = localCarniceria;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Date getFecCarga() {
        return this.fecCarga;
    }
    
    public void setFecCarga(Date fecCarga) {
        this.fecCarga = fecCarga;
    }
    public Date getFecCierre() {
        return this.fecCierre;
    }
    
    public void setFecCierre(Date fecCierre) {
        this.fecCierre = fecCierre;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set<StockDetalle> getStockDetalles() {
        return this.stockDetalles;
    }
    
    public void setStockDetalles(Set<StockDetalle> stockDetalles) {
        this.stockDetalles = stockDetalles;
    }




}


