/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Suporte
 */
public class Material {
    
    private int id_material;
    private String nome;
    private double kcritico;
    private double c;
    private double n;
    private double espessura;
    
    public int getId() {
        return id_material;
    }
    public void setId(int id_material) {
        this.id_material = id_material;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getKcritico() {
        return kcritico;
    }
    public void setKcritico(double kcritico) {
        this.kcritico = kcritico;
    }
    
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    public double getN() {
        return n;
    }
    public void setN(double n) {
        this.n = n;
    }
    
    public double getEspessura() {
        return espessura;
    }
    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
            
}
