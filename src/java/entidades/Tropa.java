package entidades;
// Generated 16 jun. 2022 20:10:36 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tropa generated by hbm2java
 */

public class Tropa  implements java.io.Serializable {


     private Integer id;
     private Categoria categoria= new Categoria();
     private Comisionista comisionista;
     private Deposito deposito= new Deposito();
     private Productor productor= new Productor();
     private String numeroTropa;
     private char tipo;
     private String puntoVenta;
     private String numFactura;
     private String tipoFactura;
     private Date fecIng;
     private Date fecCarga;
     private int idUsuario;
     private String dte;
     private int cabezasVivas;
     private int cabezasDte;
     private BigDecimal kilosVivos;
     private int decomisos;
     private short mediasReces;
     private int cabezasFaenadas;
     private int cabezasMuertas;
     private BigDecimal kilosFaenados;
     private BigDecimal kilosDecomisados;
     private BigDecimal rendimiento;
     private BigDecimal importeKiloVivo;
     private BigDecimal importeFaena;
     private BigDecimal valorIngBrutos;
     private BigDecimal pagoCuentaIva;
     private BigDecimal importeComision;
     private BigDecimal importeCostoTotal;
     private BigDecimal valorFlete;
     private BigDecimal importeCostoTotalTropa;
     private BigDecimal costoUnitario;
     private String observaciones;
     private byte[] documentoAsociado;
     private char procesada;
     private Set<TropaDet> tropaDets = new HashSet<TropaDet>(0);
     private Set<TropaDetGarron> tropaDetGarrons = new HashSet<TropaDetGarron>(0);
     private Set<InventarioTropa> inventarioTropas = new HashSet<InventarioTropa>(0);
     private Set<VentaDet> ventaDets = new HashSet<VentaDet>(0);
     private Set<TropaPagoCiva> tropaPagoCivas = new HashSet<TropaPagoCiva>(0);
     private Set<TropaViaje> tropaViajes = new HashSet<TropaViaje>(0);

    public Tropa() {
    }

	
    public Tropa(Categoria categoria, String numeroTropa, char tipo, Date fecIng, Date fecCarga, int idUsuario, String dte, int cabezasVivas, int cabezasDte, BigDecimal kilosVivos, int decomisos, short mediasReces, int cabezasFaenadas, int cabezasMuertas, BigDecimal kilosFaenados, BigDecimal kilosDecomisados, BigDecimal rendimiento, BigDecimal importeKiloVivo, BigDecimal importeFaena, BigDecimal valorIngBrutos, BigDecimal pagoCuentaIva, BigDecimal importeComision, BigDecimal importeCostoTotal, BigDecimal valorFlete, BigDecimal importeCostoTotalTropa, BigDecimal costoUnitario, char procesada) {
        this.categoria = categoria;
        this.numeroTropa = numeroTropa;
        this.tipo = tipo;
        this.fecIng = fecIng;
        this.fecCarga = fecCarga;
        this.idUsuario = idUsuario;
        this.dte = dte;
        this.cabezasVivas = cabezasVivas;
        this.cabezasDte = cabezasDte;
        this.kilosVivos = kilosVivos;
        this.decomisos = decomisos;
        this.mediasReces = mediasReces;
        this.cabezasFaenadas = cabezasFaenadas;
        this.cabezasMuertas = cabezasMuertas;
        this.kilosFaenados = kilosFaenados;
        this.kilosDecomisados = kilosDecomisados;
        this.rendimiento = rendimiento;
        this.importeKiloVivo = importeKiloVivo;
        this.importeFaena = importeFaena;
        this.valorIngBrutos = valorIngBrutos;
        this.pagoCuentaIva = pagoCuentaIva;
        this.importeComision = importeComision;
        this.importeCostoTotal = importeCostoTotal;
        this.valorFlete = valorFlete;
        this.importeCostoTotalTropa = importeCostoTotalTropa;
        this.costoUnitario = costoUnitario;
        this.procesada = procesada;
    }
    public Tropa(Categoria categoria, Comisionista comisionista, Deposito deposito, Productor productor, String numeroTropa, char tipo, String puntoVenta, String numFactura, String tipoFactura, Date fecIng, Date fecCarga, int idUsuario, String dte, int cabezasVivas, int cabezasDte, BigDecimal kilosVivos, int decomisos, short mediasReces, int cabezasFaenadas, int cabezasMuertas, BigDecimal kilosFaenados, BigDecimal kilosDecomisados, BigDecimal rendimiento, BigDecimal importeKiloVivo, BigDecimal importeFaena, BigDecimal valorIngBrutos, BigDecimal pagoCuentaIva, BigDecimal importeComision, BigDecimal importeCostoTotal, BigDecimal valorFlete, BigDecimal importeCostoTotalTropa, BigDecimal costoUnitario, String observaciones, byte[] documentoAsociado, char procesada, Set<TropaDet> tropaDets, Set<TropaDetGarron> tropaDetGarrons, Set<InventarioTropa> inventarioTropas, Set<VentaDet> ventaDets, Set<TropaPagoCiva> tropaPagoCivas, Set<TropaViaje> tropaViajes) {
       this.categoria = categoria;
       this.comisionista = comisionista;
       this.deposito = deposito;
       this.productor = productor;
       this.numeroTropa = numeroTropa;
       this.tipo = tipo;
       this.puntoVenta = puntoVenta;
       this.numFactura = numFactura;
       this.tipoFactura = tipoFactura;
       this.fecIng = fecIng;
       this.fecCarga = fecCarga;
       this.idUsuario = idUsuario;
       this.dte = dte;
       this.cabezasVivas = cabezasVivas;
       this.cabezasDte = cabezasDte;
       this.kilosVivos = kilosVivos;
       this.decomisos = decomisos;
       this.mediasReces = mediasReces;
       this.cabezasFaenadas = cabezasFaenadas;
       this.cabezasMuertas = cabezasMuertas;
       this.kilosFaenados = kilosFaenados;
       this.kilosDecomisados = kilosDecomisados;
       this.rendimiento = rendimiento;
       this.importeKiloVivo = importeKiloVivo;
       this.importeFaena = importeFaena;
       this.valorIngBrutos = valorIngBrutos;
       this.pagoCuentaIva = pagoCuentaIva;
       this.importeComision = importeComision;
       this.importeCostoTotal = importeCostoTotal;
       this.valorFlete = valorFlete;
       this.importeCostoTotalTropa = importeCostoTotalTropa;
       this.costoUnitario = costoUnitario;
       this.observaciones = observaciones;
       this.documentoAsociado = documentoAsociado;
       this.procesada = procesada;
       this.tropaDets = tropaDets;
       this.tropaDetGarrons = tropaDetGarrons;
       this.inventarioTropas = inventarioTropas;
       this.ventaDets = ventaDets;
       this.tropaPagoCivas = tropaPagoCivas;
       this.tropaViajes = tropaViajes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Comisionista getComisionista() {
        return this.comisionista;
    }
    
    public void setComisionista(Comisionista comisionista) {
        this.comisionista = comisionista;
    }
    public Deposito getDeposito() {
        return this.deposito;
    }
    
    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }
    public Productor getProductor() {
        return this.productor;
    }
    
    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    public String getNumeroTropa() {
        return this.numeroTropa;
    }
    
