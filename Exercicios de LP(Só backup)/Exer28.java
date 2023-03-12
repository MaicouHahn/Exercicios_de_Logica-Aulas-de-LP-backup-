package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer28 {
    
    public static void main(String[] args){
    /*28 - Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e
     tamanho e com os mesmos elementos de A, sendo que estes deverão estar invertidos,
     ou seja, o primeiro elemento de A passa a ser o último de B,
    o segundo elemento de A passa a ser o penúltimo de B e assim por diante.*/

        int elementos=10;
        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[elementos];
        Integer[] B = new Integer[elementos];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {

            //A[i]= rand.nextInt(21);
            A[i]= scan.nextInt();
            B[elementos-1-i] = A[i];
        }
        for (int i=0; i< elementos;i++)
        {
            System.out.printf("A[%d]= %d --- B[%d] = %d\n",i,A[i],i,B[i]);
        }


    }    
}
