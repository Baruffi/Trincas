
package Model;


import java.util.Date;


public class Historico {
    private int id_historico;
    private Date data_historico;
    private int id_usuario;
    private int id_material;

    /**
     * @return the id_historico
     */
    public int getId_historico() {
        return id_historico;
    }

    /**
     * @param id_historico the id_historico to set
     */
    public void setId_historico(int id_historico) {
        this.id_historico = id_historico;
    }

    /**
     * @return the data_historico
     */
    public Date getData_historico() {
        return data_historico;
    }

    /**
     * @param data_historico the data_historico to set
     */
    public void setData_historico(Date data_historico) {
        this.data_historico = data_historico;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_material
     */
    public int getId_material() {
        return id_material;
    }

    /**
     * @param id_material the id_material to set
     */
    public void setId_material(int id_material) {
        this.id_material = id_material;
    }
    
    
    
    
    
}
