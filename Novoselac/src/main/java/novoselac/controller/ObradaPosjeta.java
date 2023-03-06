/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.List;
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
