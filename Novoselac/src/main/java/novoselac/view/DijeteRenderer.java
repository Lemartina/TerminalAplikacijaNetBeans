///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package novoselac.view;
//
import novoselac.model.Dijete;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author dell
 */
// https://www.codejava.net/java-se/swing/jlist-custom-renderer-example
public class DijeteRenderer 
        extends JLabel 
        implements ListCellRenderer<Dijete> {

    public DijeteRenderer(){
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(
            JList<? extends Dijete> list,
            Dijete dijete,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        setText(dijete.getIme() + " " + dijete.getPrezime());

        
        
        boolean neMozeBrisati=dijete.getPosjete()!=null && !dijete.getPosjete().isEmpty();
        
        if (isSelected) {
            setBackground(Color.BLUE);
            if(neMozeBrisati){
                setForeground(Color.GRAY);
            }else{
                setForeground(Color.WHITE);
            }
            
        } else {
            setBackground(Color.WHITE);
            if(neMozeBrisati){
                setForeground(Color.GRAY);
            }else{
                setForeground(Color.BLACK);
            }
        }
        
       
        
        

        return this;
    }

}