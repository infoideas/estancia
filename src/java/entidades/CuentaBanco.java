package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CuentaBanco generated by hbm2java
 */
public class CuentaBanco  implements java.io.Serializable {


     private Integer id;
     private Banco banco= new Banco();
     private Moneda moneda= new Moneda();
     private char tipoCuenta;
     private String numeroCuenta;
     private char estado;
     private Set<TropaPagoCiva> tropaPagoCivas = new HashSet<TropaPagoCiva>(0);

    public CuentaBanco() {
    }

	
    public CuentaBanco(Banco banco, Moneda moneda, char tipoCuenta, String numeroCuenta, char estado) {
        this.banco = banco;
        this.moneda = moneda;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.estado = estado;
    }
    public CuentaBanco(Banco banco, Moneda moneda, char tipoCuenta, String numeroCuenta, char estado, Set<TropaPagoCiva> tropaPagoCivas) {
       this.banco = banco;
       this.moneda = moneda;
       this.tipoCuenta = tipoCuenta;
       this.numeroCuenta = numeroCuenta;
       this.estado = estado;
       this.tropaPagoCivas = tropaPagoCivas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Banco getBanco() {
        return this.banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public Moneda getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    public char getTipoCuenta() {
        return this.tipoCuenta;
    }
    
    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set<TropaPagoCiva> getTropaPagoCivas() {
        return this.tropaPagoCivas;
    }
    
    public void setTropaPagoCivas(Set<TropaPagoCiva> tropaPagoCivas) {
        this.tropaPagoCivas = tropaPagoCivas;
    }




}

