/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

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
   return session.createQuery("from Dijete", Dijete.class).list();
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
