package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer17 {
    
    public static void main(String[] args){

       Random rand = new Random();

        int _idadeMaior35 = 0;
        Integer[] A = new Integer[10];
        //Scanner scan = new Scanner(System.in);

        for(int i=0;i<A.length;i++){

            //A[i]=scan.nextInt();

            A[i]= rand.nextInt(75);

            if(A[i]>35){
                _idadeMaior35++;
            }

            System.out.printf("Idade %d : %d\n",i+1,A[i]);
        }
        System.out.printf("Idades maior que 35 anos: %d\n",_idadeMaior35);

    }    
}
