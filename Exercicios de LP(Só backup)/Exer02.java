package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer02 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[8];
        Integer[] B = new Integer[8];

        for(int i=0;i<A.length;i++){
            A[i]=rand.nextInt(25);
            B[i]=A[i]*2;
        }

        for(Integer num : B){
            System.out.println("A: "+num/2);
            System.out.println("B: "+num);
        }
    }    
}
