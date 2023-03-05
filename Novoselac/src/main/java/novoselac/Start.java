/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package novoselac;

//import novoselac.util.PocetniInsert;

import novoselac.controller.ObradaUsluga;
import novoselac.model.Usluga;
import novoselac.util.NovoselacException;





/**
 *
 * @author Administrator
 */
public class Start {

    public static void main(String[] args) {
//      new PocetniInsert(); nakon importa maknut inesert
        ObradaUsluga ou= new ObradaUsluga();
        
        Usluga usluga = new Usluga();
        usluga.setNaziv("Prvi preko kontorlera");
        
        try {
            ou.create();
        } catch (NovoselacException e) {
        }
        
        
        
        
    for (Usluga u: ou.read()){
        System.out.println(u.getNaziv());
        
    }
    }
}
