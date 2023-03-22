/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.util.Locale;
import javax.swing.DefaultListModel;
import novoselac.controller.ObradaPosjeta;
import novoselac.model.Posjeta;
import novoselac.util.Aplikacija;

/**
 *
 * @author Administrator
 */
public class ProzorPosjeta 
        extends javax.swing.JFrame
implements NovoselacViewSucelje{

    
    private ObradaPosjeta obrada;
    /**
     * Creates new form ProzorPosjeta
     */
    public ProzorPosjeta() {
        initComponents();
        obrada= new ObradaPosjeta();
        
               setTitle(Aplikacija.NAZIV_NOVOSELAC+ ": "+
               Aplikacija.OPERATER.getImePrezime() +
                ": Posjete");
        
        ucitajDjecu();
        ucitajUsluge();
        odaberiDatumIVrijemeDolaska();
        ucitaj();
    }
    
    private void odaberiDatumIVrijemeDolaska() {
        
     
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chbOdaberiUslugu = new javax.swing.JComboBox<>();
        chbOdaberiDijete = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dpDatumIVrijemeOdlaska = new com.github.lgooddatepicker.components.DateTimePicker();
        pdDatumIVrijemeDolaska = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        chbOdaberiUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOdaberiUsluguActionPerformed(evt);
            }
        });

        chbOdaberiDijete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOdaberiDijeteActionPerformed(evt);
            }
        });

        jLabel3.setText("Odaberi uslugu");

        jLabel1.setText("Rezerviraj svoj termin");

        jLabel4.setText("Odaberi datum i vrijeme odlaska");

        jLabel2.setText("Odaberi dijete");

        jLabel5.setText("Odaberi datum i vijeme dolaska");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(chbOdaberiDijete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(chbOdaberiUslugu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(dpDatumIVrijemeOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdDatumIVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbOdaberiDijete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbOdaberiUslugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(pdDatumIVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dpDatumIVrijemeOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chbOdaberiUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOdaberiUsluguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbOdaberiUsluguActionPerformed

    private void chbOdaberiDijeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOdaberiDijeteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbOdaberiDijeteActionPerformed


    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Posjeta> chbOdaberiDijete;
    private javax.swing.JComboBox<Posjeta> chbOdaberiUslugu;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumIVrijemeOdlaska;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.github.lgooddatepicker.components.DateTimePicker pdDatumIVrijemeDolaska;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ucitaj() {
   }

    @Override
    public void napuniView() {
   var e = obrada.getEntitet();
       
     }

    @Override
    public void napuniModel() {
        
        
        
   }

    private void ucitajDjecu() {
   
    }

    private void ucitajUsluge() {
     
    }
}
