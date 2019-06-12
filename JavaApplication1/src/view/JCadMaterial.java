
package view;

import DAO.MaterialDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Material;
/**
 *
 * @author redst
 */
public class JCadMaterial extends javax.swing.JFrame {

    /**
     * Creates new form JCadMaterial
     */
    public JCadMaterial() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTabMateriais.getModel();
        jTabMateriais.setRowSorter(new TableRowSorter(modelo));
        readjTabMateriais();

    }

    public void readjTabMateriais() {

        DefaultTableModel modelo = (DefaultTableModel) jTabMateriais.getModel();
        MaterialDAO cdao = new MaterialDAO();
        modelo.setNumRows(0);

        for (Material m : cdao.read()) {
            modelo.addRow(new Object[]{
                m.getId(),
                m.getNome(),
                m.getKcritico(),
                m.getC(),
                m.getN(),
                m.getEspessura()

            });

        }

    }

    public void readJTableParaNome(String NomePesquisaCliente) {

        DefaultTableModel modelo = (DefaultTableModel) jTabMateriais.getModel();
        MaterialDAO cdao = new MaterialDAO();
        modelo.setNumRows(0);

        for (Material m : cdao.readParaClientes(NomePesquisaCliente)) {
            modelo.addRow(new Object[]{
                m.getId(),
                m.getNome(),
                m.getKcritico(),
                m.getC(),
                m.getN(),
                m.getEspessura()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLMaterial = new javax.swing.JLabel();
        txtNomeMaterial = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        jLNM = new javax.swing.JLabel();
        jLMM = new javax.swing.JLabel();
        txtEspessura = new javax.swing.JTextField();
        txtKcritico = new javax.swing.JTextField();
        jLKc = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabMateriais = new javax.swing.JTable();
        jLN = new javax.swing.JLabel();
        jLC = new javax.swing.JLabel();
        jL32 = new javax.swing.JLabel();
        jLEspessura = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));

        jPanel1.setMaximumSize(new java.awt.Dimension(960, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 540));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(960, 540));
        jPanel2.setMinimumSize(new java.awt.Dimension(960, 540));

        jPanel3.setBackground(new java.awt.Color(94, 94, 94));
        jPanel3.setMaximumSize(new java.awt.Dimension(960, 76));
        jPanel3.setMinimumSize(new java.awt.Dimension(960, 76));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/IcVoltar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(143, 141));
        jButton3.setMinimumSize(new java.awt.Dimension(143, 141));
        jButton3.setPreferredSize(new java.awt.Dimension(143, 141));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Titulo_Materiais.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(264, 76));
        jLabel1.setMinimumSize(new java.awt.Dimension(264, 76));
        jLabel1.setPreferredSize(new java.awt.Dimension(264, 76));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLMaterial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLMaterial.setForeground(new java.awt.Color(255, 255, 255));
        jLMaterial.setText("Material:");

        txtNomeMaterial.setBackground(new java.awt.Color(188, 188, 188));
        txtNomeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMaterialActionPerformed(evt);
            }
        });

        txtC.setBackground(new java.awt.Color(188, 188, 188));
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        txtN.setBackground(new java.awt.Color(188, 188, 188));

        jLNM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNM.setForeground(new java.awt.Color(255, 255, 255));
        jLNM.setText("N/m");

        jLMM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLMM.setForeground(new java.awt.Color(255, 255, 255));
        jLMM.setText("mm");

        txtEspessura.setBackground(new java.awt.Color(188, 188, 188));
        txtEspessura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspessuraActionPerformed(evt);
            }
        });

        txtKcritico.setBackground(new java.awt.Color(188, 188, 188));
        txtKcritico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKcriticoActionPerformed(evt);
            }
        });

        jLKc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLKc.setForeground(new java.awt.Color(255, 255, 255));
        jLKc.setText("Kc:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Image/IcAtualizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Image/IcCadastrar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(141, 37));
        jButton2.setMinimumSize(new java.awt.Dimension(141, 37));
        jButton2.setPreferredSize(new java.awt.Dimension(141, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTabMateriais.setAutoCreateRowSorter(true);
        jTabMateriais.setBackground(new java.awt.Color(204, 204, 204));
        jTabMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Expessura", "C", "N", "Kc"
            }
        ));
        jTabMateriais.setGridColor(new java.awt.Color(0, 0, 0));
        jTabMateriais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabMateriaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabMateriais);

        jLN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLN.setForeground(new java.awt.Color(255, 255, 255));
        jLN.setText("n:");

        jLC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLC.setForeground(new java.awt.Color(255, 255, 255));
        jLC.setText("c:");

        jL32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jL32.setForeground(new java.awt.Color(240, 240, 240));
        jL32.setText("3/2");

        jLEspessura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLEspessura.setForeground(new java.awt.Color(255, 255, 255));
        jLEspessura.setText("Espessura:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLEspessura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMM)
                .addGap(365, 365, 365))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLKc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKcritico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL32)
                .addGap(59, 59, 59)
                .addComponent(jLC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLMaterial))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLEspessura)
                                    .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLMM))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jL32)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNM)
                                .addComponent(jLC)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLN)
                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKcritico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLKc)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jTabMateriais.getSelectedRow() != -1){

            //if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
                //    JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
                //} else {

                Material m = new Material();
                MaterialDAO dao = new MaterialDAO();

                m.setNome(txtNomeMaterial.getText());
                m.setKcritico(Float.parseFloat(txtKcritico.getText()));
                m.setC(Float.parseFloat(txtC.getText()));
                m.setN (Float.parseFloat(txtN.getText()));
                m.setEspessura(Float.parseFloat(txtEspessura.getText()));

                dao.create(m);

                txtNomeMaterial.setText("");
                txtKcritico.setText("");
                txtC.setText("");
                txtN.setText("");
                txtEspessura.setText("");
                readjTabMateriais();
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Material m = new Material();
        MaterialDAO dao = new MaterialDAO();

        if(txtNomeMaterial.getText().equals("")|| txtEspessura.getText().equals("")||
            txtKcritico.getText().equals("")||txtC.getText().equals("")
            ||txtN.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "É obrigatório preecher todos os campos.");
        }
        else
        {
            m.setNome(txtNomeMaterial.getText());
            m.setKcritico(Float.parseFloat(txtKcritico.getText()));
            m.setC(Float.parseFloat(txtC.getText()));
            m.setN (Float.parseFloat(txtN.getText()));
            m.setEspessura(Float.parseFloat(txtEspessura.getText()));

            dao.create(m);

            txtNomeMaterial.setText("");
            txtKcritico.setText("");
            txtC.setText("");
            txtN.setText("");
            txtEspessura.setText("");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEspessuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspessuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspessuraActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtNomeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMaterialActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JMenu obj = new JMenu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JMenu obj = new JMenu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void txtKcriticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKcriticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKcriticoActionPerformed

    private void jTabMateriaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMateriaisMouseClicked
         if (jTabMateriais.getSelectedRow() != -1) {
            txtNomeMaterial.setText(jTabMateriais.getValueAt(jTabMateriais.getSelectedRow(), 1).toString());
            txtEspessura.setText(jTabMateriais.getValueAt(jTabMateriais.getSelectedRow(), 2).toString());
            txtN.setText(jTabMateriais.getValueAt(jTabMateriais.getSelectedRow(), 3).toString());
            txtC.setText(jTabMateriais.getValueAt(jTabMateriais.getSelectedRow(), 4).toString());
            txtKcritico.setText(jTabMateriais.getValueAt(jTabMateriais.getSelectedRow(), 5).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
    }//GEN-LAST:event_jTabMateriaisMouseClicked

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
            java.util.logging.Logger.getLogger(JCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jL32;
    private javax.swing.JLabel jLC;
    private javax.swing.JLabel jLEspessura;
    private javax.swing.JLabel jLKc;
    private javax.swing.JLabel jLMM;
    private javax.swing.JLabel jLMaterial;
    private javax.swing.JLabel jLN;
    private javax.swing.JLabel jLNM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabMateriais;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtEspessura;
    private javax.swing.JTextField txtKcritico;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNomeMaterial;
    // End of variables declaration//GEN-END:variables
}
