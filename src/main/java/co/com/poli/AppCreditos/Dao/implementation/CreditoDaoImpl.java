/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.Dao.implementation;

import co.com.poli.AppCreditos.data.CreditoData;
import co.com.poli.AppCreditos.model.Credito;
import java.util.List;
import co.com.poli.AppCreditos.Dao.ICreditoDao;

/**
 *
 * @author giovanny
 */
public class CreditoDaoImpl implements ICreditoDao{

    @Override
    public List<Credito> obtenerListaCreditos() {
        return CreditoData.getListaCreditos();
    }

    @Override
    public Credito obtenerCredito(Double numcredito) {
        Credito credito = null;
        List<Credito> listaCreditos = CreditoData.getListaCreditos();
        for (Credito userLista : listaCreditos) {
            if(userLista.getNumcredito().equals(numcredito)){
                credito = userLista;
            }
        }
        return credito;
    }

    @Override
    public String crearCredito(Credito credito) {
        List<Credito> listaCreditos = CreditoData.getListaCreditos();
        listaCreditos.add(credito);
        CreditoData.setListaCreditos(listaCreditos);
        return "credito creado";
    }

/*
    @Override
    public Credito obtenerUsuario(String email, String clave) {
        Credito usuario = null;
        List<Credito> obtenerListaUsuarios = obtenerListaUsuarios();
        for (Credito user : obtenerListaUsuarios) {
            if(user.getEmail().equals(email) && 
               user.getClave().equals(clave)){
                usuario = user;
            }
        }
        return usuario;
    }   */ 

}
