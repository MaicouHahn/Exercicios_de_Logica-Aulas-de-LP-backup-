package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer26 {
    
    public static void main(String[] args){
    /*
    * 26 - Criar dois vetores A e B cada um com 10 elementos inteiros.
    * Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    *
    * a) Ci deverá receber 1 quando Ai for maior que Bi;
    * b) Ci deverá receber 0 quando Ai for igual a Bi;
    * c) Ci deverá receber -1 quando A i for menor que B i .
    * */

        int elementos=10;
        Integer[] A = new Integer[elementos];
        Integer[] B = new Integer[elementos];
        Integer[] C = new Integer[elementos];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {
            A[i]= rand.nextInt(100);
            B[i]= rand.nextInt(100);
        }
        for (int i=0; i< elementos;i++)
        {
            if (A[i]>B[i]){
                C[i]=1;
            }else if(A[i]==B[i]){
                C[i]=0;
            }else{
                C[i]=-1;
            }
        }
        for (int i=0; i< elementos;i++)
        {
            System.out.printf("A: %d -- B: %d -- C: %d\n",A[i],B[i],C[i]);
        }

    }    
}
