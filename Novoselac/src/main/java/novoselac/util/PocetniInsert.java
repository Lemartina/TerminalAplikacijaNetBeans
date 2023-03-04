/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class PocetniInsert {

    private static final int BROJ_USLUGA=20;
    private static final int BROJ_DJECE=500;
    private static final int BROJ_DJELATNIKA=5;

    

    
    private Faker faker;
     private List<Usluga>usluge;
    private List<Dijete>djeca;
   
    private List<Djelatnik>djelatnici;
    private List<Posjeta>posjete;
    private Session session;
    
    
    public PocetniInsert() {
        
        faker=new Faker();
        usluge= new ArrayList<>();
        djeca= new ArrayList<>();
        
        djelatnici=new ArrayList<>();
        posjete= new ArrayList<>();
        session=HibernateUtil.getSession();
        session.beginTransaction();
        kreirajUsluge();
//        kreirajDjecu();
//        kreirajDjelatnike();
        session.getTransaction().commit();
    }
    
    private void kreirajUsluge(){
        Usluga u;
        for(int i=0; i<BROJ_USLUGA; i++){
            u= new Usluga();
            u.setNaziv(faker.app().name());
            u.setJedinicaMjere("sat");
            u.setKolicina(new BigDecimal(faker.number().numberBetween(1, 10)));
            u.setCijena(new BigDecimal(faker.number().numberBetween(20, 300)));
            
            session.persist(u);
            usluge.add(u);
        }
            
    }
 
    private void kreirajDjecu(){
        Dijete d;
        for (int i=0; i<BROJ_DJECE; i++){
            d=new Dijete();
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            d.setImeRoditelja(faker.name().firstName());
//            d.setTelefonRoditelja(faker.phoneNumber();
            
                    
        }
    }
  
    
    private void kreirajDjelatnike(){
        Djelatnik j;
        for (int i=0; i<BROJ_DJELATNIKA; i++){
            j= new Djelatnik();
            j.setIme(faker.name().firstName());
            j.setPrezime(faker.name().lastName());
            //j.setOib(Alati.dovuciOib());
            j.setRadnoMjesto(faker.name().title());
            j.setIban(faker.business().creditCardNumber());
        }
    }
}
