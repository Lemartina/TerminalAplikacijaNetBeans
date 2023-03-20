///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package novoselac.view;
//
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import novoselac.model.Dijete;

public class DijeteRenderer 
extends JLabel
implements ListCellRenderer<Dijete>{

    
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
            setBackground(Color.BLUE);//pozadina označenog bude plava
            if(neMozeBrisati){
                setForeground(Color.GRAY);
            }else{
                setForeground(Color.RED);//kada je označeno bude crveno
            }
            
        } else {
            setBackground(Color.WHITE);//pozadina svega
            if(neMozeBrisati){
                setForeground(Color.GREEN);//nema na ispisu
            }else{
                setForeground(Color.MAGENTA);//sada su magenta svi na popisu i javi grešku
            }
        }
        
       
        
        

        return this;
    }
}