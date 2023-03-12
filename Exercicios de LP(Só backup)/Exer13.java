package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer13 {
    
    public static void main(String[] args){

        Random rand = new Random();
        int soma = 0;

        Integer[] A = new Integer[10];

        for(int i=0;i<A.length;i++){

            A[i]=rand.nextInt(10);
            System.out.printf("Numero %d : %d\n",i+1,A[i]);

            if(A[i]%5==0){
                soma+=A[i];
            }
        }

        if(soma != 0){
            System.out.printf("A soma d todos os numeros multiplos de 5 do array é: %d \n",soma);
        }else{
            System.out.println("Nenhum numero do array é multiplo de 5");
        }

    }    
}
