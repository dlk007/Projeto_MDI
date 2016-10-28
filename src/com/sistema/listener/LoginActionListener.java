package com.sistema.listener;

import com.sistema.janelas.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LoginActionListener implements ActionListener {

    private Login frame;

    public LoginActionListener(Login frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("entrar".equals(e.getActionCommand())) {
            //salvar

            File arquivo = new File("usuario.txt");
            try (FileWriter fw = new FileWriter(arquivo)) {
                fw.write(frame.getTextoTextField().getText());
                fw.flush();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if ("cancelar".equals(e.getActionCommand())) {
            
            frame.dispose();
        }
    }

}
