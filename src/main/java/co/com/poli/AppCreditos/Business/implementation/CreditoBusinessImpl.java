/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.Business.implementation;

import co.com.poli.AppCreditos.Dao.implementation.CreditoDaoImpl;
import co.com.poli.AppCreditos.model.Credito;
import java.util.List;
import co.com.poli.AppCreditos.Business.ICreditoBusiness;
import co.com.poli.AppCreditos.model.Tblcreditos;

/**
 *
 * @author giovanny
 */
public class CreditoBusinessImpl implements ICreditoBusiness {

    private CreditoDaoImpl creditoDaoImpl = new CreditoDaoImpl();

    @Override
    public List<Tblcreditos> obtenerListaCreditos() {
        return creditoDaoImpl.obtenerListaCreditos();
    }

    @Override
    public Boolean crearCredito(Tblcreditos credito) {
        return creditoDaoImpl.crearCredito(credito);
    }

    @Override
    public String masUtiliza() {
        Integer contVivienda = 0;
        Integer contEstudio = 0;
        Integer contLibre = 0;
        String mensaje = "";
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipocredito().equals("vivienda")) {
                contVivienda++;
            } else if (listaCredito.getTipocredito().equals("estudio")) {
                contEstudio++;
            } else if (listaCredito.getTipocredito().equals("libre")) {
                contLibre++;
            }
        }
        if (contVivienda > contEstudio && contVivienda > contLibre) {
            mensaje = "el credito de vivienda es el mas utilizado";
        } else if (contEstudio > contVivienda && contEstudio > contLibre) {
            mensaje = "el credito de estudio es el mas utilizado";
        } else if (contLibre > contVivienda && contLibre > contEstudio) {
            mensaje = "el credito de libre inversion es el mas utilizado";
        } else {
            mensaje = "no hay un credito que sea mas utilizado";
        }
        return mensaje;
    }

    @Override
    public String acumulado() {
        Double contVivienda = 0.0;
        Double contEstudio = 0.0;
        Double contLibre = 0.0;
        String mensaje = "";
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipocredito().equals("vivienda")) {
                contVivienda = contVivienda + listaCredito.getMonto();
            } else if (listaCredito.getTipocredito().equals("estudio")) {
                contEstudio = contEstudio + listaCredito.getMonto();
            } else if (listaCredito.getTipocredito().equals("libre")) {
                contLibre = contLibre + listaCredito.getMonto();
            }
        }
        if (contVivienda > contEstudio && contVivienda > contLibre) {
            mensaje = "el credito de vivienda es el del monto mas alto, con un valor de " + contVivienda;
        } else if (contEstudio > contVivienda && contEstudio > contLibre) {
            mensaje = "el credito de estudio es el del monto mas alto, con un valor de " + contEstudio;
        } else if (contLibre > contVivienda && contLibre > contEstudio) {
            mensaje = "el credito de libre inversion es el del monto mas alto, con un valor de " + contLibre;
        }
        return mensaje;
    }

    @Override
    public String masPresta() {
        String mensaje = "";
        Integer contDependientes = 0;
        Integer contIndependientes = 0;
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipotrabajador().equals("dependiente")) {
                contDependientes++;
            } else if (listaCredito.getTipotrabajador().equals("inpendiente")) {
                contIndependientes++;
            } 
        }
        if (contDependientes > contIndependientes) {
            mensaje = "Los que mas prestan son los trabajadores dependientes: "+contDependientes+ " prestan";
        } else if (contIndependientes > contDependientes) {
            mensaje = "Los que mas prestan son los trabajadores independientes: "+contIndependientes+ " prestan";
        } else {
            mensaje = "hay igual numero de dependientes e independientes";
        }
        return mensaje;
    }

    @Override
    public Boolean creditoExiste(String documento, String tipoCredito) {
        Boolean sw = false;
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getDocumento().equals(documento)) {
                if(listaCredito.getTipocredito().equals(tipoCredito)){
                    sw = true;
                }
            }
        }
        return sw;
    }

}
