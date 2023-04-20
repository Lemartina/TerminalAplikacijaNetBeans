/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import novoselac.controller.ObradaDijete;
import novoselac.controller.ObradaDjelatnik;
import novoselac.controller.ObradaPosjeta;
import novoselac.controller.ObradaUsluga;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import novoselac.util.Aplikacija;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ProzorDijeteUslugaPosjeta 
        extends javax.swing.JFrame 
implements NovoselacViewSucelje{
    
    private ObradaPosjeta obrada;
    private ObradaDijete obradaDijete;
    

    /**
     * Creates new form ProzorDijeteUslugaPosjeta
     */
    public ProzorDijeteUslugaPosjeta() {
        initComponents();
        obrada= new ObradaPosjeta();
        obradaDijete = new  ObradaDijete();
        
        setTitle(Aplikacija.NAZIV_NOVOSELAC + ": " + 
                Aplikacija.OPERATER.getImePrezime() + 
                ": Pregled svega");
         odaberiDatumIVrijemeDolaska();
        odaberiDatumIVrijemeOdlaska();
//        ucitajFilterUsluge();
        ucitajUsluge();
        ucitajDjelatnike();
//        ucitajDjecu();
//        ucitajPosjete();
//         ucitaj();
    }
    
    private void odaberiDatumIVrijemeDolaska() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY. ");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dpPocetniDatum.setSettings(dps);
         
       
         
         ArrayList<LocalTime>lista= new ArrayList<>();
         
           for(int j=0;j<24;j++){
        for(int i=0;i<60;i+=15){
            lista.add(LocalTime.of(j, i));
        }
        }
         
          
       
               
    }
    
      private void odaberiDatumIVrijemeOdlaska() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY. ");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
         dpKrajnjiDatum.setSettings(dps);
         
       
         
         ArrayList<LocalTime>lista= new ArrayList<>();
         
           for(int j=0;j<24;j++){
        for(int i=0;i<60;i+=15){
            lista.add(LocalTime.of(j, i));
        }
        }
         
         
               
    
    }
      
      private void ucitajUsluge(){
//        DefaultComboBoxModel<Usluga> m
//                = new DefaultComboBoxModel<>();
//        Usluga u = new Usluga();
//        u.setSifra(0);
//        u.setNaziv("Nije odabrano");
//        m.addElement(u);
//        m.addAll(new ObradaUsluga().read());
//        cmbUsluge.setModel(m);
//        cmbUsluge.repaint();
    }
//    
    private void ucitajDjelatnike(){
        DefaultComboBoxModel<Djelatnik> m
                = new DefaultComboBoxModel<>();
        Djelatnik d = new Djelatnik();
        d.setSifra(0);
        d.setIme("Nije");
        d.setPrezime("odabrano");
        m.addElement(d);
        m.addAll(new ObradaDjelatnik().read());
        cmbDjelatnik.setModel(m);
        cmbDjelatnik.repaint();
    }
    
    
    
//    private void ucitajDjecu(){
//        DefaultComboBoxModel<Dijete> m
//                = new DefaultComboBoxModel<>();
//        Dijete d = new Dijete();
//        d.setSifra(0);
//        d.setIme("Nije");
//        d.setPrezime("odabrano");
//        m.addElement(d);
//        m.addAll(new ObradaDijete().read());
//        lstDjecaNaPosjeti.setModel(m);
//        lstDjecaNaPosjeti.repaint();
//    }
    
    
    
