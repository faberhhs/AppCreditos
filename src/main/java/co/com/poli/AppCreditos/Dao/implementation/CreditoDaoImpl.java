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
import co.com.poli.AppCreditos.jpacontroller.TblcreditosJpaController;
import co.com.poli.AppCreditos.model.Tblcreditos;
import co.com.poli.AppCreditos.util.JPAFactory;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovanny
 */
public class CreditoDaoImpl implements ICreditoDao {

    @Override
    public List<Tblcreditos> obtenerListaCreditos() {
        List<Tblcreditos> CreList = new ArrayList<>();
        TblcreditosJpaController tblcreditosJpaController = new TblcreditosJpaController(JPAFactory.getFACTORY());
        CreList = tblcreditosJpaController.findTblcreditosEntities();
        return CreList;
    }

    @Override
    public Boolean crearCredito(Tblcreditos credito) {
        Boolean sw = false;
        try {
            TblcreditosJpaController tblcreditosJpaController = new TblcreditosJpaController(JPAFactory.getFACTORY());
            tblcreditosJpaController.create(credito);

        } catch (Exception ex) {
            sw = true;
            Logger.getLogger(CreditoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sw;
    }

}
