/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import java.awt.event.KeyEvent;
import novoselac.controller.ObradaOperater;
import novoselac.model.Operater;
import novoselac.util.Aplikacija;

/**
 *
 * @author Administrator
 */
public class ProzorLogIn extends javax.swing.JFrame {

    private ObradaOperater obrada;
    /**
     * Creates new form ProzorLogIn
     */
    public ProzorLogIn() {
        initComponents();
        obrada= new ObradaOperater();
        
        setTitle(Aplikacija.NAZIV_NOVOSELAC + " Login");
  
    }

    private void autoriziraj(){
             if(txtKorisnickoIme.getText().isEmpty()){
            lblPoruka.setText("Obavezan unos korisničkog imena");
            return;
        }
        
        if(pswLozinka.getPassword().length==0){
            lblPoruka.setText("Obavezno lozinka");
            return;
        }
        
        
        
       Operater o = obrada.autoriziraj(txtKorisnickoIme.getText(),
                pswLozinka.getPassword());
        
        
    if(o==null){
        lblPoruka.setText("Neispravna kombinacija imena i lozinke");
        return;
        
       
    }
     new ProzorIzbornik().setVisible(true);
        dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKorisnickoIme = new javax.swing.JTextField();
        lblLozinka = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        btnAutoriziraj = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Korisničko ime");

        txtKorisnickoIme.setText("Martina");
        txtKorisnickoIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKorisnickoImeActionPerformed(evt);
            }
        });
        txtKorisnickoIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKorisnickoImeKeyPressed(evt);
            }
        });

        lblLozinka.setText("Lozinka");

        pswLozinka.setText("1234567");
        pswLozinka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswLozinkaActionPerformed(evt);
            }
        });
        pswLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswLozinkaKeyPressed(evt);
            }
        });

        btnAutoriziraj.setText("Autoriziraj");
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswLozinka)
                            .addComponent(txtKorisnickoIme)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLozinka)
                .addGap(18, 18, 18)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAutoriziraj)
                .addGap(33, 33, 33)
                .addComponent(lblPoruka)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
        autoriziraj();
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void txtKorisnickoImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKorisnickoImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKorisnickoImeActionPerformed

    private void pswLozinkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswLozinkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswLozinkaActionPerformed

    private void txtKorisnickoImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKorisnickoImeKeyPressed
      if (evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(txtKorisnickoIme.getText().isEmpty()){
              lblPoruka.setText("Obavezno unesite korisničko ime");
         return;
          }
          if(pswLozinka.getPassword().length==0){
              pswLozinka.requestFocus();
              lblPoruka.setText("Obavezno unesite lozinku");
          return;
          }
            autoriziraj();
      }
    
      
      
      
    }//GEN-LAST:event_txtKorisnickoImeKeyPressed

    private void pswLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswLozinkaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(pswLozinka.getPassword().length==0
                  ){
              lblPoruka.setText("Obavezno unesite lozinku");
         return;
          }
          if(txtKorisnickoIme.getText().isEmpty()){
               lblPoruka.setText("Obavezno unesite  korisničko ime");
              txtKorisnickoIme.requestFocus();
             
          return;
          }
            autoriziraj();
      }
    }//GEN-LAST:event_pswLozinkaKeyPressed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLozinka;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtKorisnickoIme;
    // End of variables declaration//GEN-END:variables
}
