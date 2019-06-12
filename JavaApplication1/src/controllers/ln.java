
package controllers;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;



public class ln {
    
    public CategoryDataset creatDataSet(double[] N, double[] L){
    
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset() ;
        
        for(int i=0; i< N.length;i++){
            dataSet.addValue(new Double(N[i]),"Grafico LxN X", new Double(L[i]) );
            
        }
        
        return dataSet;
        
    }
    
    
    public JFreeChart creatLineChart(CategoryDataset dataSet){ 
        
    
        JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico L x N",
                "Valor de L", "Valor de N", dataSet, PlotOrientation.VERTICAL, true,true,true);
   
        
        return criaGrafico;
    }
    
    public ChartPanel criarGrafico(double N[], double L[]){
        
        CategoryDataset dataSet = this.creatDataSet(N, L);
        
        JFreeChart grafico = this.creatLineChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel (grafico);
        
        painelDoGrafico.setPreferredSize(new Dimension (600, 360));
        
        return painelDoGrafico;
    }
   
    
}
    

