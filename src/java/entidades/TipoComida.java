package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1



/**
 * TipoComida generated by hbm2java
 */
public class TipoComida  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private String nombre;

    public TipoComida() {
    }

    public TipoComida(Empresa empresa, String nombre) {
       this.empresa = empresa;
       this.nombre = nombre;
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




}


