/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.Business;

import co.com.poli.AppCreditos.model.Credito;
import java.util.List;

/**
 *
 * @author giovanny
 */
public interface ICreditoBusiness {
    
    List<Credito> obtenerListaCreditos();
    Credito obtenerCredito(Double numcredito);
    String crearCredito(Credito credito);
    
}
