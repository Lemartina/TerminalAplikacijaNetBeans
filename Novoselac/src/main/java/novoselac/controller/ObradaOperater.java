/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.util.List;
import novoselac.model.Operater;
import novoselac.util.NovoselacException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Administrator
 */

 
public class ObradaOperater extends Obrada<Operater> {

    @Override
   
    public List<Operater> read() {
        return null;
    }

    public void unosAdminOperatera() throws NovoselacException {
        Operater o = new Operater();
        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setOib("94520053219");
        o.setLozinka(BCrypt.hashpw("lozinka",
                BCrypt.gensalt()).toCharArray());
        
   entitet=o;
        
create();
    }
}
