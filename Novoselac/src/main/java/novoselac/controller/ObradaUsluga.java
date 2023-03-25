/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.controller;

import java.math.BigDecimal;
import java.util.List;
import novoselac.model.Usluga;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ObradaUsluga extends Obrada<Usluga> {

    public List<Usluga> read() {
      
      
      
        return session.createQuery("from Usluga order by naziv",
                Usluga.class).list();
    }

    @Override
    protected void kontrolaUnos() throws NovoselacException {
  kontrolaNaziv();
  kontrolaCijena();
    }
    @Override
    protected void kontrolaPromjena() throws NovoselacException {
        kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivMinimalnaDuzina();
        kontrolaNazivMaksimalnaDuzina();
    }

    @Override
    protected void kontrolaBrisanje() throws NovoselacException {
        if(entitet.getPosjete()!= null &&
                !entitet.getPosjete().isEmpty()){
        throw new NovoselacException("Usluga se ne može brisati"
                + " jer ima posjete ");
    }

        
   }
   
    //1.UNOS
    //kontrola naziva
    
  protected void kontrolaNaziv() throws NovoselacException {
        kontrolaNazivNull();//radi
        kontrolaNazivNijeBroj();//radi
        kontrolaNazivMinimalnaDuzina();//radi
        kontrolaNazivMaksimalnaDuzina();//radi
        kontrolaNazivDupliUBazi();//radi
  }
  
  
  //kontrola cijena
  
   protected void kontrolaCijena() throws NovoselacException {
        if(entitet.getCijena()==null ||
                entitet.getCijena().compareTo(BigDecimal.ZERO)<=0 ||
                entitet.getCijena().compareTo(new BigDecimal(500))==1){
            throw new NovoselacException("Cijena mora biti postavljena, "
                    + "veća od 0 i manja od 500");
        }
    }
   
   //ako cijena je nije unesena ili je veća od 0 ili je veća od 10000 izbaci grešku-radi
  
  
    private void kontrolaNazivDupliUBazi() throws NovoselacException  {
        List<Usluga> usluge=null;
        try {
            usluge = session.createQuery("from Usluga u "
                    + " where u.naziv=:naziv", 
                    Usluga.class)
                    .setParameter("naziv", entitet.getNaziv())
                    .list();
        } catch (Exception e) {
        }
        if(usluge!=null && !usluge.isEmpty()){
            throw new NovoselacException("Usluga s istim nazivom postoji u bazi");
        }
    }
  
  
  private void kontrolaNazivNull() throws NovoselacException{
      if(entitet.getNaziv()==null){
          throw new NovoselacException ("Naziv usluge mora biti postavljen");
          
      
      }
  }
    private void kontrolaNazivMaksimalnaDuzina() throws NovoselacException{
      if(entitet.getNaziv().trim().length()>20){
          throw new NovoselacException ("Naziv usluge može imati maksimalno 20 znakova");
          
      
      }
  }
  
  private void kontrolaNazivMinimalnaDuzina() throws NovoselacException{
      if(entitet.getNaziv().trim().length()<3){
          throw new NovoselacException ("Naziv usluge može imati minimalno 3 znaka");
          
      
      }
  }
  
  
  private void kontrolaNazivNijeBroj()throws NovoselacException{
     
      boolean broj= false;
      try {
         Double.parseDouble(entitet.getNaziv());
         broj=true;
        
      } catch (Exception e) {
        
      }
      if(broj)
   throw new NovoselacException("Naziv smjera ne smije biti broj");
  }

   
}
  

    
