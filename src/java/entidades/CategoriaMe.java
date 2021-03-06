package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CategoriaMe generated by hbm2java
 */
public class CategoriaMe  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private String nombre;
     private Set<MenuEjecDet> menuEjecDets = new HashSet<MenuEjecDet>(0);

    public CategoriaMe() {
    }

	
    public CategoriaMe(Empresa empresa, String nombre) {
        this.empresa = empresa;
        this.nombre = nombre;
    }
    public CategoriaMe(Empresa empresa, String nombre, Set<MenuEjecDet> menuEjecDets) {
       this.empresa = empresa;
       this.nombre = nombre;
       this.menuEjecDets = menuEjecDets;
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




}


