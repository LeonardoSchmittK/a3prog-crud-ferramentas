package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoDAO {

    public ArrayList<Emprestimo> EmprestimoLista = new ArrayList<>();

    public ArrayList<Emprestimo> getEmprestimoLista() {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {
                int id = res.getInt("id");
                int ferramentaId = res.getInt("ferramentaId");
                String nomeFerramenta = res.getString("nomeFerramenta");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");

                Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId, nomeAmigo);

                EmprestimoLista.add(objetoEmprestimo);
            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return EmprestimoLista;
    }

    public ArrayList<Emprestimo> getEmprestimoQueryBd(Boolean estaAtivo) {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE estaAtivo = " + estaAtivo);
            while (res.next()) {
                int id = res.getInt("id");
                int ferramentaId = res.getInt("ferramentaId");
                String nomeFerramenta = res.getString("nomeFerramenta");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");

                Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId, nomeAmigo);

                EmprestimoLista.add(objetoEmprestimo);
            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return EmprestimoLista;
    }

    public boolean estaAmigoDevendo(int amigoIdParameter) {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE amigoId = " + amigoIdParameter + " AND estaAtivo = true");
            while (res.next()) {
                int id = res.getInt("id");
                int ferramentaId = res.getInt("ferramentaId");
                String nomeFerramenta = res.getString("nomeFerramenta");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");

                Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId, nomeAmigo);

                EmprestimoLista.add(objetoEmprestimo);
                if (!EmprestimoLista.isEmpty()) {
                    return true;
                }
            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return false;
    }

    public boolean deleteEmprestimoBd(int id) {
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao remover emprestimo: " + erro);
        }
        return true;
    }

    public boolean insertEmprestimoDb(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id,nomeFerramenta,ferramentaId,nomeAmigo,amigoId,estaAtivo) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNomeFerramenta());
            stmt.setInt(3, objeto.getFerramentaId());
            stmt.setString(4, objeto.getNomeAmigo());
            stmt.setInt(5, objeto.getAmigoId());
            stmt.setBoolean(6, true);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir ferramenta no banco de dados:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public void setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista) {
        this.EmprestimoLista = EmprestimoLista;
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_emprestimo");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao resgatar maior id de emprestimo: " + ex);
        }

        return maiorID;
    }

    public boolean updateEmprestimoBd(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimo set nomeFerramenta = ? ,ferramentaId = ? ,nomeAmigo= ?,amigoId = ? WHERE id = ?";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNomeFerramenta());
            stmt.setInt(2, objeto.getFerramentaId());
            stmt.setString(3, objeto.getNomeAmigo());
            stmt.setInt(4, objeto.getAmigoId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao dar update emprestimo:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean updateEmprestimoAtivoBd(int id, boolean estaAtivo) {
        String sql = "UPDATE tb_emprestimo set estaAtivo = ? WHERE id = " + id;
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setBoolean(1, estaAtivo);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao dar update emprestimo:" + erro);
            throw new RuntimeException(erro);
        }
    }

}
