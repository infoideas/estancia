package entidades;
// Generated 10/07/2021 10:15:57 by Hibernate Tools 4.3.1



/**
 * LiquidacionViaje generated by hbm2java
 */
public class LiquidacionViaje  implements java.io.Serializable {


     private Integer id;
     private LiquidacionFlete liquidacionFlete= new LiquidacionFlete();
     private Viaje viaje= new Viaje();

    public LiquidacionViaje() {
    }

    public LiquidacionViaje(LiquidacionFlete liquidacionFlete, Viaje viaje) {
       this.liquidacionFlete = liquidacionFlete;
       this.viaje = viaje;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public LiquidacionFlete getLiquidacionFlete() {
        return this.liquidacionFlete;
    }
    
    public void setLiquidacionFlete(LiquidacionFlete liquidacionFlete) {
        this.liquidacionFlete = liquidacionFlete;
    }
    public Viaje getViaje() {
        return this.viaje;
    }
    
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }




}

