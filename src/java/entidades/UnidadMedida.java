package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UnidadMedida generated by hbm2java
 */
public class UnidadMedida  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private String nombre;
     private Set<MenuEjecDet> menuEjecDets = new HashSet<MenuEjecDet>(0);
     private Set<VentaDet> ventaDets = new HashSet<VentaDet>(0);
     private Set<ComandaDetalle> comandaDetalles = new HashSet<ComandaDetalle>(0);
     private Set<Producto> productos = new HashSet<Producto>(0);
     private Set<MesaDet> mesaDets = new HashSet<MesaDet>(0);

    public UnidadMedida() {
    }

	
    public UnidadMedida(Empresa empresa, String nombre) {
        this.empresa = empresa;
        this.nombre = nombre;
    }
    public UnidadMedida(Empresa empresa, String nombre, Set<MenuEjecDet> menuEjecDets, Set<VentaDet> ventaDets, Set<ComandaDetalle> comandaDetalles, Set<Producto> productos, Set<MesaDet> mesaDets) {
       this.empresa = empresa;
       this.nombre = nombre;
       this.menuEjecDets = menuEjecDets;
       this.ventaDets = ventaDets;
       this.comandaDetalles = comandaDetalles;
       this.productos = productos;
       this.mesaDets = mesaDets;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<MenuEjecDet> getMenuEjecDets() {
        return this.menuEjecDets;
    }
    
    public void setMenuEjecDets(Set<MenuEjecDet> menuEjecDets) {
        this.menuEjecDets = menuEjecDets;
    }
    public Set<VentaDet> getVentaDets() {
        return this.ventaDets;
    }
    
    public void setVentaDets(Set<VentaDet> ventaDets) {
        this.ventaDets = ventaDets;
    }
    public Set<ComandaDetalle> getComandaDetalles() {
        return this.comandaDetalles;
    }
    
    public void setComandaDetalles(Set<ComandaDetalle> comandaDetalles) {
        this.comandaDetalles = comandaDetalles;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
    public Set<MesaDet> getMesaDets() {
        return this.mesaDets;
    }
    
    public void setMesaDets(Set<MesaDet> mesaDets) {
        this.mesaDets = mesaDets;
    }




}


