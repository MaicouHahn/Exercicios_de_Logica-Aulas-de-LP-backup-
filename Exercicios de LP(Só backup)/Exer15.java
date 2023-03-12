package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer15 {
    
    public static void main(String[] args){

        Random rand = new Random();
        int soma = 0;
        int count =0;
        float media = 0.0f;
        Integer[] A = new Integer[10];

        for(int i=0;i<A.length;i++){

            A[i]=rand.nextInt(25);
            System.out.printf("Numero %d: %d\n",i,A[i]);

            if(A[i]%2 != 0){
                soma += A[i];
                count++;
            }

        }

        media=soma/(float)count;

        System.out.printf("A Media dos numeros impares é de: %.1f\n",media);


    }    
}
