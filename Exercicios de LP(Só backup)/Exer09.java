package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer09 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[10];
        Integer[] B = new Integer[10];
        Float[] C = new Float[10];

        for(int i=0;i<A.length;i++){
            A[i]=rand.nextInt(25);
            B[i]=rand.nextInt(25);
            C[i] = (float)A[i] / (B[i]);
        }
        for(int i=0;i<A.length;i++){

            System.out.printf("========\n%d/%d= %.2f\n",A[i],B[i],C[i]);
        }
    }    
}
