/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.Collection;
import java.util.List;
import novoselac.model.Dijete;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ObradaDijete extends Obrada<Dijete> {

    
    //implementacija abstraktnih 
    @Override
    public List<Dijete> read() {
   return session.createQuery("from Dijete order by prezime, ime", 
           Dijete.class).list();
    }

        public List<Dijete> read(String uvjet,
                boolean traziOdPocetkaImena) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
        
       return session.createQuery("from Dijete "
               + " where concat(ime,' ',prezime,' ',ime) "
               + " like :uvjet "
               + " order by prezime, ime ", 
               Dijete.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(12)
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
