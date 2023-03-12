package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer30 {
    
    public static void main(String[] args){
    /*
    * 30 - Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos
    * vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.*/

        int elementos=20;
        int countImpar=0;
        int countPar=0;
        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[elementos];
        Random rand = new Random();

        for(int i=0;i<elementos;i++){
            //A[i]= rand.nextInt(26);
            A[i]= scan.nextInt();
        }
        //loop para criar A e B com tamanho correspondente aos dos numeros de A
        for(int i=0;i<elementos;i++){
            if(A[i]%2==0){
                countPar++;
            }else{
                countImpar++;
            }
        }
        Integer[] B = new Integer[countPar];
        Integer[] C = new Integer[countImpar];

        for(int i=0;i<elementos;i++){

            if(A[i]%2==0){
                for(int j=0;j< B.length;j++){
                    if(B[j]==null){
                        B[j]=A[i];
                        break;
                    }
                }
            }else{
                for(int j=0;j< C.length;j++){
                    if(C[j]==null){
                        C[j]=A[i];
                        break;
                    }
                }
            }
        }
        System.out.println("A");
        for (Integer n: A) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("B");
        for (Integer n: B) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("C");
        for (Integer n: C) {
            System.out.print(n+" ");
        }
    }
}