//        private void ucitajPosjete(){
//        DefaultComboBoxModel<Posjeta> m
//                = new DefaultComboBoxModel<>();
//        Posjeta p = new Posjeta();
//        p.setSifra(0);
//        m.addElement(p);
//        m.addAll(new ObradaPosjeta().read());
//        lstPodaciPosjete.setModel(m);
//        lstPodaciPosjete.repaint();
//    }
// private void ucitajFilterUsluge(){
//        DefaultComboBoxModel<Usluga> m
//                = new DefaultComboBoxModel<>();
//        m.addAll(new ObradaUsluga().read());
//        cmbFilterUsluge.setModel(m);
//        cmbFilterUsluge.repaint();
//        cmbFilterUsluge.setSelectedIndex(0);
//    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTlakTubinga = new javax.swing.JTextField();
        dpPretraziDatum = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        btnPretraziOd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTlakNaftovoda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTlakCasinga = new javax.swing.JTextField();
        cmbDjelatnik = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPosjete = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        cmbUsluge = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPregledPosjetaPoDatumu = new javax.swing.JList<>();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dpPocetniDatum = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        dpKrajnjiDatum = new com.github.lgooddatepicker.components.DatePicker();
        txtNapomena = new javax.swing.JTextField();
        btnPretraži = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTlakTubinga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTlakTubinga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(135, 135, 135)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tlak tubinga:");

        btnPretraziOd.setBackground(new java.awt.Color(37, 179, 213));
        btnPretraziOd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPretraziOd.setForeground(new java.awt.Color(102, 102, 102));
        btnPretraziOd.setText("Pretraži");
        btnPretraziOd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziOdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tlak naftovoda:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Do:");

        txtTlakNaftovoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTlakNaftovoda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(135, 135, 135)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Od:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tlak casinga:");

        txtTlakCasinga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTlakCasinga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(135, 135, 135)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Posao:");

        lstPosjete.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPosjeteValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(lstPosjete);

        btnDodaj.setBackground(new java.awt.Color(37, 179, 213));
        btnDodaj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDodaj.setForeground(new java.awt.Color(102, 102, 102));
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Busotina:");

        lstPregledPosjetaPoDatumu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPregledPosjetaPoDatumuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPregledPosjetaPoDatumu);

        btnPromjeni.setBackground(new java.awt.Color(37, 179, 213));
        btnPromjeni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromjeni.setForeground(new java.awt.Color(102, 102, 102));
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setBackground(new java.awt.Color(37, 179, 213));
        btnObrisi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnObrisi.setForeground(new java.awt.Color(102, 102, 102));
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Podaci:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Napomena:");

        txtNapomena.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(135, 135, 135)));

        btnPretraži.setBackground(new java.awt.Color(37, 179, 213));
        btnPretraži.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPretraži.setForeground(new java.awt.Color(102, 102, 102));
        btnPretraži.setText("Pretraži");
        btnPretraži.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretražiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dpPretraziDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPretraziOd)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtTlakCasinga)
                        .addComponent(txtTlakNaftovoda)
                        .addComponent(txtTlakTubinga)
                        .addComponent(txtNapomena)
                        .addComponent(cmbDjelatnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDodaj)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(cmbUsluge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(dpPocetniDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpKrajnjiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPretraži)
                        .addGap(59, 59, 59)))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dpPretraziDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPretraziOd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDjelatnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTlakTubinga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTlakNaftovoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTlakCasinga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnPromjeni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpPocetniDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dpKrajnjiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPretraži)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPretraziOdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziOdActionPerformed
        if(dpPretraziDatum.getText().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite datum");

            return;
        }

        DefaultListModel<Posjeta> m = new DefaultListModel<>();
        m.addAll(obrada.read(dpPretraziDatum.getText()));

        lstPosjete.setModel(m);
        lstPosjete.repaint();
    }//GEN-LAST:event_btnPretraziOdActionPerformed

    private void lstPosjeteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPosjeteValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPosjete.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstPosjete.getSelectedValue());
    }//GEN-LAST:event_lstPosjeteValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
