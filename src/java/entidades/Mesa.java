package entidades;
// Generated 31 oct. 2021 16:10:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Mesa generated by hbm2java
 */
public class Mesa  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private MesaNumero mesaNumero;
     private Mozo mozo;
     private Persona persona;
     private int idUsuario;
     private Date fecAper;
     private Date fecCierre;
     private Byte mayores;
     private Byte menores;
     private String observaciones;
     private char estado;
     private BigDecimal valorTotal;
     private BigDecimal porcDesc;
     private BigDecimal valorDesc;
     private BigDecimal valorFinal;
     private Set<Comanda> comandas = new HashSet<Comanda>(0);
     private Set<MesaComprobante> mesaComprobantes = new HashSet<MesaComprobante>(0);
     private Set<MesaDet> mesaDets = new HashSet<MesaDet>(0);
     private Set<MesaActual> mesaActuals = new HashSet<MesaActual>(0);

    public Mesa() {
    }

	
    public Mesa(Empresa empresa, MesaNumero mesaNumero, Mozo mozo, int idUsuario, Date fecAper, char estado, BigDecimal valorTotal, BigDecimal porcDesc, BigDecimal valorDesc, BigDecimal valorFinal) {
        this.empresa = empresa;
        this.mesaNumero = mesaNumero;
        this.mozo = mozo;
        this.idUsuario = idUsuario;
        this.fecAper = fecAper;
        this.estado = estado;
        this.valorTotal = valorTotal;
        this.porcDesc = porcDesc;
        this.valorDesc = valorDesc;
        this.valorFinal = valorFinal;
    }
    public Mesa(Empresa empresa, MesaNumero mesaNumero, Mozo mozo, Persona persona, int idUsuario, Date fecAper, Date fecCierre, Byte mayores, Byte menores, String observaciones, char estado, BigDecimal valorTotal, BigDecimal porcDesc, BigDecimal valorDesc, BigDecimal valorFinal, Set<Comanda> comandas, Set<MesaComprobante> mesaComprobantes, Set<MesaDet> mesaDets, Set<MesaActual> mesaActuals) {
       this.empresa = empresa;
       this.mesaNumero = mesaNumero;
       this.mozo = mozo;
       this.persona = persona;
       this.idUsuario = idUsuario;
       this.fecAper = fecAper;
       this.fecCierre = fecCierre;
       this.mayores = mayores;
       this.menores = menores;
       this.observaciones = observaciones;
       this.estado = estado;
       this.valorTotal = valorTotal;
       this.porcDesc = porcDesc;
       this.valorDesc = valorDesc;
       this.valorFinal = valorFinal;
       this.comandas = comandas;
       this.mesaComprobantes = mesaComprobantes;
       this.mesaDets = mesaDets;
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
    public MesaNumero getMesaNumero() {
        return this.mesaNumero;
    }
    
    public void setMesaNumero(MesaNumero mesaNumero) {
        this.mesaNumero = mesaNumero;
    }
    public Mozo getMozo() {
        return this.mozo;
    }
    
    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Date getFecAper() {
        return this.fecAper;
    }
    
    public void setFecAper(Date fecAper) {
        this.fecAper = fecAper;
    }
    public Date getFecCierre() {
        return this.fecCierre;
    }
    
    public void setFecCierre(Date fecCierre) {
        this.fecCierre = fecCierre;
    }
    public Byte getMayores() {
        return this.mayores;
    }
    
    public void setMayores(Byte mayores) {
        this.mayores = mayores;
    }
    public Byte getMenores() {
        return this.menores;
    }
    
    public void setMenores(Byte menores) {
        this.menores = menores;
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
    public BigDecimal getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public BigDecimal getPorcDesc() {
        return this.porcDesc;
    }
    
    public void setPorcDesc(BigDecimal porcDesc) {
        this.porcDesc = porcDesc;
    }
    public BigDecimal getValorDesc() {
        return this.valorDesc;
    }
    
    public void setValorDesc(BigDecimal valorDesc) {
        this.valorDesc = valorDesc;
    }
    public BigDecimal getValorFinal() {
        return this.valorFinal;
    }
    
    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
    public Set<Comanda> getComandas() {
        return this.comandas;
    }
    
    public void setComandas(Set<Comanda> comandas) {
        this.comandas = comandas;
    }
    public Set<MesaComprobante> getMesaComprobantes() {
        return this.mesaComprobantes;
    }
    
    public void setMesaComprobantes(Set<MesaComprobante> mesaComprobantes) {
        this.mesaComprobantes = mesaComprobantes;
    }
    public Set<MesaDet> getMesaDets() {
        return this.mesaDets;
    }
    
    public void setMesaDets(Set<MesaDet> mesaDets) {
        this.mesaDets = mesaDets;
    }
    public Set<MesaActual> getMesaActuals() {
        return this.mesaActuals;
    }
    
    public void setMesaActuals(Set<MesaActual> mesaActuals) {
        this.mesaActuals = mesaActuals;
    }




}


