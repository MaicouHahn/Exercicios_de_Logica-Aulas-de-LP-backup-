package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer36 {
    
    public static void main(String[] args){
    /*36 - Criar um vetor A com 11 elementos, indexados de 0 até 10.
    Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2 i . Sugestão int A[11];*/

        Scanner scan = new Scanner(System.in);
        Integer[] A = new Integer[11];
        Random rand = new Random();

        /*for (int i=0;i<A.length;i++){
            A[i]=rand.nextInt(10);
        }
        */

        for (int i=0;i<A.length;i++){
            A[i]=(int)Math.pow(2,i);
        }
            for(int i=0;i<A.length;i++){
                //os comentados causam o mesmo resultado
                //System.out.printf("A[%d]= %d --- %d elevado a %d = %.1f\n",i,A[i],A[i],i,(Math.pow((double)A[i],(double)i)));
                System.out.printf("2 elevado na %d é igual a %d\n",i,A[i]);
            }

        }

    }

