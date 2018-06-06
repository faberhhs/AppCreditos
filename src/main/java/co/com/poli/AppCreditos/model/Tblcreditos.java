/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FABER
 */
@Entity
@Table(name = "tblcreditos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcreditos.findAll", query = "SELECT t FROM Tblcreditos t")
    , @NamedQuery(name = "Tblcreditos.findByNumcredito", query = "SELECT t FROM Tblcreditos t WHERE t.numcredito = :numcredito")
    , @NamedQuery(name = "Tblcreditos.findByDocumento", query = "SELECT t FROM Tblcreditos t WHERE t.documento = :documento")
    , @NamedQuery(name = "Tblcreditos.findByNombre", query = "SELECT t FROM Tblcreditos t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblcreditos.findByMonto", query = "SELECT t FROM Tblcreditos t WHERE t.monto = :monto")
    , @NamedQuery(name = "Tblcreditos.findByTipotrabajador", query = "SELECT t FROM Tblcreditos t WHERE t.tipotrabajador = :tipotrabajador")
    , @NamedQuery(name = "Tblcreditos.findByTipocredito", query = "SELECT t FROM Tblcreditos t WHERE t.tipocredito = :tipocredito")
    , @NamedQuery(name = "Tblcreditos.findByTrabaja", query = "SELECT t FROM Tblcreditos t WHERE t.trabaja = :trabaja")})
public class Tblcreditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "numcredito")
    private String numcredito;
    @Size(max = 2147483647)
    @Column(name = "documento")
    private String documento;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Size(max = 2147483647)
    @Column(name = "tipotrabajador")
    private String tipotrabajador;
    @Size(max = 2147483647)
    @Column(name = "tipocredito")
    private String tipocredito;
    @Size(max = 2147483647)
    @Column(name = "trabaja")
    private String trabaja;

    public Tblcreditos() {
    }

    public Tblcreditos(String numcredito, String documento, String nombre, Double monto, String tipotrabajador, String tipocredito, String trabaja) {
        this.numcredito = numcredito;
        this.documento = documento;
        this.nombre = nombre;
        this.monto = monto;
        this.tipotrabajador = tipotrabajador;
        this.tipocredito = tipocredito;
        this.trabaja = trabaja;
    }
    
    

    public Tblcreditos(String numcredito) {
        this.numcredito = numcredito;
    }

    public String getNumcredito() {
        return numcredito;
    }

    public void setNumcredito(String numcredito) {
        this.numcredito = numcredito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numcredito != null ? numcredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcreditos)) {
            return false;
        }
        Tblcreditos other = (Tblcreditos) object;
        if ((this.numcredito == null && other.numcredito != null) || (this.numcredito != null && !this.numcredito.equals(other.numcredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.AppCreditos.model.Tblcreditos[ numcredito=" + numcredito + " ]";
    }
    
}
