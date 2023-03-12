package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer16 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[10];

        int somaMenor15 = 0;
        int countIgual15 = 0;
        float mediaMaior15 = 0;
        int somaMaior15=0;
        int _countMaior15 = 0;

        for(int i=0;i<A.length;i++){

            A[i]=rand.nextInt(100);
            System.out.printf("Numero %d: %d\n",i,A[i]);
                if(A[i]<15){

                    somaMenor15 += A[i];

                } else if (A[i]==15) {

                    countIgual15++;

                } else if (A[i]>=15) {

                    _countMaior15++;
                    somaMaior15 += A[i];
                    mediaMaior15 = somaMaior15/_countMaior15;
                }

        }

        System.out.printf("A soma de elementos armazenados neste vetor que são inferiores a 15: %d\n",somaMenor15);

        if(countIgual15!=0){
            System.out.printf("a quantidade de elementos armazenados no vetor que são iguais a 15 : %d\n",countIgual15);
        }else {
            System.out.println("Nao há o numero 15 neste array");
        }

        System.out.printf("A média dos elementos armazenados no vetor que são superiores a 15: %.1f\n",mediaMaior15);

    }    
}
