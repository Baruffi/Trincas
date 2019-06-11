package DAO;

import connection.connectionsaptbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    //=========================================================================
    
    public List<Material> read(){
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Material> material1 = new ArrayList<>();
        try{
            stmt=con.prepareStatement("SELECT * FROM MATERIAL");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                Material material = new Material();
                material.setId(rs.getInt("ID_MATERIAL"));
                material.setNome(rs.getString("NOME"));
                material.setKcritico(rs.getDouble("KCRITICO"));
                material.setC(rs.getDouble("C"));
                material.setN(rs.getDouble("N"));
                material.setEspessura(rs.getDouble("ESPESSURA"));
            
                
                material1.add(material);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do materiais"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con,stmt,rs);
        }
        return material1;
    }
    
    //=========================================================================
    
    public List<Material> readParaClientes(String NomePesquisaMaterial){
        Connection con = connectionsaptbd.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Material> material1 = new ArrayList<>();
        try{
            
            stmt = con.prepareStatement("SELECT * FROM MATERIAL WHERE NOME LIKE ?");
            stmt.setString(1, "%" + NomePesquisaMaterial + "%"); 
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Material material = new Material();
                
                material.setId(rs.getInt("ID_MATERIAL"));
                material.setNome(rs.getString("NOME"));
                material.setKcritico(rs.getDouble("KCRITICO"));
                material.setC(rs.getDouble("C"));
                material.setN(rs.getDouble("N"));
                material.setEspessura(rs.getDouble("ESPESSURA"));
           
                
                material1.add(material);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do cliente"+ex);
        }
        finally
        {
            connectionsaptbd.closeConnection(con,stmt,rs);
        }
        return material1;
        
    }
}
