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

/**
 *
 * @author giovanny
 */
public class CreditoBusinessImpl implements ICreditoBusiness {

    private CreditoDaoImpl creditoDaoImpl = new CreditoDaoImpl();

    @Override
    public List<Credito> obtenerListaCreditos() {
        return creditoDaoImpl.obtenerListaCreditos();
    }

    @Override
    public Credito obtenerCredito(Double numcredito) {
        return creditoDaoImpl.obtenerCredito(numcredito);
    }

    @Override
    public String crearCredito(Credito credito) {
        String respuesta = "credito ya existe";
        Credito user = obtenerCredito(credito.getNumcredito());
        if (user == null) {
            respuesta = creditoDaoImpl.crearCredito(credito);
        }
        return respuesta;
    }

  
/*
    @Override
    public Credito obtenerUsuario(String email, String clave) {
       return usuarioDaoImpl.obtenerUsuario(email, clave);
    }*/
}
