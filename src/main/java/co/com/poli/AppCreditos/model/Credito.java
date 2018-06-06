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
    
    private String numcredito;
    private String documento;
    private String nombres;
    private Double monto;
    private String tipoTrabajador;
    private String tipoCredito;
    private String trabaja;

    public Credito(String numcredito, String documento, String nombres, Double monto, String tipoTrabajador, String tipoCredito, String trabaja) {
        this.numcredito = numcredito;
        this.documento = documento;
        this.nombres = nombres;
        this.monto = monto;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoCredito = tipoCredito;
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

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    
    
}
