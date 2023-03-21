/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.List;
import novoselac.model.Djelatnik;
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
    kontrolaOib();
    }

    @Override
    protected void kontrolaPromjena() throws NovoselacException {
    }

    @Override
    protected void kontrolaBrisanje() throws NovoselacException {
   if(entitet.getPosjete()==null &&
           !entitet.getPosjete().isEmpty()){
       throw new NovoselacException("Djelatnik se ne može brisati jer"
               + "ima zabilježenu posjetu");
     
   }
    }
 
    
    private void kontrolaOib() throws NovoselacException{
        
    }
}