//        obrada.setEntitet(new PosaoBusotina());
//        napuniModel();
//
//        try {
//            obrada.create();
//            ucitajOdrzavanja();
//            ucitaj();
//
//        } catch (OtpremnaStanicaException ex) {
//            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
//        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void lstPregledPosjetaPoDatumuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPregledPosjetaPoDatumuValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPregledPosjetaPoDatumu.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstPregledPosjetaPoDatumu.getSelectedValue());

        napuniView();
    }//GEN-LAST:event_lstPregledPosjetaPoDatumuValueChanged

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstPregledPosjetaPoDatumu.getSelectedValue()==null){
            JOptionPane.showMessageDialog(getParent(), "Prvo odaberite podatke");

            return;

        }

        napuniModel();
        try {
            obrada.update();
            ucitaj();
        } catch (NovoselacException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
//
//        if(lstPregledPosjetaPoDatumu.getSelectedValue()==null){
//            JOptionPane.showMessageDialog(getParent(), "Prvo odaberite održavanje");
//
//            return;
//        }
//
//        if(JOptionPane.showConfirmDialog(getParent(), "Sigurno obrisati "
//            + obrada.getEntitet().getPos() + obrada.getEntitet().getObrisi() + "?", "Brisanje", JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE)== JOptionPane.NO_OPTION){
//        return;
//        }
//
//        try {
//            obrada.delete();
//            ucitaj();
//        } catch (OtpremnaStanicaException ex) {
//            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
//        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPretražiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretražiActionPerformed
        if(dpPocetniDatum.getText().isEmpty() && dpKrajnjiDatum.getText().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite datum");

            return;
        }

        DefaultListModel<Posjeta> m = new DefaultListModel<>();
//        m.addAll(obrada.read(dpPocetniDatum.getText(), dpKrajnjiDatum.getText()));

        lstPregledPosjetaPoDatumu.setModel(m);
        lstPregledPosjetaPoDatumu.repaint();
    }//GEN-LAST:event_btnPretražiActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPretraziOd;
    private javax.swing.JButton btnPretraži;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Djelatnik> cmbDjelatnik;
    private javax.swing.JComboBox<Usluga> cmbUsluge;
    private com.github.lgooddatepicker.components.DatePicker dpKrajnjiDatum;
    private com.github.lgooddatepicker.components.DatePicker dpPocetniDatum;
    private com.github.lgooddatepicker.components.DatePicker dpPretraziDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Posjeta> lstPosjete;
    private javax.swing.JList<Posjeta> lstPregledPosjetaPoDatumu;
    private javax.swing.JTextField txtNapomena;
    private javax.swing.JTextField txtTlakCasinga;
    private javax.swing.JTextField txtTlakNaftovoda;
    private javax.swing.JTextField txtTlakTubinga;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ucitaj() {
        DefaultListModel<Posjeta> m = 
                new DefaultListModel<>();
//        m.addAll(obrada.read((Posjeta).getSelectedItem());
        lstPosjete.setModel(m);
       lstPosjete.repaint();  
    }

    @Override
    public void napuniView() {
         var e = obrada.getEntitet();
       
        cmbUsluge.setSelectedItem(e.getUsluge());
        if(e.getDjelatnik()!=null){
            cmbDjelatnik.setSelectedItem(e.getDjelatnik());
        }else{
            cmbDjelatnik.setSelectedIndex(0);
        }
        if(e.getDatumVrijemeDolaska()!=null){
             LocalDate ld = e.getDatumVrijemeDolaska()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        dpPocetniDatum.setDate(ld);
        }else{
            dpPocetniDatum.setDate(null);
        }
       
//        
//        DefaultListModel<Dijete> m = new DefaultListModel<>();
//        if(e.getDjeca()!=null){
//            m.addAll(e.getDjeca());
//        }
//        lstDjecaNaPosjeti.setModel(m);
//        lstDjecaNaPosjeti.repaint();
//        
 }

    @Override
    public void napuniModel() {
        var e = obrada.getEntitet();
        
        e.setUsluge((List<Usluga>) cmbUsluge.getSelectedItem());
//        e.setDjelatnik((Djelatnik) cmbDjelatnici.getSelectedItem());
//        
//        LocalDate ld = dtpDatumIVrijemeDolaska.datePicker.getDate();
// 
//        LocalTime lt;
//        if(dtpDatumIVrijemeDolaska.timePicker.getTime()==null){
//            lt = LocalTime.NOON;
//        }else{
//            lt = dtpDatumIVrijemeDolaska.timePicker.getTime();
//        }
        
   // dpDatumPocetka.timePicker.setTime(lt);
//         LocalDateTime fromDateAndTime = LocalDateTime.of(ld,
//                                                           lt);
//        
//        Date datum = Date.from(fromDateAndTime.atZone(ZoneId.systemDefault()).toInstant());
//        
//        
//        e.setDatumVrijemeDolaska(datum);
//        
//        List<Dijete> djeca = new ArrayList<>();
//        try {
//            DefaultListModel<Dijete> m = (DefaultListModel<Dijete>) lstDjecaNaPosjeti.getModel();
//            for(int i=0;i<m.getSize();i++){
//                djeca.add(m.getElementAt(i));
//            }
//        } catch (Exception ex) {
//            
//        }
//        e.setDjeca(djeca);
    }
}
