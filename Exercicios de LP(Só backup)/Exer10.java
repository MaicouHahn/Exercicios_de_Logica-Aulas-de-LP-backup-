package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer10 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[10];
        Integer[] B = new Integer[10];

        for(int i=0;i<A.length;i++){
            A[i]=rand.nextInt(25);
            B[i]=A[i]%2;

        }
        for(int i=0;i<A.length;i++){

            System.out.printf("========\n%d/2= %d\n",A[i],B[i]);
        }
    }    
}
