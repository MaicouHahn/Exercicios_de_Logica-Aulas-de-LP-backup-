package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer32 {
    
    public static void main(String[] args){
        /*32 - Criar um vetor A com 5 elementos inteiros.
         Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.*/

        int elementos=5;
        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[elementos];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {
            A[i]=scan.nextInt();
            //A[i]= rand.nextInt(10);
        }

        for (int i=0;i<elementos;i++){
            for(int j=1;j<=10;j++){
                System.out.println(A[i]+" x "+j+" = "+(A[i]*j));
            }
            System.out.println("============");
        }

    }    
}
