/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.model;

import java.util.Objects;

/**
 *
 * @author giovanny
 */
public class Credito {
    
    private Double numcredito;
    private Double documento;
    private String nombres;
    private Double monto;
    private Boolean tipoTrabajador;
    private Boolean tipoCredito;
    private Boolean trabaja;

    public Credito(Double numcredito, Double documento, String nombres, Double monto, Boolean tipoTrabajador, Boolean tipoCredito, Boolean trabaja) {
        this.numcredito = numcredito;
        this.documento = documento;
        this.nombres = nombres;
        this.monto = monto;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoCredito = tipoCredito;
        this.trabaja = trabaja;
    }

    public Double getNumcredito() {
        return numcredito;
    }

    public void setNumcredito(Double numcredito) {
        this.numcredito = numcredito;
    }

    public Double getDocumento() {
        return documento;
    }

    public void setDocumento(Double documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(Boolean tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public Boolean getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(Boolean tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.numcredito);
        hash = 29 * hash + Objects.hashCode(this.documento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (!Objects.equals(this.numcredito, other.numcredito)) {
            return false;
        }
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }

    
    
}
