package entidades;
// Generated 30/04/2021 15:22:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * StockDetalle generated by hbm2java
 */
public class StockDetalle  implements java.io.Serializable {


     private Integer id;
     private Producto producto;
     private Stock stock;
     private BigDecimal cantidad;
     private BigDecimal precio;
     private BigDecimal valor;

    public StockDetalle() {
    }

    public StockDetalle(Producto producto, Stock stock, BigDecimal cantidad, BigDecimal precio, BigDecimal valor) {
       this.producto = producto;
       this.stock = stock;
       this.cantidad = cantidad;
       this.precio = precio;
       this.valor = valor;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}


