 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoselac.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author Administrator
 */
@Entity
public class Operater  extends Entitet{

    public Operater() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
@Column (columnDefinition="char(61))")

    public char[] getLozinka() {
        return lozinka;
    }

    
    //seteri i geter
    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }
    
       public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
  
    //privatna svojst a
    private char[] lozinka;
    private String ime;
    private String prezime;
    private String oib;
    


     public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    

   
  
    
}
