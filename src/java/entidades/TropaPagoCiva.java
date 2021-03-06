package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * TropaPagoCiva generated by hbm2java
 */
public class TropaPagoCiva  implements java.io.Serializable {


     private Integer id;
     private CuentaBanco cuentaBanco= new CuentaBanco();
     private Tropa tropa= new Tropa();
     private BigDecimal valor;

    public TropaPagoCiva() {
    }

    public TropaPagoCiva(CuentaBanco cuentaBanco, Tropa tropa, BigDecimal valor) {
       this.cuentaBanco = cuentaBanco;
       this.tropa = tropa;
       this.valor = valor;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public CuentaBanco getCuentaBanco() {
        return this.cuentaBanco;
    }
    
    public void setCuentaBanco(CuentaBanco cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }
    public Tropa getTropa() {
        return this.tropa;
    }
    
    public void setTropa(Tropa tropa) {
        this.tropa = tropa;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}


