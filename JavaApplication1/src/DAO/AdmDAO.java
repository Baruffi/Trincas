
package DAO;
import Model.Adm;
import connection.connectionsaptbd;
import java.sql.*;
import javax.swing.JOptionPane;

public class AdmDAO {
 
public void create (Adm a) {
    Connection con = connectionsaptbd.getConnection();
    PreparedStatement stmt = null;
    
    try{
            stmt = con.prepareStatement("INSERT INTO usuario (login,senha,nome,formacao) VALUES (?,?,?,?)");
                 
            
            stmt.setString(1,a.getLogin()); 
            stmt.setString(2,a.getSenha());
            stmt.setString(3,a.getNome());
            stmt.setString(4,a.getFormacao());
        
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar!"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con,stmt);
        }

}

// -------------------------------------------------------------------------

public void update(Adm a){
        
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
       
        try{
            stmt = con.prepareStatement("UPDATE usuario SET login = ?, senha = ?, nome = ?, formacao = ?,WHERE id_usuario = ?");
                 
            stmt.setString(1,a.getLogin());
            stmt.setString(2,a.getSenha());
            stmt.setString(3,a.getNome());
            stmt.setString(4,a.getFormacao());
            stmt.setInt(5,a.getId_usuario());
   
            stmt.executeUpdate();
                 
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar!"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con,stmt);
        }
    }
    
    //=============================================================================

public void delete(Adm a) {
        
        Connection con=connectionsaptbd.getConnection();
        PreparedStatement stmt =null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?");

            stmt.setInt(1,a.getId_usuario());

            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con, stmt);
        }
    }


    public void procurar (Adm a) {

Connection con=connectionsaptbd.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;

        try{
        stmt = con.prepareStatement("SELECT * FROM usuario WHERE id_usuario = ?");

            stmt.setInt(1, a.getId_usuario());
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
            }

                     
            
            JOptionPane.showMessageDialog(null, "Encontrado com sucesso!");
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Encontrar"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con, stmt, rs);
        }

}


}
