package entidades;
// Generated 22/10/2020 16:31:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Denominacion generated by hbm2java
 */
public class Denominacion  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<TropaDetGarron> tropaDetGarrons = new HashSet<TropaDetGarron>(0);

    public Denominacion() {
    }

	
    public Denominacion(String nombre) {
        this.nombre = nombre;
    }
    public Denominacion(String nombre, Set<TropaDetGarron> tropaDetGarrons) {
       this.nombre = nombre;
       this.tropaDetGarrons = tropaDetGarrons;
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
    public Set<TropaDetGarron> getTropaDetGarrons() {
        return this.tropaDetGarrons;
    }
    
    public void setTropaDetGarrons(Set<TropaDetGarron> tropaDetGarrons) {
        this.tropaDetGarrons = tropaDetGarrons;
    }




}


