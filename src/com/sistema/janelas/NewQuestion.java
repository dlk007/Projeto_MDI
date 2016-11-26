package com.sistema.janelas;

import com.sistema.bd.QuestionDAO;
import com.sistema.bean.Question;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

// falta conectar com o banco e caregar o banco dentro das questoes
/**
 * @author Danrlei
 */
public class NewQuestion extends javax.swing.JInternalFrame {

    private String Resposta = new String();
    private Integer cod = new Integer(0);
    private Question Q = new Question();
    private QuestionDAO QD = new QuestionDAO();

    /**
     * Creates new form NewQuestion
     */
    public NewQuestion() {
        super("Escolha a alternativa equivalemente a palavra em inglês");
        initComponents();
        readQuestion();
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
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        enunciado.setEditable(false);
        enunciado.setColumns(20);
        enunciado.setRows(5);
        enunciado.setPreferredSize(new java.awt.Dimension(300, 80));
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
        pular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pularActionPerformed(evt);
            }
        });

        A.setText("a) "+ Q.getA());
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setText("b) " + Q.getB());
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setText("c) "+Q.getC());
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setText("d) "+Q.getD());
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pular))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A, B, C, D, jButton1, pular});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pular)
                    .addComponent(jButton1))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A, B, C, D, jButton1, pular});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pularActionPerformed
        pularQuestion();
    }//GEN-LAST:event_pularActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        if (("a").equals(Resposta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        pularQuestion();
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        if (("b").equals(Resposta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        pularQuestion();
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        if (("c").equals(Resposta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        pularQuestion();
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        if (("d").equals(Resposta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada.");
        }
        pularQuestion();
    }//GEN-LAST:event_DActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja sair do sistema?", null, YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            cod = 0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pularQuestion() {
        cod = cod + 1;
        Question q = QD.getQuestion(cod);
        if (q == null) {
            JOptionPane.showMessageDialog(this, "Questão não encontrada!");
            limpar();
        } else {
            setQuestions(q);
        }
    }

    private void readQuestion() {
        if (cod != null) {
            Question q = QD.getQuestion(cod);
            if (q == null) {
                JOptionPane.showMessageDialog(this, "Questão não encontrada!");
                limpar();
            } else {
                setQuestions(q);
            }
        }
    }

    private void limpar() {
        Q = null;
        enunciado.setText("");
        A.setText("a)");
        B.setText("b)");
        C.setText("c)");
        D.setText("d)");
    }

    public Question setQuestions(Question q) {
        enunciado.setText(q.getEnunciado());
        A.setText(q.getA());
        B.setText(q.getB());
        C.setText(q.getC());
        D.setText(q.getD());
        Resposta = (q.getResp().toLowerCase());
        return q;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pular;
    // End of variables declaration//GEN-END:variables
}
