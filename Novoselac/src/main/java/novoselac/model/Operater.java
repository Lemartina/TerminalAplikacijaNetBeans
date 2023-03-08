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
public class Operater  extends Djelatnik{
@Column (columnDefinition="char(61))")

    public char[] getLozinka() {
        return lozinka;
    }

    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }
    
    
    private char[] lozinka;
    
}
