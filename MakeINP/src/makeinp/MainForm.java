/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeinp;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
/**
 *
 * @author dipstick
 */
public class MainForm extends javax.swing.JFrame {

  
    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        FileIn = new javax.swing.JFileChooser();
        btnGetUnvFile = new javax.swing.JButton();
        txtUnvFile = new javax.swing.JTextField();
        btnOpenUnv = new javax.swing.JButton();
        btnGetInpFile = new javax.swing.JButton();
        txtInpFile = new javax.swing.JTextField();
        btnOpenInp = new javax.swing.JButton();
        C2nBeam = new javax.swing.JRadioButton();
        C3nBeam = new javax.swing.JRadioButton();
        C3nTria = new javax.swing.JRadioButton();
        C6nTria = new javax.swing.JRadioButton();
        C4nQuad = new javax.swing.JRadioButton();
        C8nQuad = new javax.swing.JRadioButton();
        C15nWedge = new javax.swing.JRadioButton();
        C20nBrick = new javax.swing.JRadioButton();
        C8nBrick = new javax.swing.JRadioButton();
        C6nWedge = new javax.swing.JRadioButton();
        C10nTet = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        btnGO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Make Calculix inp File from UNV");
        setLocation(new java.awt.Point(100, 60));

        btnGetUnvFile.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnGetUnvFile.setText("Browse for UNV File");
        btnGetUnvFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetUnvFileActionPerformed(evt);
            }
        });

        txtUnvFile.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtUnvFile.setText("mesh.unv");

        btnOpenUnv.setText("Open");
        btnOpenUnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenUnvActionPerformed(evt);
            }
        });

        btnGetInpFile.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnGetInpFile.setText("Browse for inp File");
        btnGetInpFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetInpFileActionPerformed(evt);
            }
        });

        txtInpFile.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtInpFile.setText("model.inp");

        btnOpenInp.setText("Open");
        btnOpenInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenInpActionPerformed(evt);
            }
        });

        C2nBeam.setSelected(true);
        C2nBeam.setText("Convert 2 Node Beam");

        C3nBeam.setSelected(true);
        C3nBeam.setText("Convert 3 Node Beam");

        C3nTria.setSelected(true);
        C3nTria.setText("Convert 3 Node Tria");

        C6nTria.setSelected(true);
        C6nTria.setText("Convert 6 Node Tria");

        C4nQuad.setSelected(true);
        C4nQuad.setText("Convert 4 Node Quad");

        C8nQuad.setSelected(true);
        C8nQuad.setText("Convert 8 Node Quad");

        C15nWedge.setSelected(true);
        C15nWedge.setText("Convert 15 Node Wedge");

        C20nBrick.setSelected(true);
        C20nBrick.setText("Convert 20 Node Brick");

        C8nBrick.setSelected(true);
        C8nBrick.setText("Convert 8 Node Brick");

        C6nWedge.setSelected(true);
        C6nWedge.setText("Convert 6 Node Wedge");

        C10nTet.setSelected(true);
        C10nTet.setText("Convert 10 Node Tet");

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        btnGO.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btnGO.setText("Go");
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2nBeam)
                            .addComponent(C3nTria)
                            .addComponent(C3nBeam)
                            .addComponent(C10nTet)
                            .addComponent(C6nWedge)
                            .addComponent(C8nBrick)
                            .addComponent(C8nQuad)
                            .addComponent(C4nQuad)
                            .addComponent(C6nTria)
                            .addComponent(C15nWedge)
                            .addComponent(C20nBrick))
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGetUnvFile, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpenUnv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGetInpFile, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpenInp))
                            .addComponent(txtInpFile)
                            .addComponent(txtUnvFile, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGO)
                        .addGap(179, 179, 179))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetUnvFile)
                    .addComponent(btnOpenUnv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnvFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGO))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetInpFile)
                    .addComponent(btnOpenInp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInpFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C2nBeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3nBeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3nTria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6nTria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4nQuad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C8nQuad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6nWedge)
                        .addGap(4, 4, 4)
                        .addComponent(C15nWedge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C8nBrick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C20nBrick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C10nTet))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetUnvFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetUnvFileActionPerformed
        // TODO add your handling code here:
        int returnVal = FileIn.showOpenDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {

            }
        
        java.io.File file = FileIn.getSelectedFile( );
        String UnvName = file.toString();
        txtUnvFile.setText(UnvName);
    }//GEN-LAST:event_btnGetUnvFileActionPerformed

    private void btnOpenUnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenUnvActionPerformed
        // TODO add your handling code here:
        String UnvName = txtUnvFile.getText();
        File ofile = new File(UnvName);
            try{ 
            Desktop desktop = Desktop.getDesktop();
             desktop.open(ofile);
            }
            catch (IOException e) {
                System.out.println( e.getMessage() );
            }
    }//GEN-LAST:event_btnOpenUnvActionPerformed

    private void btnGetInpFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetInpFileActionPerformed
        // TODO add your handling code here:
        int returnVal = FileIn.showOpenDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {

            }
        
        java.io.File file = FileIn.getSelectedFile( );
        String InpName = file.toString();
        txtInpFile.setText(InpName);
    }//GEN-LAST:event_btnGetInpFileActionPerformed

    private void btnOpenInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenInpActionPerformed
        // TODO add your handling code here:
        String InpName = txtInpFile.getText();
        File ofile = new File(InpName);
            try{
                FileWriter write = new FileWriter( InpName , true);
            Desktop desktop = Desktop.getDesktop();
             desktop.open(ofile);
            }
            catch (IOException e) {
                System.out.println( e.getMessage() );
            }
    }//GEN-LAST:event_btnOpenInpActionPerformed

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGOActionPerformed
        // TODO add your handling code here:
        boolean[] Getbtn = new boolean[21];
        String f1,f2;
        String dheader="    -1", test, c=",", yn;
        String nheader="  2411";
        String eheader="  2412";
        String iset=" ";
        f1=txtUnvFile.getText();
        f2=txtInpFile.getText();
        
                TxtArea.append("Begin Reading UNV\n");
                TxtArea.update(TxtArea.getGraphics());
       Getbtn[1] = false;
       if (C10nTet.isSelected()) {Getbtn[1] = true;}
       Getbtn[2] = false;
       if (C15nWedge.isSelected()) {Getbtn[2] = true;}
       Getbtn[3] = false;
       if (C20nBrick.isSelected()) {Getbtn[3] = true;}
       Getbtn[4] = false;
       if (C2nBeam.isSelected()) {Getbtn[4] = true;}
       Getbtn[5] = false;
       if (C3nBeam.isSelected()) {Getbtn[5] = true;}
       Getbtn[6] = false;
       if (C3nTria.isSelected()) {Getbtn[6] = true;}
       Getbtn[7] = false;
       if (C4nQuad.isSelected()) {Getbtn[7] = true;}
       Getbtn[8] = false;
       if (C6nTria.isSelected()) {Getbtn[8] = true;}
       Getbtn[9] = false;
       if (C6nWedge.isSelected()) {Getbtn[9] = true;}
       Getbtn[10] = false;
       if (C8nBrick.isSelected()) {Getbtn[10] = true;}
       Getbtn[11] = false;
       if (C8nQuad.isSelected()) {Getbtn[11] = true;}
       //System.out.println("Before:"+Getbtn[10]);
       try{
        
        FileRdnnodes file = new FileRdnnodes();
         int nnode = file.OpenFile(f1);
                  
         ReadNodeData ndata = new ReadNodeData();
         String[] aryLine = ndata.OpenNodeFile(f1, nnode);
         TxtArea.append("Number Nodes:"+nnode+"\n");
         TxtArea.update(TxtArea.getGraphics());
         
        // Write Node Data Starting with new file
        if (nnode > 1) {
        WriteNodeInp inpdata = new WriteNodeInp();
        inpdata.writeNode(f2, false, aryLine, nnode);
        TxtArea.append("Wrote Nodes\n");
        TxtArea.update(TxtArea.getGraphics());
        }
        //Append Element datasets
        
        FileRdNumElem elfile = new FileRdNumElem();
        int nelem = elfile.OpenFile2(f1);
        //System.out.println(nelem);
        TxtArea.append("Number Elements:"+nelem+"\n");
        TxtArea.update(TxtArea.getGraphics());
        
        if (nelem > 1) {
        TxtArea.append("Reading Element Data\n");
        TxtArea.update(TxtArea.getGraphics());
                
        ReadElemData edata = new ReadElemData();
        String[][] eleLine = edata.OpenElemFile(f1, nelem, Getbtn);
        TxtArea.append("Writing Element Data\n");
        TxtArea.update(TxtArea.getGraphics());
         // Write Element Data Append
        WriteElemInp inpelem = new WriteElemInp();
        inpelem.writeElem(f2, true, eleLine, nelem);
        TxtArea.append("Wrote Elements\n");
        TxtArea.update(TxtArea.getGraphics());
        }
        
        ReadGroup gdata = new ReadGroup();
        int ngroups = gdata.readgdata(f1, f2);
        if (ngroups > 1){
        TxtArea.append("Wrote Groups\n");
        TxtArea.update(TxtArea.getGraphics());
        } else{
            TxtArea.append("No Groups Found\n");
            TxtArea.update(TxtArea.getGraphics());
        }
        
        TxtArea.append("Finish\n");
        TxtArea.update(TxtArea.getGraphics());
        
        Object[] options = {"Yes",
                    "No",
                    };
        int n = JOptionPane.showOptionDialog(null,
    "Finished ,Would you Like to Exit ",
    
    "Exit Program Yes/No",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);
	//System.out.println("n:"+n);
      if (n == 0) {
           System.exit(0);
     }
      
        
    }//GEN-LAST:event_btnGOActionPerformed
      
        catch (IOException e) {
                System.out.println( e.getMessage() );
            }
    }
    
    /**
     * @param args the command line arguments
     */
   //public void Update(String text){
       //System.out.println(text);
     //  TxtArea.append("Element Type:"+text+" Found\n");
     //  TxtArea.update(TxtArea.getGraphics());
  // }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton C10nTet;
    private javax.swing.JRadioButton C15nWedge;
    private javax.swing.JRadioButton C20nBrick;
    private javax.swing.JRadioButton C2nBeam;
    private javax.swing.JRadioButton C3nBeam;
    private javax.swing.JRadioButton C3nTria;
    private javax.swing.JRadioButton C4nQuad;
    private javax.swing.JRadioButton C6nTria;
    private javax.swing.JRadioButton C6nWedge;
    private javax.swing.JRadioButton C8nBrick;
    private javax.swing.JRadioButton C8nQuad;
    private javax.swing.JFileChooser FileIn;
    public javax.swing.JTextArea TxtArea;
    private javax.swing.JButton btnGO;
    private javax.swing.JButton btnGetInpFile;
    private javax.swing.JButton btnGetUnvFile;
    private javax.swing.JButton btnOpenInp;
    private javax.swing.JButton btnOpenUnv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInpFile;
    private javax.swing.JTextField txtUnvFile;
    // End of variables declaration//GEN-END:variables
}
