
package DAO;
import Model.Historico;
import connection.connectionsaptbd;
import java.sql.*;
import javax.swing.JOptionPane;

public class HistoricoDAO {
  
   
   public void create (Historico h) {
    Connection con = connectionsaptbd.getConnection();
    PreparedStatement stmt = null;
    
    try{
            stmt = con.prepareStatement("INSERT INTO historico (id_usuario,data_historico,id_material) VALUES (?,?,?)");
                 
            stmt.setInt(1,h.getId_usuario());
            stmt.setDate(2, (Date) h.getData_historico());
            stmt.setInt(3,h.getId_material());
        
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

public void update(Historico h){
        
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
       
        try{
            stmt = con.prepareStatement("UPDATE HISTORICO SET data_historico = ?, id_usuario = ?, id_material = ? WHERE id_historico = ?");
                 
            stmt.setDate(1, (Date) h.getData_historico());
            stmt.setInt(2, h.getId_usuario());
            stmt.setInt(3, h.getId_material());
   
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

public void delete(Historico h) {
        
        Connection con=connectionsaptbd.getConnection();
        PreparedStatement stmt =null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM historico WHERE id_historico = ?");

            stmt.setInt(1, h.getId_historico());

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


public void procurar (Historico h) {

Connection con=connectionsaptbd.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        try{
        stmt = con.prepareStatement("SELECT * FROM historico WHERE id_historico = ?");

            stmt.setInt(1, h.getId_historico());

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
            connectionsaptbd.closeConnection(con, stmt);
        }

}


}
