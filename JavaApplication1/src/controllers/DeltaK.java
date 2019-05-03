package controllers;

import static java.lang.Math.sqrt;

public class DeltaK {
    
    public static void main (String args[]){
    
        double[] L = {10.78,11.41,12.01,12.905,13.815,15.24,17.15,19.025,20.64,23.26,25.725};
        double b = 36; //mm
        double esp = 7; //mm
        double Max = 35; //KN
        double Min = 7; //KN
        double Area = 2*b*esp;//mm^2
        double deltaSigma = (Max-Min)*1000/Area; //Mpa
        int T = 11;

        double[] deltaK = new double[T];
        
        for(int i=0;i<T;i++){
            double Y = (1.77+0.454*(L[i]/b)-2.04*(L[i]/b)*(L[i]/b)+21.6*(L[i]/b)*(L[i]/b)*(L[i]/b));
            deltaK[i] = deltaSigma*sqrt(L[i]/1000)*Y;
            System.out.println(deltaK[i]);
        }
        
        
        
        
    }
    
}
