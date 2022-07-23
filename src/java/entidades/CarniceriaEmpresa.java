package entidades;
// Generated 21/07/2020 15:25:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CarniceriaEmpresa generated by hbm2java
 */
public class CarniceriaEmpresa  implements java.io.Serializable {


     private Integer id;
     private CondIva condIva;
     private Tipoid tipoid;
     private String numId;
     private String nombre;
     private char estado;
     private Set<CarniceriaLocal> carniceriaLocals = new HashSet<CarniceriaLocal>(0);

    public CarniceriaEmpresa() {
    }

	
    public CarniceriaEmpresa(CondIva condIva, String nombre, char estado) {
        this.condIva = condIva;
        this.nombre = nombre;
        this.estado = estado;
    }
    public CarniceriaEmpresa(CondIva condIva, Tipoid tipoid, String numId, String nombre, char estado, Set<CarniceriaLocal> carniceriaLocals) {
       this.condIva = condIva;
       this.tipoid = tipoid;
       this.numId = numId;
       this.nombre = nombre;
       this.estado = estado;
       this.carniceriaLocals = carniceriaLocals;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public CondIva getCondIva() {
        return this.condIva;
    }
    
    public void setCondIva(CondIva condIva) {
        this.condIva = condIva;
    }
    public Tipoid getTipoid() {
        return this.tipoid;
    }
    
    public void setTipoid(Tipoid tipoid) {
        this.tipoid = tipoid;
    }
    public String getNumId() {
        return this.numId;
    }
    
    public void setNumId(String numId) {
        this.numId = numId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set<CarniceriaLocal> getCarniceriaLocals() {
        return this.carniceriaLocals;
    }
    
    public void setCarniceriaLocals(Set<CarniceriaLocal> carniceriaLocals) {
        this.carniceriaLocals = carniceriaLocals;
    }




}


