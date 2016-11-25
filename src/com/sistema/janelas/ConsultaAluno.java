package com.sistema.janelas;

import com.sistema.bd.AlunoDAO;
import com.sistema.bean.Aluno;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class ConsultaAluno extends JInternalFrame {

    private AlunoDAO ad = new AlunoDAO();
    private Aluno aluno = new Aluno();

    public ConsultaAluno() {
        super("Acesso ao BD de Alunos");
        initComponents();
        caregabanco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Prof = new javax.swing.JPanel();
        cnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ctelefone = new javax.swing.JTextField();
        csexo = new javax.swing.JComboBox<>();
        cendereco = new javax.swing.JTextField();
        cDataNasc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        csenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ccodigo = new javax.swing.JTextField();
        cresp = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListAluno = new javax.swing.JList<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Prof.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel4.setText("E-mail:");

        jLabel3.setText("Senha:");

        jLabel1.setText("Código:");

        jLabel9.setText("Data Nasc.:");

        csexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel5.setText("Telefone:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("Responsável:");

        jLabel8.setText("Sexo:");

        jLabel2.setText("Nome:");

        ccodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ccodigoFocusLost(evt);
            }
        });

        btnTodos.setText("Mostrar Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfLayout = new javax.swing.GroupLayout(Prof);
        Prof.setLayout(ProfLayout);
        ProfLayout.setHorizontalGroup(
            ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfLayout.createSequentialGroup()
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(csexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cemail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cresp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(ProfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addGap(10, 10, 10)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cnome, csenha});

        ProfLayout.setVerticalGroup(
            ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(cnome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(csenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(csexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(cemail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(ctelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(cendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(cresp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodos)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProfLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cnome, csenha});

        getContentPane().add(Prof, java.awt.BorderLayout.CENTER);

        ListAluno.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListAluno);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Aluno a = getAluno();
        ad.update(a);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean novo = false;
        if (aluno == null) {
            aluno = new Aluno();
            novo = true;
        }
        aluno.setCodAluno(Integer.parseInt(ccodigo.getText()));
        aluno.setNomeAluno(cnome.getText());
        String pw = Arrays.toString(csenha.getPassword());
        aluno.setSenhaAluno(pw);
        aluno.setSexo(csexo.getSelectedItem().toString());
        aluno.setDataNasc(cDataNasc.getText());
        aluno.setEmail(cemail.getText());
        aluno.setTelefone(ctelefone.getText());
        aluno.setEndereco(cendereco.getText());
        aluno.setResponsavel(cresp.getText());

        if (novo) {
            try {
                ad.insert(aluno);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),
                        "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        limpar();
        atualizarListAluno();
        caregabanco();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Aluno a = getAluno();
        ad.delete(a);
        limpar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        caregabanco();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void ccodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ccodigoFocusLost

        String codTxt = ccodigo.getText().trim();
        if (codTxt.length() > 0) {
            Integer codigo = null;
            try {
                codigo = Integer.parseInt(codTxt);
            } catch (NumberFormatException e) {
                //o código informado é inválido
                return;
            }

            Aluno A = ad.getAlunobycode(codigo);
            if (A == null) {
                JOptionPane.showMessageDialog(this, "Aluno não encontrado!");
                limpar();
            } else {
                setAluno(A);
            }
        }
    }//GEN-LAST:event_ccodigoFocusLost

    private void caregabanco() {
        List<Aluno> professorList = ad.getAll();
        final Aluno[] strings = new Aluno[professorList.size()];
        int i = 0;

        for (Aluno p : professorList) {
            strings[i++] = p;
        }
        ListAluno.removeAll();
        ListAluno.setModel(new javax.swing.AbstractListModel() {

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i].getCodAluno() + " - " + strings[i].getNomeAluno();
            }
        });
    }

    private void atualizarListAluno() {
        ListAluno.setListData(new Vector(ad.getAll()));
    }

    private void limpar() {
        cnome.setText("");
        csenha.setText("");
        cDataNasc.setText("");
        cemail.setText("");
        ctelefone.setText("");
        cendereco.setText("");
        cresp.setText("");
    }

    private void setAluno(Aluno p) {
        ccodigo.setText(String.valueOf(p.getCodAluno()));
        cnome.setText(p.getNomeAluno());
        csenha.setText(p.getSenhaAluno());
        csexo.setSelectedItem(p.getSexo());
        cDataNasc.setText(p.getDataNasc());
        cemail.setText(p.getEmail());
        ctelefone.setText(p.getTelefone());
        cendereco.setText(p.getEndereco());
        cresp.setText(p.getResponsavel());
    }

    private Aluno getAluno() {
        Aluno p = new Aluno();
        p.setCodAluno(Integer.valueOf(ccodigo.getText()));
        p.setNomeAluno(cnome.getText());
        String pw = new String(csenha.getPassword().toString());
        p.setSenhaAluno(pw);
        p.setSexo(csexo.getSelectedItem().toString());
        p.setDataNasc(cDataNasc.getText());
        p.setEmail(cemail.getText());
        p.setTelefone(ctelefone.getText());
        p.setEndereco(cendereco.getText());
        p.setResponsavel(cresp.getText());
        return p;
    }

    //    @param args the command line arguments
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConsultaAluno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListAluno;
    private javax.swing.JPanel Prof;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JTextField cDataNasc;
    private javax.swing.JTextField ccodigo;
    private javax.swing.JTextField cemail;
    private javax.swing.JTextField cendereco;
    private javax.swing.JTextField cnome;
    private javax.swing.JTextField cresp;
    private javax.swing.JPasswordField csenha;
    private javax.swing.JComboBox<String> csexo;
    private javax.swing.JTextField ctelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
