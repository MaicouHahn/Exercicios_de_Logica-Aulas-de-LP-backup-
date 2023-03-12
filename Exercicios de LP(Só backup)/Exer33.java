package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer33 {
    
    public static void main(String[] args){
    /*33 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do
     vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.*/

        int count=0;
        Integer[] A = new Integer[10];
        Random rand = new Random();

        for (int i=0;i<A.length;i++){
            A[i]=rand.nextInt(100);
        }
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+"-");
        }
        System.out.println();
        for(int j=0;j< A.length;j++){
            for (int i = 1; i <= A[j]; i++) {
                if (A[j] % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(A[j]+" numero primo");
            }
            count=0;
        }
    }    
}
