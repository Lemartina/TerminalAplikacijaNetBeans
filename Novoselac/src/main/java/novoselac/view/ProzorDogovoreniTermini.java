/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import novoselac.controller.ObradaDijete;
import novoselac.controller.ObradaPosjeta;
import novoselac.controller.ObradaUsluga;
import novoselac.model.Dijete;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import novoselac.util.Aplikacija;

/**
 *
 * @author Administrator
 */
public class ProzorDogovoreniTermini extends javax.swing.JFrame
implements NovoselacViewSucelje
{

//Broj posjeta po uslugama - koje se uluge najčešće koriste    
    
    private ObradaUsluga obrada;
    private ObradaPosjeta obradaPosjeta;
    /**
     * Creates new form ProzorDogovoreniTermini
     */
    public ProzorDogovoreniTermini() {
        initComponents();
        obrada = new ObradaUsluga();
        obradaPosjeta= new ObradaPosjeta();
         setTitle(Aplikacija.NAZIV_NOVOSELAC+ ": "+
               Aplikacija.OPERATER.getImePrezime() +
                ": Usluge po posjetama");
         ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStatistikaUsluga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPosjeta = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnStatistikaUsluga.setText("Statistika usluga graf");
        btnStatistikaUsluga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikaUslugaActionPerformed(evt);
            }
        });

        jLabel1.setText("Usluga");

        jLabel2.setText("Posjeta");

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        lstPosjeta.setEnabled(false);
        jScrollPane2.setViewportView(lstPosjeta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStatistikaUsluga)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnStatistikaUsluga))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatistikaUslugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikaUslugaActionPerformed
         new ProzorPregledUsluga().setVisible(true);
    }//GEN-LAST:event_btnStatistikaUslugaActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        napuniView();

    }//GEN-LAST:event_lstPodaciValueChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatistikaUsluga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Usluga> lstPodaci;
    private javax.swing.JList<Posjeta> lstPosjeta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ucitaj() {
        
        
        // puni listu usluga
        DefaultListModel<Usluga> m=
                new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
   }

    @Override
    public void napuniView() {
        
        var u = obrada.getEntitet();
        
        // veza usluga posjeta       
        
   DefaultListModel<Posjeta> m = new DefaultListModel<>();
   if (u.getPosjete()!=null && !u.getPosjete().isEmpty()){
       m.addAll(u.getPosjete());
   }
   lstPosjeta.setModel(m);
   
   
   

           
           }
    
    
    

    @Override
    public void napuniModel() {
        
        var e = obrada.getEntitet();
         List<Posjeta> posjete = new ArrayList<>();
        try {
            DefaultListModel<Posjeta> m = (DefaultListModel<Posjeta>) lstPosjeta.getModel();
            for(int i=0;i<m.getSize();i++){
                posjete.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        e.setPosjete(posjete);
        
    }
        
    
}
