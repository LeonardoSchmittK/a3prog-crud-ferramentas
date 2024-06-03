package visao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Amigo;
import model.Emprestimo;
import model.Ferramenta;

public class FrmNovoEmprestimoFrame extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;
    private Amigo objetoAmigo;
    private Emprestimo objetoEmprestimo;

    private String dateEmprestimoFinal;
    private String dateEmprestimoInicial;
    private boolean temAmigo;
    private boolean temFerramenta;
    private String nomeEscolhido;
    private String ferramentaEscolhida;
    public ArrayList<Ferramenta> FerramentaLista = new ArrayList<>();
    public ArrayList<Amigo> AmigoLista = new ArrayList<>();

    public FrmNovoEmprestimoFrame() {
        initComponents();
        this.setTemAmigo(false);
        this.setTemFerramenta(false);
        this.objetoEmprestimo = new Emprestimo();
        this.objetoFerramenta = new Ferramenta();
        this.objetoAmigo = new Amigo();

        this.FerramentaLista = objetoFerramenta.getListaFerramentas();
        this.AmigoLista = objetoAmigo.getListaAmigo();

        this.imprimirFerramentas();
        this.imprimirAmigos();
        this.imprimirValidadeEmprestimo(15);
        this.imprimirEmprestimoCoibido();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jPanelPainelEmprestimo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSelecionarFerramenta = new javax.swing.JComboBox<>();
        jComboBoxSelecionarAmigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jQuantidadeDiasEmprestimo = new javax.swing.JTextField();
        jPanelPainelBotoesEmprestimo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelValidadeEmprestimo = new javax.swing.JLabel();
        jLabelAlertaEmprestimoCoibido = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NOVO EMPRÉSTIMO");

        jLabel3.setText("para o amigo");

        jComboBoxSelecionarFerramenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxSelecionarFerramenta.setToolTipText("escolha a ferramenta a ser emprestada");
        jComboBoxSelecionarFerramenta.setAutoscrolls(true);
        jComboBoxSelecionarFerramenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSelecionarFerramentaFocusGained(evt);
            }
        });
        jComboBoxSelecionarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarFerramentaActionPerformed(evt);
            }
        });

        jComboBoxSelecionarAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxSelecionarAmigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSelecionarAmigoFocusGained(evt);
            }
        });

        jLabel2.setText("Emprestar");

        jLabel4.setText("por");

        jLabel5.setText("dias");

        jQuantidadeDiasEmprestimo.setText("15");
        jQuantidadeDiasEmprestimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jQuantidadeDiasEmprestimoFocusLost(evt);
            }
        });
        jQuantidadeDiasEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuantidadeDiasEmprestimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuantidadeDiasEmprestimoMouseExited(evt);
            }
        });
        jQuantidadeDiasEmprestimo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jQuantidadeDiasEmprestimoInputMethodTextChanged(evt);
            }
        });
        jQuantidadeDiasEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantidadeDiasEmprestimoActionPerformed(evt);
            }
        });
        jQuantidadeDiasEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jQuantidadeDiasEmprestimoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jQuantidadeDiasEmprestimoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelPainelEmprestimoLayout = new javax.swing.GroupLayout(jPanelPainelEmprestimo);
        jPanelPainelEmprestimo.setLayout(jPanelPainelEmprestimoLayout);
        jPanelPainelEmprestimoLayout.setHorizontalGroup(
            jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSelecionarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSelecionarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jQuantidadeDiasEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelPainelEmprestimoLayout.setVerticalGroup(
            jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelEmprestimoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxSelecionarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelecionarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jQuantidadeDiasEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar empréstimo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelValidadeEmprestimo.setText(" O empréstimo tem validade padrão de 15 dias ");

        javax.swing.GroupLayout jPanelPainelBotoesEmprestimoLayout = new javax.swing.GroupLayout(jPanelPainelBotoesEmprestimo);
        jPanelPainelBotoesEmprestimo.setLayout(jPanelPainelBotoesEmprestimoLayout);
        jPanelPainelBotoesEmprestimoLayout.setHorizontalGroup(
            jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelBotoesEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValidadeEmprestimo)
                    .addGroup(jPanelPainelBotoesEmprestimoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanelPainelBotoesEmprestimoLayout.setVerticalGroup(
            jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelBotoesEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelValidadeEmprestimo)
                .addGap(18, 18, 18)
                .addGroup(jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabelAlertaEmprestimoCoibido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAlertaEmprestimoCoibido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAlertaEmprestimoCoibidoMouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Lista de Emprestimos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlertaEmprestimoCoibido)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelPainelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelPainelBotoesEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlertaEmprestimoCoibido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPainelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanelPainelBotoesEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelecionarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarFerramentaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBoxSelecionarFerramentaActionPerformed

    private void jComboBoxSelecionarFerramentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarFerramentaFocusGained

    }//GEN-LAST:event_jComboBoxSelecionarFerramentaFocusGained

    private void jComboBoxSelecionarAmigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarAmigoFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBoxSelecionarAmigoFocusGained


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabelAlertaEmprestimoCoibidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlertaEmprestimoCoibidoMouseClicked
        // TODO add your handling code here:]
        this.dispose();
    }//GEN-LAST:event_jLabelAlertaEmprestimoCoibidoMouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // cadastrar emprestimo

        if (jComboBoxSelecionarFerramenta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma ferramenta!");
        } else {
            if (jComboBoxSelecionarAmigo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um amigo!");

            } else {

                int idxEscolhidoFerramenta = jComboBoxSelecionarFerramenta.getSelectedIndex();
                int idxEscolhidoAmigo = jComboBoxSelecionarAmigo.getSelectedIndex();

                Ferramenta ferramentaEscolhida = this.FerramentaLista.get(idxEscolhidoFerramenta - 1);
                Amigo amigoEscolhido = this.AmigoLista.get(idxEscolhidoAmigo - 1);

                int idFerramenta = ferramentaEscolhida.getId();
                String nomeFerramenta = ferramentaEscolhida.getNome();
                int idAmigo = amigoEscolhido.getId();
                String nomeAmigo = amigoEscolhido.getNome();

                if (this.objetoEmprestimo.estaAmigoDevendo(idAmigo)) {
                    JOptionPane.showMessageDialog(rootPane, nomeAmigo + " tem empréstimos não devolvidos!");
                }

                String dataFinal = this.getDateEmprestimoFinal();
                LocalDate dataInicial = LocalDate.now();
               
                if (this.objetoEmprestimo.insertEmprestimoDb(idFerramenta, nomeFerramenta, idAmigo, nomeAmigo, LocalDate.now(), LocalDate.now())) {
                    JOptionPane.showMessageDialog(rootPane, "Emprestimo cadastrado com sucesso!");
                    // limpa campos da interface
                    jComboBoxSelecionarFerramenta.setSelectedIndex(0);
                    jComboBoxSelecionarAmigo.setSelectedIndex(0);
                    jQuantidadeDiasEmprestimo.setText("15");
                    this.imprimirValidadeEmprestimo(15);

                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jQuantidadeDiasEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jQuantidadeDiasEmprestimoActionPerformed

    private void jQuantidadeDiasEmprestimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoKeyTyped

    }//GEN-LAST:event_jQuantidadeDiasEmprestimoKeyTyped

    private void jQuantidadeDiasEmprestimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoKeyPressed


    }//GEN-LAST:event_jQuantidadeDiasEmprestimoKeyPressed

    private void jQuantidadeDiasEmprestimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoFocusLost


    }//GEN-LAST:event_jQuantidadeDiasEmprestimoFocusLost

    private void jQuantidadeDiasEmprestimoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoInputMethodTextChanged


    }//GEN-LAST:event_jQuantidadeDiasEmprestimoInputMethodTextChanged

    private void jQuantidadeDiasEmprestimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoMouseExited
        jQuantidadeDiasEmprestimo.setFocusable(false);

        try {
            int labelDate = Integer.parseInt(jQuantidadeDiasEmprestimo.getText());
            this.imprimirValidadeEmprestimo(labelDate);

        } catch (NumberFormatException exception) {
            JOptionPane.showConfirmDialog(rootPane, "Digite um número");
            jQuantidadeDiasEmprestimo.setText("15");
        }


    }//GEN-LAST:event_jQuantidadeDiasEmprestimoMouseExited

    private void jQuantidadeDiasEmprestimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuantidadeDiasEmprestimoMouseEntered
        // TODO add your handling code here:
        jQuantidadeDiasEmprestimo.setFocusable(true);
    }//GEN-LAST:event_jQuantidadeDiasEmprestimoMouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void imprimirEmprestimoCoibido() {
        if (!this.isTemAmigo() || !this.isTemFerramenta()) {
            this.remove(jPanelPainelEmprestimo);
            this.remove(jPanelPainelBotoesEmprestimo);
            jLabelAlertaEmprestimoCoibido.setText("Adicione ao menos 1 ferramenta e 1 amigo! (clique aqui para voltar)");
        }
    }

    public void imprimirAmigos() {
        ArrayList<Amigo> minhalista = this.objetoAmigo.getListaAmigo();

        if (minhalista.size() > 0) {
            this.setTemAmigo(true);
        }

        for (Amigo amigo : minhalista) {

            jComboBoxSelecionarAmigo.addItem(amigo.getNome());

        }

    }

    public void imprimirFerramentas() {
        ArrayList<Ferramenta> minhalista = this.objetoFerramenta.getListaFerramentas();
        if (minhalista.size() > 0) {
            this.setTemFerramenta(true);
        }
        for (Ferramenta ferramenta : minhalista) {

            jComboBoxSelecionarFerramenta.addItem(ferramenta.getNome());
        }

    }

    public void imprimirValidadeEmprestimo(int dias) {
        int quantidadeDiasEmprestimo = dias;
        LocalDate date = LocalDate.now();
        LocalDate dateEmprestimo = LocalDate.now().plusDays(quantidadeDiasEmprestimo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String[] daysOfWeekPTBR = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
        String formattedDateEmprestimo = daysOfWeekPTBR[dateEmprestimo.getDayOfWeek().getValue()] + ", " + dateEmprestimo.format(formatter);
        String dateEmprestimoFinal = dateEmprestimo.format(formatter);
        this.setDateEmprestimoFinal(dateEmprestimoFinal);
        this.setDateEmprestimoInicial(date.format(formatter));

        jLabelValidadeEmprestimo.setText(
                "O empréstimo terá validade até " + formattedDateEmprestimo);
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
            java.util.logging.Logger.getLogger(FrmNovoEmprestimoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNovoEmprestimoFrame().setVisible(true);
            }
        });
    }

    public boolean isTemAmigo() {
        return temAmigo;
    }

    public void setTemAmigo(boolean temAmigo) {
        this.temAmigo = temAmigo;
    }

    public boolean isTemFerramenta() {
        return temFerramenta;
    }

    public void setTemFerramenta(boolean temFerramenta) {
        this.temFerramenta = temFerramenta;
    }

    public String getNomeEscolhido() {
        return nomeEscolhido;
    }

    public void setNomeEscolhido(String nomeEscolhido) {
        this.nomeEscolhido = nomeEscolhido;
    }

    public String getFerramentaEscolhida() {
        return ferramentaEscolhida;
    }

    public void setFerramentaEscolhida(String ferramentaEscolhida) {
        this.ferramentaEscolhida = ferramentaEscolhida;
    }

    public String getDateEmprestimoFinal() {
        return dateEmprestimoFinal;
    }

    public void setDateEmprestimoFinal(String dateEmprestimoFinal) {
        this.dateEmprestimoFinal = dateEmprestimoFinal;
    }

    public String getDateEmprestimoInicial() {
        return dateEmprestimoInicial;
    }

    public void setDateEmprestimoInicial(String dateEmprestimoInicial) {
        this.dateEmprestimoInicial = dateEmprestimoInicial;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxSelecionarAmigo;
    private javax.swing.JComboBox<String> jComboBoxSelecionarFerramenta;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAlertaEmprestimoCoibido;
    private javax.swing.JLabel jLabelValidadeEmprestimo;
    private javax.swing.JPanel jPanelPainelBotoesEmprestimo;
    private javax.swing.JPanel jPanelPainelEmprestimo;
    private javax.swing.JTextField jQuantidadeDiasEmprestimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}