
package controllers;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;




public class log {

   public CategoryDataset creatDataSet(double[] dLdN, double[] X){
    
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        
        
        for(int i=0; i< dLdN.length;i++){
            dataSet.addValue(new Double(dLdN[i]),"Grafico LOG",new Double(X[i]));
        }
        
        return dataSet;
        
    }
    
    
    public JFreeChart creatLineChart(CategoryDataset dataSet){ 
        
    
        JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico Log",
                "logΔK", "logdL/dN", dataSet, PlotOrientation.VERTICAL, true, true, true);
   
        
        return criaGrafico;
    }
    
    public ChartPanel criarGrafico(double[] dLdN, double[] X){
        
        CategoryDataset dataSet = this.creatDataSet (dLdN, X);
        
        JFreeChart grafico = this.creatLineChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel (grafico);
        
        painelDoGrafico.setPreferredSize(new Dimension (600, 360));
        
        return painelDoGrafico;
    }
    
}    

    

