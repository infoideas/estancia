package entidades;
// Generated 4 abr. 2022 15:58:54 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ListaPreciosDet generated by hbm2java
 */
public class ListaPreciosDet  implements java.io.Serializable {


     private Integer id;
     private ListaPrecios listaPrecios;
     private Producto producto= new Producto();
     private BigDecimal precio;

    public ListaPreciosDet() {
    }

    public ListaPreciosDet(ListaPrecios listaPrecios, Producto producto, BigDecimal precio) {
       this.listaPrecios = listaPrecios;
       this.producto = producto;
       this.precio = precio;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public ListaPrecios getListaPrecios() {
        return this.listaPrecios;
    }
    
    public void setListaPrecios(ListaPrecios listaPrecios) {
        this.listaPrecios = listaPrecios;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }




}


