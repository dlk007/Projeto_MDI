/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.listener;

import com.sistema.bd.QuestionDAO;
import com.sistema.bean.Question;
import com.sistema.janelas.CadQuestion;
import excecoes.Excecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 * @author Danrlei
 */
public class QuestionAL implements ActionListener {

    private final CadQuestion frame;
    private QuestionDAO dao = new QuestionDAO();
    private Question q = new Question();

    public QuestionAL(CadQuestion frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String gac = e.getActionCommand();

        if ("cadastrar".equals(gac)) {
            try {
                q = frame.getQuestion();
                try {
                    dao.insert(q);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    return;
                }
            } catch (Excecoes ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            frame.dispose();
        }

        if ("cancelar".equals(gac)) {
            int resposta = JOptionPane.showConfirmDialog(null, "Você deseja cancelar esta operação?", null, YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                frame.dispose();
            }
        }
    }
}
