package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1



/**
 * TipoGrano generated by hbm2java
 */
public class TipoGrano  implements java.io.Serializable {


     private Integer id;
     private String nombre;

    public TipoGrano() {
    }

    public TipoGrano(String nombre) {
       this.nombre = nombre;
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




}


