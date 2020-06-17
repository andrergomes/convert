/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andrergomes.convert;

import br.com.andrergomes.convert.filter.OnlyPdfFiles;
import br.com.andrergomes.convert.filter.OnlyDirectories;
import br.com.andrergomes.convert.util.PdfToPngConvert;
import darrylbu.util.SwingUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JTable;

/**
 *
 * @author Andre
 */
public class ConvertJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConverteJFrame
     */
    public ConvertJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserPdf = new javax.swing.JFileChooser();
        jFileChooserPng = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabelPngPath = new javax.swing.JLabel();
        jTextFieldPngPath = new javax.swing.JTextField();
        jButtonOpenPngFolder = new javax.swing.JButton();
        jButtonConvert = new javax.swing.JButton();
        jLabelPdfPath = new javax.swing.JLabel();
        jTextFieldPdfPath = new javax.swing.JTextField();
        jButtonOpenPdfFolder = new javax.swing.JButton();
        jLabelPages = new javax.swing.JLabel();
        jLabelDone = new javax.swing.JLabel();
        jScrollPanePages = new javax.swing.JScrollPane();
        jListPages = new javax.swing.JList<>();

        jFileChooserPdf.setCurrentDirectory(new File(System.getProperty("user.home") + File.separator + "Downloads"));
        jFileChooserPdf.setDialogTitle("");
        jFileChooserPdf.setFileFilter(new OnlyPdfFiles());

        jFileChooserPng.setCurrentDirectory(new File(System.getProperty("user.home") + File.separator + "Desktop"));
        jFileChooserPng.setFileFilter(new OnlyDirectories());
        jFileChooserPng.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPngPath.setText("Destino PNG");
        jLabelPngPath.setToolTipText("");

        jTextFieldPngPath.setToolTipText("Indique diretório onde será gerado .png");
        jTextFieldPngPath.setEnabled(false);

        jButtonOpenPngFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-icon.png"))); // NOI18N
        jButtonOpenPngFolder.setToolTipText("Selecione diretório desejado");
        jButtonOpenPngFolder.setEnabled(false);
        jButtonOpenPngFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenPngFolderActionPerformed(evt);
            }
        });

        jButtonConvert.setText("Convert");
        jButtonConvert.setToolTipText(null);
        jButtonConvert.setEnabled(false);
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });

        jLabelPdfPath.setText("Local PDF");
        jLabelPdfPath.setToolTipText("");

        jTextFieldPdfPath.setToolTipText("Indique caminho do arquivo .pdf desejado");

        jButtonOpenPdfFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-icon.png"))); // NOI18N
        jButtonOpenPdfFolder.setToolTipText("Selecione arquivo .pdf ");
        jButtonOpenPdfFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenPdfFolderActionPerformed(evt);
            }
        });

        jLabelPages.setText("Página(s)");

        jLabelDone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDone.setToolTipText("");

        jListPages.setEnabled(false);
        jListPages.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                valueChangedList(evt);
            }
        });
        jScrollPanePages.setViewportView(jListPages);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPdfPath)
                    .addComponent(jLabelPngPath)
                    .addComponent(jLabelPages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPanePages, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPngPath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPdfPath, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOpenPngFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOpenPdfFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButtonConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonOpenPdfFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOpenPngFolder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPdfPath)
                            .addComponent(jTextFieldPdfPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPngPath)
                            .addComponent(jTextFieldPngPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePages, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPages))
                .addGap(19, 19, 19)
                .addComponent(jLabelDone, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jButtonConvert)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        //try {
//            PdfToPngConvert.generatePngFromPdf(jTextFieldPdfPath.getText(), jTextFieldPngPath.getText(), (Integer) jSpinnerPages.getValue());
//            Logger.getLogger(ConvertJFrame.class.getName()).log(Level.INFO, "File {0} successfully converted!", jTextFieldPdfPath.getText());
//            jButtonConvert.setEnabled(false);
//            jLabelDone.setText("Done!");

