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
    
    //implementacija metoda

    @Override
    public List<Operater> read() {
        return (List<Operater>) session.createQuery("from Operater", Operater.class).list();
                
           }
    
        public void unosAdminOperatera()  {
        Operater o = new Operater();
        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setOib("94520053219");
        o.setLozinka(BCrypt.hashpw("lozinka",
                BCrypt.gensalt()).toCharArray());

        entitet = o;

        try {
             create();
        } catch (NovoselacException ex) {
            System.out.println(ex.getPoruka());
        }
       
    }
        
        public Operater autoriziraj(String KIme, char[] lozinka){
            Operater o;
            
            o=session.createQuery("Korisničko ime", KIme)
                    getSingleResult();
            return null;
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
