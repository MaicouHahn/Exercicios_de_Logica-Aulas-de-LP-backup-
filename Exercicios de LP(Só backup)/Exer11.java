package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer11 {
    
    public static void main(String[] args){

        Random rand = new Random();
        int count = 0;

        Integer[] A = new Integer[10];

        for(int i=0;i<A.length;i++){

            A[i]=rand.nextInt(25);

            if(A[i]%2==0){
                count++;
            }
            System.out.printf("Numero %d : %d\n",i+1,A[i]);
        }
            System.out.printf("há %d numeros pares neste array\n",count);

    }    
}
