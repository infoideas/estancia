package entidades;
// Generated 3 ene. 2022 16:12:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Unidad generated by hbm2java
 */
public class Unidad  implements java.io.Serializable {


     private Short id;
     private String nombre;
     private Set<BalanceIngreso> balanceIngresos = new HashSet<BalanceIngreso>(0);
     private Set<Gasto> gastos = new HashSet<Gasto>(0);
     private Set<RemitoVentaDet> remitoVentaDets = new HashSet<RemitoVentaDet>(0);
     private Set<VentaDet> ventaDets = new HashSet<VentaDet>(0);
     private Set<MovStockDet> movStockDets = new HashSet<MovStockDet>(0);
     private Set<BalanceRemanente> balanceRemanentes = new HashSet<BalanceRemanente>(0);
     private Set<BalanceInvIni> balanceInvInis = new HashSet<BalanceInvIni>(0);
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Unidad() {
    }

	
    public Unidad(String nombre) {
        this.nombre = nombre;
    }
    public Unidad(String nombre, Set<BalanceIngreso> balanceIngresos, Set<Gasto> gastos, Set<RemitoVentaDet> remitoVentaDets, Set<VentaDet> ventaDets, Set<MovStockDet> movStockDets, Set<BalanceRemanente> balanceRemanentes, Set<BalanceInvIni> balanceInvInis, Set<Producto> productos) {
       this.nombre = nombre;
       this.balanceIngresos = balanceIngresos;
       this.gastos = gastos;
       this.remitoVentaDets = remitoVentaDets;
       this.ventaDets = ventaDets;
       this.movStockDets = movStockDets;
       this.balanceRemanentes = balanceRemanentes;
       this.balanceInvInis = balanceInvInis;
       this.productos = productos;
    }
   
    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<BalanceIngreso> getBalanceIngresos() {
        return this.balanceIngresos;
    }
    
    public void setBalanceIngresos(Set<BalanceIngreso> balanceIngresos) {
        this.balanceIngresos = balanceIngresos;
    }
    public Set<Gasto> getGastos() {
        return this.gastos;
    }
    
    public void setGastos(Set<Gasto> gastos) {
        this.gastos = gastos;
    }
    public Set<RemitoVentaDet> getRemitoVentaDets() {
        return this.remitoVentaDets;
    }
    
    public void setRemitoVentaDets(Set<RemitoVentaDet> remitoVentaDets) {
        this.remitoVentaDets = remitoVentaDets;
    }
    public Set<VentaDet> getVentaDets() {
        return this.ventaDets;
    }
    
    public void setVentaDets(Set<VentaDet> ventaDets) {
        this.ventaDets = ventaDets;
    }
    public Set<MovStockDet> getMovStockDets() {
        return this.movStockDets;
    }
    
    public void setMovStockDets(Set<MovStockDet> movStockDets) {
        this.movStockDets = movStockDets;
    }
    public Set<BalanceRemanente> getBalanceRemanentes() {
        return this.balanceRemanentes;
    }
    
    public void setBalanceRemanentes(Set<BalanceRemanente> balanceRemanentes) {
        this.balanceRemanentes = balanceRemanentes;
    }
    public Set<BalanceInvIni> getBalanceInvInis() {
        return this.balanceInvInis;
    }
    
    public void setBalanceInvInis(Set<BalanceInvIni> balanceInvInis) {
        this.balanceInvInis = balanceInvInis;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}


