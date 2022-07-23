package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MesaNumero generated by hbm2java
 */
public class MesaNumero  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private Sector sector;
     private short numMesa;
     private String observaciones;
     private char estado;
     private Short capacidad;
     private Set<Mesa> mesas = new HashSet<Mesa>(0);
     private Set<MesaActual> mesaActuals = new HashSet<MesaActual>(0);

    public MesaNumero() {
    }

	
    public MesaNumero(Empresa empresa, Sector sector, short numMesa, char estado) {
        this.empresa = empresa;
        this.sector = sector;
        this.numMesa = numMesa;
        this.estado = estado;
    }
    public MesaNumero(Empresa empresa, Sector sector, short numMesa, String observaciones, char estado, Short capacidad, Set<Mesa> mesas, Set<MesaActual> mesaActuals) {
       this.empresa = empresa;
       this.sector = sector;
       this.numMesa = numMesa;
       this.observaciones = observaciones;
       this.estado = estado;
       this.capacidad = capacidad;
       this.mesas = mesas;
       this.mesaActuals = mesaActuals;
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
    public Sector getSector() {
        return this.sector;
    }
    
    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public short getNumMesa() {
        return this.numMesa;
    }
    
    public void setNumMesa(short numMesa) {
        this.numMesa = numMesa;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Short getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Short capacidad) {
        this.capacidad = capacidad;
    }
    public Set<Mesa> getMesas() {
        return this.mesas;
    }
    
    public void setMesas(Set<Mesa> mesas) {
        this.mesas = mesas;
    }
    public Set<MesaActual> getMesaActuals() {
        return this.mesaActuals;
    }
    
    public void setMesaActuals(Set<MesaActual> mesaActuals) {
        this.mesaActuals = mesaActuals;
    }




}


