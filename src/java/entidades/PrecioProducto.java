package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * PrecioProducto generated by hbm2java
 */
public class PrecioProducto  implements java.io.Serializable {


     private Integer id;
     private int idProducto;
     private Date fecIni;
     private BigDecimal precioContado;
     private BigDecimal precioLista;
     private BigDecimal precioMayorista;

    public PrecioProducto() {
    }

    public PrecioProducto(int idProducto, Date fecIni, BigDecimal precioContado, BigDecimal precioLista, BigDecimal precioMayorista) {
       this.idProducto = idProducto;
       this.fecIni = fecIni;
       this.precioContado = precioContado;
       this.precioLista = precioLista;
       this.precioMayorista = precioMayorista;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Date getFecIni() {
        return this.fecIni;
    }
    
    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }
    public BigDecimal getPrecioContado() {
        return this.precioContado;
    }
    
    public void setPrecioContado(BigDecimal precioContado) {
        this.precioContado = precioContado;
    }
    public BigDecimal getPrecioLista() {
        return this.precioLista;
    }
    
    public void setPrecioLista(BigDecimal precioLista) {
        this.precioLista = precioLista;
    }
    public BigDecimal getPrecioMayorista() {
        return this.precioMayorista;
    }
    
    public void setPrecioMayorista(BigDecimal precioMayorista) {
        this.precioMayorista = precioMayorista;
    }




}

