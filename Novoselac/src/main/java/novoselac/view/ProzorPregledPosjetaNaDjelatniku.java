/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import novoselac.controller.ObradaDjelatnik;
import novoselac.controller.ObradaPosjeta;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Posjeta;
import novoselac.util.Aplikacija;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Administrator
 */
public class ProzorPregledPosjetaNaDjelatniku 
        extends javax.swing.JFrame 
        implements NovoselacViewSucelje{
    
    private ObradaPosjeta obrada;
    private ObradaDjelatnik obradaDjelatnik;
//     private DecimalFormat df;

    /**
     * Creates new form ProzorPregledPosjetaNaDjelatniku
     */
    public ProzorPregledPosjetaNaDjelatniku() {
        initComponents();
        obrada= new ObradaPosjeta();
        obradaDjelatnik = new ObradaDjelatnik();
        
         setTitle(Aplikacija.NAZIV_NOVOSELAC+ ": "+
               Aplikacija.OPERATER.getImePrezime() +
                ": Posjete na djelatniku");

         ucitaj();//veza djelatnika i posjete
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        lstDogovorenePosjete = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstDogovorenePosjete.setEnabled(false);
        lstDogovorenePosjete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstDogovorenePosjeteMouseClicked(evt);
            }
        });
        lstDogovorenePosjete.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDogovorenePosjeteValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstDogovorenePosjete);

        jLabel14.setText("Djelatnik");

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel15.setText("Posjeta");

        btnExcel.setText("Ispiši u Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnExcel))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        obradaDjelatnik.setEntitet(lstPodaci.getSelectedValue());

        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void lstDogovorenePosjeteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDogovorenePosjeteValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstDogovorenePosjete.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstDogovorenePosjete.getSelectedValue());

        napuniView();
    }//GEN-LAST:event_lstDogovorenePosjeteValueChanged

    private void lstDogovorenePosjeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstDogovorenePosjeteMouseClicked

    }//GEN-LAST:event_lstDogovorenePosjeteMouseClicked

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
           JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home")
                + File.separator + "podaci.xlsx"));
        if (jfc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        try {

            Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

            /* CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
            CreationHelper createHelper = workbook.getCreationHelper();

            // Create a Sheet
            Sheet sheet = workbook.createSheet("Polaznici smjera");

            // Create a Font for styling header cells
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            // Create a CellStyle with the font
            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row
            Row headerRow = sheet.createRow(0);

            // Create cells
            Cell cell = headerRow.createCell(0);
            cell.setCellValue("Djelatnik");
            cell.setCellStyle(headerCellStyle);
            
            cell = headerRow.createCell(1);
            cell.setCellValue("Posjeta");
            cell.setCellStyle(headerCellStyle);

           

            // Create Other rows and cells with employees data
            int rowNum = 1;
            Row row;
            for(Djelatnik d: obradaDjelatnik.read()){
            for (Posjeta p : d.getPosjete()) {
                                   
                
                row = sheet.createRow(rowNum++);

                row.createCell(0)
                        .setCellValue(p.getDjelatnik().getIme());

                row.createCell(1)
                        .setCellValue(p.getDatumVrijemeDolaska().toString());

             
                }

            
            }

            row = sheet.createRow(rowNum);
            cell = row.createCell(3);
            CellStyle style = workbook.createCellStyle();
            DataFormat format = workbook.createDataFormat();
            style.setDataFormat(format.getFormat("0.00"));
            cell.setCellStyle(style);
//            cell.setCellFormula("sum(E2:E" + (rowNum) + ")");

            // Resize all columns to fit the content size
            for (int i = 0; i < 4; i++) {
                sheet.autoSizeColumn(i);
            }

            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(jfc.getSelectedFile());
            workbook.write(fileOut);
            fileOut.close();

            // Closing the workbook
            workbook.close();

            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", jfc.getSelectedFile().getAbsolutePath());
            builder.redirectErrorStream(true);
            Process p = builder.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
   

    }//GEN-LAST:event_btnExcelActionPerformed

    
    
    
    @Override
    
    //veza posjete i djelatnika
    
    public void ucitaj() {
        DefaultListModel<Djelatnik> m=
                new DefaultListModel<>();
        m.addAll(obradaDjelatnik.read());
        lstPodaci.setModel(m);
    }

    @Override
    public void napuniView() {
         var d = obradaDjelatnik.getEntitet();
        
        // veza djelatnik posjeta       
        
   DefaultListModel<Posjeta> m = new DefaultListModel<>();
   if (d.getPosjete()!=null && !d.getPosjete().isEmpty()){
       m.addAll(d.getPosjete());
   }
   lstDogovorenePosjete.setModel(m);
   
   
  
   
   }

    @Override
    public void napuniModel() {
          var e = obradaDjelatnik.getEntitet();
         List<Posjeta> posjete = new ArrayList<>();
        try {
            DefaultListModel<Posjeta> m = (DefaultListModel<Posjeta>) lstDogovorenePosjete.getModel();
            for(int i=0;i<m.getSize();i++){
                posjete.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        e.setPosjete(posjete);}

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Posjeta> lstDogovorenePosjete;
    private javax.swing.JList<Djelatnik> lstPodaci;
    // End of variables declaration//GEN-END:variables
}