    public void setNumeroTropa(String numeroTropa) {
        this.numeroTropa = numeroTropa;
    }
    public char getTipo() {
        return this.tipo;
    }
    
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public String getPuntoVenta() {
        return this.puntoVenta;
    }
    
    public void setPuntoVenta(String puntoVenta) {
        this.puntoVenta = puntoVenta;
    }
    public String getNumFactura() {
        return this.numFactura;
    }
    
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
    public String getTipoFactura() {
        return this.tipoFactura;
    }
    
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }
    public Date getFecIng() {
        return this.fecIng;
    }
    
    public void setFecIng(Date fecIng) {
        this.fecIng = fecIng;
    }
    public Date getFecCarga() {
        return this.fecCarga;
    }
    
    public void setFecCarga(Date fecCarga) {
        this.fecCarga = fecCarga;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getDte() {
        return this.dte;
    }
    
    public void setDte(String dte) {
        this.dte = dte;
    }
    public int getCabezasVivas() {
        return this.cabezasVivas;
    }
    
    public void setCabezasVivas(int cabezasVivas) {
        this.cabezasVivas = cabezasVivas;
    }
    public int getCabezasDte() {
        return this.cabezasDte;
    }
    
    public void setCabezasDte(int cabezasDte) {
        this.cabezasDte = cabezasDte;
    }
    public BigDecimal getKilosVivos() {
        return this.kilosVivos;
    }
    
    public void setKilosVivos(BigDecimal kilosVivos) {
        this.kilosVivos = kilosVivos;
    }
    public int getDecomisos() {
        return this.decomisos;
    }
    
    public void setDecomisos(int decomisos) {
        this.decomisos = decomisos;
    }
    public short getMediasReces() {
        return this.mediasReces;
    }
    
    public void setMediasReces(short mediasReces) {
        this.mediasReces = mediasReces;
    }
    public int getCabezasFaenadas() {
        return this.cabezasFaenadas;
    }
    
    public void setCabezasFaenadas(int cabezasFaenadas) {
        this.cabezasFaenadas = cabezasFaenadas;
    }
    public int getCabezasMuertas() {
        return this.cabezasMuertas;
    }
    
    public void setCabezasMuertas(int cabezasMuertas) {
        this.cabezasMuertas = cabezasMuertas;
    }
    public BigDecimal getKilosFaenados() {
        return this.kilosFaenados;
    }
    
    public void setKilosFaenados(BigDecimal kilosFaenados) {
        this.kilosFaenados = kilosFaenados;
    }
    public BigDecimal getKilosDecomisados() {
        return this.kilosDecomisados;
    }
    
    public void setKilosDecomisados(BigDecimal kilosDecomisados) {
        this.kilosDecomisados = kilosDecomisados;
    }
    public BigDecimal getRendimiento() {
        return this.rendimiento;
    }
    
    public void setRendimiento(BigDecimal rendimiento) {
        this.rendimiento = rendimiento;
    }
    public BigDecimal getImporteKiloVivo() {
        return this.importeKiloVivo;
    }
    
    public void setImporteKiloVivo(BigDecimal importeKiloVivo) {
        this.importeKiloVivo = importeKiloVivo;
    }
    public BigDecimal getImporteFaena() {
        return this.importeFaena;
    }
    
    public void setImporteFaena(BigDecimal importeFaena) {
        this.importeFaena = importeFaena;
    }
    public BigDecimal getValorIngBrutos() {
        return this.valorIngBrutos;
    }
    
    public void setValorIngBrutos(BigDecimal valorIngBrutos) {
        this.valorIngBrutos = valorIngBrutos;
    }
    public BigDecimal getPagoCuentaIva() {
        return this.pagoCuentaIva;
    }
    
    public void setPagoCuentaIva(BigDecimal pagoCuentaIva) {
        this.pagoCuentaIva = pagoCuentaIva;
    }
    public BigDecimal getImporteComision() {
        return this.importeComision;
    }
    
    public void setImporteComision(BigDecimal importeComision) {
        this.importeComision = importeComision;
    }
    public BigDecimal getImporteCostoTotal() {
        return this.importeCostoTotal;
    }
    
    public void setImporteCostoTotal(BigDecimal importeCostoTotal) {
        this.importeCostoTotal = importeCostoTotal;
    }
    public BigDecimal getValorFlete() {
        return this.valorFlete;
    }
    
    public void setValorFlete(BigDecimal valorFlete) {
        this.valorFlete = valorFlete;
    }
    public BigDecimal getImporteCostoTotalTropa() {
        return this.importeCostoTotalTropa;
    }
    
    public void setImporteCostoTotalTropa(BigDecimal importeCostoTotalTropa) {
        this.importeCostoTotalTropa = importeCostoTotalTropa;
    }
    public BigDecimal getCostoUnitario() {
        return this.costoUnitario;
    }
    
    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public byte[] getDocumentoAsociado() {
        return this.documentoAsociado;
    }
    
    public void setDocumentoAsociado(byte[] documentoAsociado) {
        this.documentoAsociado = documentoAsociado;
    }
    public char getProcesada() {
        return this.procesada;
    }
    
    public void setProcesada(char procesada) {
        this.procesada = procesada;
    }
    public Set<TropaDet> getTropaDets() {
        return this.tropaDets;
    }
    
    public void setTropaDets(Set<TropaDet> tropaDets) {
        this.tropaDets = tropaDets;
    }
    public Set<TropaDetGarron> getTropaDetGarrons() {
        return this.tropaDetGarrons;
    }
    
    public void setTropaDetGarrons(Set<TropaDetGarron> tropaDetGarrons) {
        this.tropaDetGarrons = tropaDetGarrons;
    }
    public Set<InventarioTropa> getInventarioTropas() {
        return this.inventarioTropas;
    }
    
    public void setInventarioTropas(Set<InventarioTropa> inventarioTropas) {
        this.inventarioTropas = inventarioTropas;
    }
    public Set<VentaDet> getVentaDets() {
        return this.ventaDets;
    }
    
    public void setVentaDets(Set<VentaDet> ventaDets) {
        this.ventaDets = ventaDets;
    }
    public Set<TropaPagoCiva> getTropaPagoCivas() {
        return this.tropaPagoCivas;
    }
    
    public void setTropaPagoCivas(Set<TropaPagoCiva> tropaPagoCivas) {
        this.tropaPagoCivas = tropaPagoCivas;
    }
    public Set<TropaViaje> getTropaViajes() {
        return this.tropaViajes;
    }
    
    public void setTropaViajes(Set<TropaViaje> tropaViajes) {
        this.tropaViajes = tropaViajes;
    }




}


