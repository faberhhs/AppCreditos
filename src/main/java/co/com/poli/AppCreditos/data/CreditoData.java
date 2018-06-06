/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.data;

import co.com.poli.AppCreditos.model.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class CreditoData {
   
    private static List<Credito> listaCredito;
    
    static{
        
        listaCredito = new ArrayList<Credito>(){
            {
                add(new Credito("001", "1020", "Yesica de herlen", 200D, "independiente", "vivienda"
                        , "si"));
                              
            }
        };
    }

    public static List<Credito> getListaCreditos() {
        return listaCredito;
    }

    public static void setListaCreditos(List<Credito> aListaCreditos) {
        listaCredito = aListaCreditos;
    }
    
    
    
}

