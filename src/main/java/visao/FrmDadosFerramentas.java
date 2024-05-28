/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ferramenta;

/**
 *
 * @author almma
 */
public class FrmDadosFerramentas extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;

    /**
     * Creates new form FrmdadosFerramentas
     */
    public FrmDadosFerramentas() {
        initComponents();
        this.objetoFerramenta = new Ferramenta();
        this.imprimirTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaFerramentas = new javax.swing.JTable();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JTFNome = new javax.swing.JTextField();
        JTFMarca = new javax.swing.JTextField();
        JTFCusto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        jTotalFerramentasTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTotalGastoTitulo = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabelaFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Marca", "Custo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaFerramentas);

        JBAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBAlterar.setText("alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBApagar.setText("apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });

        JTFCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCustoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Marca");

        jLabel3.setText("Custo");

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCancelar.setText("cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jTotalFerramentasTitulo.setText("Total de ferramentas:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("RELATÓRIO FERRAMENTAS");

        jTotalGastoTitulo.setText("Total gasto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotalGastoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTFCusto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(231, 231, 231))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTotalFerramentasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTotalFerramentasTitulo)
                .addGap(2, 2, 2)
                .addComponent(jTotalGastoTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCustoActionPerformed

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    private void jTabelaFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaFerramentasMouseClicked
        // TODO add your handling code here:

        if (this.jTabelaFerramentas.getSelectedRow() != -1) {
            String nome = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 1).toString();
            String marca = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 2).toString();
            String custo = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 3).toString();

            this.JTFNome.setText(nome);
            this.JTFMarca.setText(marca);
            this.JTFCusto.setText(custo);

        }
    }//GEN-LAST:event_jTabelaFerramentasMouseClicked

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:

        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.jTabelaFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione uma ferramenta para apagar");
            } else {
                id = Integer.parseInt(this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esta ferramenta?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoFerramenta.deleteFerramentaDb(id)) {
                    // limpa os campos
                    this.clearFields();
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta excluída com Sucesso!");
                }
            }

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            this.imprimirTabela();

        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");

            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagem("A marca deve conter ao menos 2 caracteres.");

            } else {

                marca = this.JTFMarca.getText();
            }

            if (this.JTFCusto.getText().length() <= 0) {
                throw new Mensagem("Custo deve ser número e maior que zero.");

            } else {
                custo = Double.parseDouble(this.JTFCusto.getText());
            }

            if (this.jTabelaFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma ferramenta para alterar");

            } else {
                id = Integer.parseInt(this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objetoFerramenta.updateFerramentaBd(id, nome, marca, custo)) {
                // limpa os campos
                this.clearFields();
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterado com Sucesso!");

            }
            //Exibe no console a ferramenta cadastrado
            System.out.println(this.objetoFerramenta.getListaFerramentas().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            // atualiza a tabela.
            this.imprimirTabela();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void imprimirGastoTotal(int totalGasto) {

        NumberFormat formatadorReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String reais = formatadorReal.format(totalGasto);
        jTotalGastoTitulo.setText("Total gasto: " + reais);
    }

    public void clearFields() {
        this.JTFNome.setText("");
        this.JTFMarca.setText("");
        this.JTFCusto.setText("");
    }

    public void imprimirTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTabelaFerramentas.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
        //Carrega a lista de objetos aluno
        ArrayList<Ferramenta> minhalista = this.objetoFerramenta.getListaFerramentas();
        jTotalFerramentasTitulo.setText(minhalista.size() + " ferramentas");
        int totalGasto = 0;
        for (Ferramenta a : minhalista) {
            totalGasto += a.getCusto();
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getCusto(),});
        }

        this.imprimirGastoTotal(totalGasto);
    }

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
            java.util.logging.Logger.getLogger(FrmDadosFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDadosFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDadosFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDadosFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDadosFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaFerramentas;
    private javax.swing.JLabel jTotalFerramentasTitulo;
    private javax.swing.JLabel jTotalGastoTitulo;
    // End of variables declaration//GEN-END:variables

}
