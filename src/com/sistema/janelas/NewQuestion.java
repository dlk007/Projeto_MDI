package com.sistema.janelas;

import com.sistema.bd.QuestionDAO;
import com.sistema.bean.Question;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

// falta conectar com o banco e caregar o bando dentro das questoes

/**
 * @author Danrlei
 */
public class NewQuestion extends javax.swing.JInternalFrame {

    private Question Q = new Question();
    private QuestionDAO QD = new QuestionDAO();

    /**
     * Creates new form NewQuestion
     */
    public NewQuestion() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enunciado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pular = new javax.swing.JButton();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        C = new javax.swing.JLabel();

        setClosable(true);

        enunciado.setColumns(20);
        enunciado.setRows(5);
        /*File arquivo = new File("Questions.txt");
        try (FileReader fr = new FileReader(arquivo)) {
            BufferedReader br = new BufferedReader(fr);
            String content;
            content = br.readLine();
            enunciado.setText(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/

        enunciado.setText(Q.getEnunciado());
        jScrollPane1.setViewportView(enunciado);

        jLabel1.setText("Alternativas:");

        pular.setText("Pular");

        A.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A.setText("A) "+ Q.getA());
        A.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AFocusGained(evt);
            }
        });

        B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B.setText("B) "+ Q.getB());
        B.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BFocusGained(evt);
            }
        });

        D.setText("D) "+ Q.getD());
        D.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DFocusGained(evt);
            }
        });

        C.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C.setText("C) "+Q.getC());
        C.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(pular)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(pular)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AFocusGained
        if (("a").equals(Q.getResp().toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        limpar();
    }//GEN-LAST:event_AFocusGained

    private void BFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFocusGained
        if (("b").equals(Q.getResp().toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        limpar();
    }//GEN-LAST:event_BFocusGained

    private void CFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CFocusGained
        if (("c").equals(Q.getResp().toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        limpar();
    }//GEN-LAST:event_CFocusGained

    private void DFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DFocusGained
        if (("d").equals(Q.getResp().toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        limpar();
    }//GEN-LAST:event_DFocusGained

    private void limpar() {
        Q = null;
        enunciado.setText("");
        A.setText("a)");
        B.setText("b)");
        C.setText("c)");
        D.setText("d)");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pular;
    // End of variables declaration//GEN-END:variables
}