//            int[] selectedIndices = jListPages.getSelectedIndices();
//            int pagesRange = jSpinnerPages.getModel().get
//            String[] myArray = new String[50];
//            for (int i = 0; i < selectedIndices.length; i++) {
//               myArray[i] =  String.valueOf(jList1.getModel().getElementAt(selectedIndices[i]));
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(ConvertJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }

        jButtonConvert.setEnabled(false);

        int[] pages = jListPages.getSelectedIndices();
        
        for(int page : pages) {
            try {
                PdfToPngConvert.generatePngFromPdf(jTextFieldPdfPath.getText(), jTextFieldPngPath.getText(), ++page);
            } catch (IOException ex) {
                Logger.getLogger(ConvertJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jLabelDone.setText("Done!");
    }//GEN-LAST:event_jButtonConvertActionPerformed

    private void jButtonOpenPdfFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenPdfFolderActionPerformed
        Action details = jFileChooserPdf.getActionMap().get("viewTypeDetails");
        details.actionPerformed(null);

        //  Encontra a tabela no painel do filechooser e faz a ordenação manualmente

        JTable table = SwingUtils.getDescendantsOfType(JTable.class, jFileChooserPdf).get(0);
        table.getRowSorter().toggleSortOrder(3);    
        table.getRowSorter().toggleSortOrder(3);
        
        int returnVal = jFileChooserPdf.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooserPdf.getSelectedFile();
            jTextFieldPdfPath.setText(file.getAbsolutePath());

            try {
                int maxPages = PdfToPngConvert.getSizePdfPages(file.getAbsolutePath());
                jTextFieldPngPath.setEnabled(true);
                jButtonOpenPngFolder.setEnabled(true);
//                jSpinnerPages.setEnabled(true);
//                jSpinnerPages.setModel(new javax.swing.SpinnerNumberModel(1, 1, maxPages, 1));
            jListPages.setEnabled(true);

            List<String> pages = IntStream.range(1, ++maxPages).boxed().map(i -> i.toString()).collect(Collectors.toList());

            DefaultListModel<String> listModel = new DefaultListModel<>();
            pages.forEach(page -> {
                listModel.addElement(page);
            });
            
            jListPages.setModel(listModel);
            
            } catch (IOException ex) {
                Logger.getLogger(ConvertJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButtonOpenPdfFolderActionPerformed

    private void jButtonOpenPngFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenPngFolderActionPerformed
        int returnVal = jFileChooserPng.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooserPng.getSelectedFile();
            jTextFieldPngPath.setText(file.getAbsolutePath());

            if(jListPages.getSelectedIndices().length != 0 && (jTextFieldPngPath.getText() != null && !jTextFieldPngPath.getText().equals(""))) {
                jButtonConvert.setEnabled(true);
            
            } else {
                jButtonConvert.setEnabled(false);
            }
            
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButtonOpenPngFolderActionPerformed

    private void valueChangedList(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_valueChangedList
        if(jListPages.getSelectedIndices().length != 0 && (jTextFieldPngPath.getText() != null && !jTextFieldPngPath.getText().equals(""))) {
            jButtonConvert.setEnabled(true);
            
        } else {
            jButtonConvert.setEnabled(false);
        }
    }//GEN-LAST:event_valueChangedList

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JButton jButtonOpenPdfFolder;
    private javax.swing.JButton jButtonOpenPngFolder;
    private javax.swing.JFileChooser jFileChooserPdf;
    private javax.swing.JFileChooser jFileChooserPng;
    private javax.swing.JLabel jLabelDone;
    private javax.swing.JLabel jLabelPages;
    private javax.swing.JLabel jLabelPdfPath;
    private javax.swing.JLabel jLabelPngPath;
    private javax.swing.JList<String> jListPages;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanePages;
    private javax.swing.JTextField jTextFieldPdfPath;
    private javax.swing.JTextField jTextFieldPngPath;
    // End of variables declaration//GEN-END:variables
}
