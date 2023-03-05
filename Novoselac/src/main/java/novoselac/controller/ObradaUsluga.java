/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.List;
import novoselac.model.Usluga;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ObradaUsluga extends Obrada<Usluga> {

    @Override
    public List<Usluga> read() {
        return session.createQuery("from Usluga", Usluga.class).list();
    }

    @Override
    protected void kontrolaUnos() throws NovoselacException {
  kontrolaNaziv();
    }
    @Override
    protected void kontrolaPromjena() throws NovoselacException {
   }

    @Override
    protected void kontrolaBrisanje() throws NovoselacException {
   }
    
  protected void kontrolaNaziv() throws NovoselacException {
            kntrolaNazivNijeBroj();
  }
  
  private void kntrolaNazivNijeBroj() throws NovoselacException{
  }
}
  

    
