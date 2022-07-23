package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FormaPago generated by hbm2java
 */
public class FormaPago  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<VentaCuenta> ventaCuentas = new HashSet<VentaCuenta>(0);
     private Set<MesaComprobante> mesaComprobantes = new HashSet<MesaComprobante>(0);

    public FormaPago() {
    }

	
    public FormaPago(String nombre) {
        this.nombre = nombre;
    }
    public FormaPago(String nombre, Set<VentaCuenta> ventaCuentas, Set<MesaComprobante> mesaComprobantes) {
       this.nombre = nombre;
       this.ventaCuentas = ventaCuentas;
       this.mesaComprobantes = mesaComprobantes;
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
    public Set<VentaCuenta> getVentaCuentas() {
        return this.ventaCuentas;
    }
    
    public void setVentaCuentas(Set<VentaCuenta> ventaCuentas) {
        this.ventaCuentas = ventaCuentas;
    }
    public Set<MesaComprobante> getMesaComprobantes() {
        return this.mesaComprobantes;
    }
    
    public void setMesaComprobantes(Set<MesaComprobante> mesaComprobantes) {
        this.mesaComprobantes = mesaComprobantes;
    }




}

