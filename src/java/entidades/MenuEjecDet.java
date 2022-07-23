package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1



/**
 * MenuEjecDet generated by hbm2java
 */
public class MenuEjecDet  implements java.io.Serializable {


     private Integer id;
     private CategoriaMe categoriaMe;
     private MenuEjec menuEjec;
     private Producto producto;
     private UnidadMedida unidadMedida;

    public MenuEjecDet() {
    }

    public MenuEjecDet(CategoriaMe categoriaMe, MenuEjec menuEjec, Producto producto, UnidadMedida unidadMedida) {
       this.categoriaMe = categoriaMe;
       this.menuEjec = menuEjec;
       this.producto = producto;
       this.unidadMedida = unidadMedida;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public CategoriaMe getCategoriaMe() {
        return this.categoriaMe;
    }
    
    public void setCategoriaMe(CategoriaMe categoriaMe) {
        this.categoriaMe = categoriaMe;
    }
    public MenuEjec getMenuEjec() {
        return this.menuEjec;
    }
    
    public void setMenuEjec(MenuEjec menuEjec) {
        this.menuEjec = menuEjec;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public UnidadMedida getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }




}

