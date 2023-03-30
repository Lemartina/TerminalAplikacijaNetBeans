/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.List;
import novoselac.model.Djelatnik;
import novoselac.util.Alati;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ObradaDjelatnik  extends Obrada<Djelatnik>{

    
    //implementacija abstraktnih metoda
    @Override
    public List<Djelatnik> read() {
   return session.createQuery
        ("from Djelatnik", Djelatnik.class).list();
           
           }

    @Override
    protected void kontrolaUnos() throws NovoselacException {
    kontrolaFormatOib();
     kontrolaOibDupliUBazi();
    }

    @Override
    protected void kontrolaPromjena() throws NovoselacException {
    }

    @Override
    protected void kontrolaBrisanje() throws NovoselacException {
   if(entitet.getPosjete()!= null &&
                !entitet.getPosjete().isEmpty()){
        throw new NovoselacException("Djelatnik se ne može brisati"
                + " jer ima dogovorne posjete ");
     
   }
    }
 
    private void kontrolaOibDupliUBazi() throws NovoselacException{
         List<Djelatnik> djelatnici=null;
        try {
            djelatnici = session.createQuery("from Djelatnik u "
                    + " where u.oib=:oib", 
                    Djelatnik.class)
                    .setParameter("oib", entitet.getOib())
                    .list();
        } catch (Exception e) {
        }
        if(djelatnici!=null && !djelatnici.isEmpty()){
            throw new NovoselacException("Djelatnik s istim oibom postoji u bazi");
        }
    }
            
            
            
    private void kontrolaFormatOib() throws NovoselacException{
//        if(!Alati.kontrolaOIB(entitet.getOib())){
//            throw new NovoselacException("OIB nije u dobrom formatu");
//        }
    }
}
