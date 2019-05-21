
package Model;

import java.util.Date;


public class Historico {
    private int id_historico;
    private Date data_historico;
    private int id_usuario;
    
    public int getId_historico() {
        return id_historico;
    }

    
    public void setId_historico(int id_historico) {
        this.id_historico = id_historico;
    }

    
    public Date getData_historico() {
        return data_historico;
    }

    
    public void setData_historico(Date data_historico) {
        this.data_historico = data_historico;
    }

   
    public int getId_usuario() {
        return id_usuario;
    }

    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
