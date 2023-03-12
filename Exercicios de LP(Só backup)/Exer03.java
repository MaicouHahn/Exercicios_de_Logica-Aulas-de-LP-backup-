package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer03 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[15];
        Integer[] B = new Integer[15];

        for(int i=0;i<A.length;i++){
            A[i]=rand.nextInt(25);
            B[i]=A[i]*A[i];
        }
        for(int i=0;i<A.length;i++){
            System.out.printf("========\nA: %d\nB: %d\n",A[i],B[i]);
        }


    }    
}
