package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1



/**
 * DireccionUsuarioCliente generated by hbm2java
 */
public class DireccionUsuarioCliente  implements java.io.Serializable {


     private Integer id;
     private Localidad localidad;
     private Provincia provincia;
     private UsuarioCliente usuarioCliente;
     private String ciudad;
     private String cp;
     private String direccion;
     private String telefono;

    public DireccionUsuarioCliente() {
    }

	
    public DireccionUsuarioCliente(Provincia provincia, UsuarioCliente usuarioCliente, String ciudad, String direccion) {
        this.provincia = provincia;
        this.usuarioCliente = usuarioCliente;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    public DireccionUsuarioCliente(Localidad localidad, Provincia provincia, UsuarioCliente usuarioCliente, String ciudad, String cp, String direccion, String telefono) {
       this.localidad = localidad;
       this.provincia = provincia;
       this.usuarioCliente = usuarioCliente;
       this.ciudad = ciudad;
       this.cp = cp;
       this.direccion = direccion;
       this.telefono = telefono;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public UsuarioCliente getUsuarioCliente() {
        return this.usuarioCliente;
    }
    
    public void setUsuarioCliente(UsuarioCliente usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}


