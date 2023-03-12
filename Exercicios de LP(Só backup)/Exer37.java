package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer37 {
    
    public static void main(String[] args){
        /*37 - Criar um vetor A com 15 elementos inteiros.
        Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do
        elemento correspondente em A.*/

        Integer[] A = new Integer[15];
        Integer[] B = new Integer[15];
        Random rand = new Random();

        for (int i=0;i<A.length;i++){
            A[i]=rand.nextInt(10);
            B[i]=fatorial(A[i]);
        }
        for(int i=0;i<A.length;i++){
            System.out.printf("A[%d]= %d ----- B[%d]= %d\n",i,A[i],i,B[i]);
        }
    }

    public static int fatorial(Integer num){
        int total=1;
        for(int i=1;i<=num;i++){
            total*=i;
        }
        return total;
    }//metodo para fazer o fatorial
}
