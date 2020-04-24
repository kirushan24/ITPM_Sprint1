/*
 * Author: IT18088588
 * Name  : Kirushan Sivanandam
 * Group : ITPM_WE_49
 */
package CCPackage;

import function.FunctionsController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UIJframe extends javax.swing.JFrame {
    static String filepath;
    
    /**
     * Creates new form UIJframe
     */
    public UIJframe() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextResult = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lines = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnParameters = new javax.swing.JButton();
        BtnProceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        browse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        path.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("File Path:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setText("Code Complexity(CS) Measuring Tool");

        code.setColumns(20);
        code.setRows(5);
        jScrollPane1.setViewportView(code);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("File Type:");

        type.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Complexity of the code:");

        TextResult.setEditable(false);
        TextResult.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        TextResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextResultActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Number of Lines:");

        lines.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linesActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("File Name:");

        BtnParameters.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BtnParameters.setText("Change Factor");
        BtnParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParametersActionPerformed(evt);
            }
        });

        BtnProceed.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BtnProceed.setText("Proceed");
        BtnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TextResult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(path)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(BtnParameters)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(browse)
                            .addGap(31, 31, 31)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(470, 470, 470)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(89, 89, 89)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(lines, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextResult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static int lineCounter (String path) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader(path));
        int count = 0;
        String line;
        while ((line = input.readLine()) != null){
            if(!"".equals(line.trim())){
                count++;
            }
        }
        return count;
    }
    
    
    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
       
    }//GEN-LAST:event_pathActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
       JFileChooser chooser = new JFileChooser();
       File workingDirectory = new File(System.getProperty("user.dir"));
       chooser.setCurrentDirectory(workingDirectory);
       chooser.showOpenDialog(null);
       
       File f = chooser.getSelectedFile();
       filepath = f.getAbsolutePath();
       String filename = f.getName();
       path.setText(filepath);
       name.setText(filename);
       
       
       if(filepath.toLowerCase().endsWith(".java")){
                    type.setText("Java");
       }else if(filepath.toLowerCase().endsWith(".cpp")){
                    type.setText("C++");
       }
       
       try{
           FileReader reader = new FileReader(filepath);
           try (BufferedReader br = new BufferedReader(reader)) {
               code.read(br, null);
           }
           code.requestFocus();
       }
       catch(IOException e){
           JOptionPane.showMessageDialog(null, e);
       }
       try{
           int count = lineCounter(filepath);
           lines.setText(String.valueOf(count));
       }
       catch(IOException e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_browseActionPerformed

    private void TextResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextResultActionPerformed
        
    }//GEN-LAST:event_TextResultActionPerformed

    private void linesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linesActionPerformed
       
    }//GEN-LAST:event_linesActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        
    }//GEN-LAST:event_typeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void BtnParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParametersActionPerformed
        Factors ar = new Factors();
        UIJframe cc = new UIJframe();
        ar.setVisible(true);
        cc.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_BtnParametersActionPerformed

    private void BtnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProceedActionPerformed
        FunctionsController con = new FunctionsController();
        System.out.println(filepath);
        try {
            FileReader reader = new FileReader(filepath);
            int complexity = con.analyzer(reader);
            TextResult.setText(String.valueOf(complexity));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UIJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnProceedActionPerformed

   
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnParameters;
    private javax.swing.JButton BtnProceed;
    private javax.swing.JTextField TextResult;
    private javax.swing.JButton browse;
    private javax.swing.JTextArea code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lines;
    private javax.swing.JTextField name;
    private javax.swing.JTextField path;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
