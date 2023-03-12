package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer12 {
    
    public static void main(String[] args){

        Random rand = new Random();
        int soma = 0;

        Integer[] A = new Integer[10];

        for(int i=0;i<A.length;i++){

            A[i]=rand.nextInt(25);
            System.out.printf("Numero %d : %d\n",i+1,A[i]);
            soma+=A[i];
        }
        System.out.printf("A soma d todos os numeros do array é: %d \n",soma);

    }    
}
