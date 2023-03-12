package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer35 {
    
    public static void main(String[] args){
        /*35 - Criar um vetor A com 10 elementos inteiros.
        Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.
        */
        Integer[] A = new Integer[10];
        Random rand = new Random();

        for (int i=0;i<A.length;i++){
            A[i]=rand.nextInt(100);
        }
        for(int i=0;i<A.length;i++){
            System.out.printf("A[%d]= %d: ",i,A[i]);
            for(int j=1;j<=A[i];j++){
                if(A[i]%j==0){
                    System.out.printf("%d ",j);
                }

            }
            System.out.println();
        }
    }    
}
