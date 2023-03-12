package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer25 {
    
    public static void main(String[] args){

        Integer[] A = new Integer[10];
        Integer[] B = new Integer[10];
        Random rand = new Random();

        for (int i=0; i< A.length;i++)
        {
            A[i]= rand.nextInt(100);
        }
        for (int i=0; i< A.length;i++)
        {
            if (A[i]%2!=0){
                B[i]=0;
            }else{
                B[i]=1;
            }
        }
        for (int i=0; i< A.length;i++)
        {
            System.out.printf("A: %d -- B: %d\n",A[i],B[i]);
        }

    }    
}
