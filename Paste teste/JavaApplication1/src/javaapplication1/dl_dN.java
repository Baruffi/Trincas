package javaapplication1;

import static javaapplication1.GaussSolver.gaussSolver;



public class dl_dN {
    
    public static void main (String args[]){
        
     //int[] N = new int[11], l1 = new int[11], l2 = new int[11];
       double[] N = {0.00,200.00,400.00,600.00,800.00,1000.00,1200.00,1350.00,1450.00,1550.00,1600.00};
       double[] L = {10.78,11.41,12.01,12.905,13.815,15.24,17.15,19.025,20.64,23.26,25.725};
       int T = 11;
       int cont = 0;
       int j = 0;
       double[] dLdN = new double[T];
       
       
       while(j!=T-4){
    
            double[] g1 = new double[5];
            double[] g2 = new double[5];        
            double[] g3 = new double[5];
            //Calculo de g1[x] g2[x] g3[x]===========================================
            for(int i=j;i<j+5;i++){
                g1[i-j] = Math.pow(N[i],0);
                g2[i-j] = Math.pow(N[i],1);
                g3[i-j] = Math.pow(N[i],2);
            }
            //=======================================================================

            //Calculo dos coeficientes da matriz=====================================
            double a11=0,a12=0,a13=0,a22=0,a23=0,a33=0,b1=0,b2=0,b3=0; 
            //Calculo a11
            
            for (int i=j;i<j+5;i++){
                a11 = a11+(g1[i-j]*g1[i-j]);
                a12 = a12+(g1[i-j]*g2[i-j]);
                a13 = a13+(g1[i-j]*g3[i-j]);
                a22 = a22+(g2[i-j]*g2[i-j]);
                a23 = a23+(g2[i-j]*g3[i-j]);
                a33 = a33+(g3[i-j]*g3[i-j]);
                b1 = b1+(L[i]*g1[i-j]);
                b2 = b2+(L[i]*g2[i-j]);
                b3 = b3+(L[i]*g3[i-j]);
            }
            //=======================================================================

            //Calculo dos coeficientes da parabola===================================
            double MatA[][] = { {a11, a12, a13}, {a12, a22, a23}, {a13, a23, a33} };
            double MatB[] = {b1,b2,b3};
            double[] R = gaussSolver(MatA, MatB);
            System.out.printf("c = %f\nb = %f\na = %f\n", R[0], R[1], R[2]);
            //=======================================================================

            //Calculo aux de dLdN====================================================
            //Derivada para ponto 1
            if (cont == 0){
                dLdN[0] = 2*R[2]*N[j]+R[1];
            }
            if (cont == 1){
               dLdN[1] = 2*R[2]*N[j]+R[1];
            }
            if (cont == 2){
               dLdN[2] = 2*R[2]*N[j]+R[1];
               dLdN[3] = 2*R[2]*N[j+1]+R[1];
               dLdN[4] = 2*R[2]*N[j+2]+R[1]; 
            }
            if (cont >= 3 && cont != T-5){
               dLdN[cont+2] = 2*R[2]*N[j+2]+R[1]; 
            }
            if (cont == T-5){
               dLdN[cont+2] = 2*R[2]*N[j+2]+R[1];
               dLdN[cont+3] = 2*R[2]*N[j+3]+R[1];
               dLdN[cont+4] = 2*R[2]*N[j+4]+R[1];
            }
            cont++;
            j++;
        }
        for(int i = 0; i<T;i++){
            System.out.println(dLdN[i]);
        }
    }
}