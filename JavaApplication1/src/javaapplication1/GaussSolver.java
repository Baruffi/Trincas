
package javaapplication1;




public class GaussSolver {    
    /**
     * Algoritmo para resoluÃ§Ã£o de sistemas lineares via eliminaÃ§Ã£o de Gauss
     * Complexidade no tempo: O(n^3)
     * 
     * Forma do sistema (matricial): Ax = b
     * @param A Ã© a matriz dos coeficientes do sistema
     * @param b Ã© a matriz dos coeficientes dos termos independentes
     * @return um vetor com a soluÃ§Ã£o do sistema
     */
    public static double[] gaussSolver(double[][] A, double[] b) {
        //ETAPA DE ESCALONAMENTO
        for (int k = 0; k < A.length - 1; k++) {
            //procura o maior k-Ã©simo coeficiente em mÃ³dulo
            double max = Math.abs(A[k][k]);
            int maxIndex = k;            
            for (int i = k + 1; i < A.length; i++) {
                if (max < Math.abs(A[i][k])) {
                    max = Math.abs(A[i][k]);
                    maxIndex = i;
                }
            }
            if (maxIndex != k) {
                /*
                troca a equaÃ§Ã£o k pela equaÃ§Ã£o com o
                maior k-Ã©simo coeficiente em mÃ³dulo
                */
                for (int j = 0; j < A.length; j++) {
                    double temp = A[k][j];
                    A[k][j] = A[maxIndex][j];
                    A[maxIndex][j] = temp;
                }
                double temp = b[k];
                b[k] = b[maxIndex];
                b[maxIndex] = temp;
            }
            //Se A[k][k] Ã© zero, entÃ£o a matriz dos coeficiente Ã© singular
            //det A = 0
            if (A[k][k] == 0) {
                return null;
            } else {
                //realiza o escalonamento
                for (int m = k + 1; m < A.length; m++) {
                    double F = -A[m][k] / A[k][k];
                    A[m][k] = 0; //evita uma iteraÃ§Ã£o
                    b[m] = b[m] + F * b[k];
                    for (int l = k + 1; l < A.length; l++) {
                        A[m][l] = A[m][l] + F * A[k][l];
                    }
                }
            }
        }
        //ETAPA DE RESOLUÃ‡ÃƒO DO SISTEMA
        double[] X = new double[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            X[i] = b[i];
            for (int j = i + 1; j < A.length; j++) {
                X[i] = X[i] - X[j] * A[i][j];
            }
            X[i] = X[i] / A[i][i];
        }
        return X;
    }
    
}
