package entidades;
// Generated 3 ene. 2022 16:12:26 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * BalanceInvIni generated by hbm2java
 */
public class BalanceInvIni  implements java.io.Serializable {


     private Integer id;
     private Balance balance;
     private Producto producto= new Producto();
     private Unidad unidad= new Unidad();
     private BigDecimal cantidad;

    public BalanceInvIni() {
    }

    public BalanceInvIni(Balance balance, Producto producto, Unidad unidad, BigDecimal cantidad) {
       this.balance = balance;
       this.producto = producto;
       this.unidad = unidad;
       this.cantidad = cantidad;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Balance getBalance() {
        return this.balance;
    }
    
    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Unidad getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidadDouble() {
        return cantidad.doubleValue();
    }

    public char getTipoProducto() {
        return producto.getTipo();
    }


}


