package DAO;

import connection.connectionsaptbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Material;

public class MaterialDAO {
    
    public void create(Material m){
       
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO MATERIAL (NOME,KCRITICO,C,N,ESPESSURA) VALUES (?,?,?,?,?)");
                 
            stmt.setString(1,m.getNome());
            stmt.setDouble(2,m.getKcritico()); 
            stmt.setDouble(3,m.getC());
            stmt.setDouble(4,m.getN());
            stmt.setDouble(5,m.getEspessura());
        
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
    //=============================================================================
    //=============================================================================
  
    public void update(Material m){
        
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
       
        try{
            stmt = con.prepareStatement("UPDATE MATERIAL SET NOME = ?, KCRITICO = ?, C = ?, N = ?, ESPESSURA = ? WHERE ID_MATERIAL = ?");
                 
            stmt.setString(1,m.getNome());
            stmt.setDouble(2,m.getKcritico()); 
            stmt.setDouble(3,m.getC());
            stmt.setDouble(4,m.getN());
            stmt.setDouble(5,m.getEspessura());
            stmt.setInt(6,m.getId());
   
            stmt.executeUpdate();
                 
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
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
    
    //=============================================================================
    //=============================================================================
    
    public void delete(Material m) {
        
        Connection con=connectionsaptbd.getConnection();
        PreparedStatement stmt =null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM MATERIAL WHERE ID_MATERIAL = ?");

            stmt.setInt(1, m.getId());

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
}
