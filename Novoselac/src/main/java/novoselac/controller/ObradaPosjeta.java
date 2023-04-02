/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.Collection;
import java.util.List;
import novoselac.model.Dijete;
import novoselac.model.Posjeta;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ObradaPosjeta extends Obrada <Posjeta> {

    
    //implementacija abstraktnih metoda
    @Override
    public List<Posjeta> read() {
        return session.createQuery
        ("from Posjeta", Posjeta.class).list();
    }
    
    public List<Posjeta> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
       return session.createQuery("from Posjeta "
               + " where concat(datumVrijemeDolaska,' ',napomena) "
               + " like :uvjet "
               + " order by datumVrijemeDolaska desc ", 
               Posjeta.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(100)
               .list();
    }
    

    @Override
    protected void kontrolaUnos() throws NovoselacException {
    
    }
    @Override
    protected void kontrolaPromjena() throws NovoselacException {
    }

    @Override
    protected void kontrolaBrisanje() throws NovoselacException {
   }


    
}
