package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer29 {
    
    public static void main(String[] args){
    /*
    * 29 - Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
    * sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de C
    *  deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B.
    * Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

        int elementos=10;
        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[elementos];
        Integer[] B = new Integer[elementos];
        Integer[] C = new Integer[elementos*2];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {
            //A[i]= rand.nextInt(21);
            //B[i]= rand.nextInt(21);
            System.out.printf("A[%d] : ",i);
            A[i]= scan.nextInt();
            System.out.printf("B[%d] : ",i);
            B[i]= scan.nextInt();
        }
        for(int i=0;i<elementos;i++){
            C[i]=A[i];
            C[elementos+i]=B[i];
        }
        System.out.println("A: ");
        for (int j=0; j< elementos;j++)
        {
            System.out.printf("%d ",A[j]);
        }
        System.out.println();

        System.out.println("B: ");
        for (int j=0; j< elementos;j++)
        {
            System.out.printf("%d ",B[j]);
        }
        System.out.println();

        System.out.println("C: ");
        for (int j=0; j< elementos*2;j++)
        {
            System.out.printf("%d ",C[j]);
        }


    }    
}
