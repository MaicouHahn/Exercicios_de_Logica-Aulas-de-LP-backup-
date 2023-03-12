package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer31 {
    
    public static void main(String[] args){
    /*31 - Ler um vetor A com 20 elementos. Separar os elementos pares e
    ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos
    pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.*/

        int elementos=20;
        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[elementos];
        Integer[] B = new Integer[elementos];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {
            A[i]=scan.nextInt();
            //A[i]= rand.nextInt(26);
        }
        for(int i=0;i<elementos;i++) {//armazena na primeira parte do array B apenas os pares
            if (A[i] % 2 == 0) {
                for (int j = 0; j < elementos; j++) {
                    if (B[j] == null) {
                        B[j] = A[i];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<elementos;i++){//armazena no resto do array B apenas os impares
            if(A[i]%2!=0){
                for(int j=0;j<elementos;j++){
                    if(B[j]==null){
                        B[j]=A[i];
                        break;
                    }
                }
            }
        }
        for (Integer n:B) {
            System.out.print(" "+n);
        }
    }
}
