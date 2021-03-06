package com.sistema.bd;

import com.sistema.bean.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//As exceções devem ser propagadas para a camada de apresentação, ou seja, deve ser utilizado throws em cada um dos métodos
public class AlunoDAO {

    public void delete(Aluno al) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from alunos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, al.getCodAluno());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(Aluno al) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();

            String sql = "insert into alunos (codigo,nome,senha,sexo,data,email,telefone,endereco,responsavel) values(?,?,?,?,?,?,?,?,?);";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, al.getCodAluno());
            ps.setString(2, al.getNomeAluno());
            ps.setString(3, al.getSenhaAluno());
            ps.setString(4, al.getSexo());
            ps.setString(5, al.getDataNasc());
            ps.setString(6, al.getEmail());
            ps.setString(7, al.getTelefone());
            ps.setString(8, al.getEndereco());
            ps.setString(9, al.getResponsavel());

            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Aluno al) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update alunos set nome=?,senha=?,sexo=?,data=?,email=?,telefone=?,endereco=?,responsavel=? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, al.getNomeAluno());
            ps.setString(2, al.getSenhaAluno());
            ps.setString(3, al.getSexo());
            ps.setString(4, al.getDataNasc());
            ps.setString(5, al.getEmail());
            ps.setString(6, al.getTelefone());
            ps.setString(7, al.getEndereco());
            ps.setString(8, al.getResponsavel());
            ps.setInt(9, al.getCodAluno());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public List<Aluno> getAll() {
        List<Aluno> lista = new ArrayList<Aluno>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, nome from alunos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                Aluno p = new Aluno();
                p.setCodAluno(codigo);
                p.setNomeAluno(nome);
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Aluno getAlunobycode(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from alunos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                String senha = rs.getString(3);
                String sexo = rs.getString(4);
                String datanasc = rs.getString(5);
                String email = rs.getString(6);
                String telefone = rs.getString(7);
                String endereco = rs.getString(8);
                String responsavel = rs.getString(9);

                Aluno a = new Aluno();
                a.setCodAluno(cod);
                a.setNomeAluno(nome);
                a.setSenhaAluno(senha);
                a.setSexo(sexo);
                a.setDataNasc(datanasc);
                a.setEmail(email);
                a.setTelefone(telefone);
                a.setEndereco(endereco);
                a.setResponsavel(responsavel);
                return a;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

    public Aluno getAlunobyname(String usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome,senha from alunos where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString(1);
                String senha = rs.getString(2);

                Aluno a = new Aluno();
                a.setNomeAluno(nome);
                a.setSenhaAluno(senha);
                return a;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

}
