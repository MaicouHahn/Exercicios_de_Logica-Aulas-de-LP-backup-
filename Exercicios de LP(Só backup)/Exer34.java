package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer34 {
    
    public static void main(String[] args){
    /*34 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que
    imprima cada elemento
    do vetor A e a relação de todos os pares de 0 até o respectivo elemento.*/

        Integer[] A = new Integer[10];
        Random rand = new Random();

        for (int i=0;i<A.length;i++){
            A[i]=rand.nextInt(100);
        }
        for(int i=0;i<A.length;i++){
            System.out.printf("A[%d]= %d: ",i,A[i]);
            for(int j=0;j<A[i];j++){
                if(j%2==0){
                    System.out.printf("%d ",j);
                }
            }
            System.out.printf("%d ",A[i]);
            System.out.println();
        }
    }    
}
