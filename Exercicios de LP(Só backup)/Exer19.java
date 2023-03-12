package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args){

         Scanner scan = new Scanner(System.in);

        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        float[] result = new float[10];
        Random rand = new Random();

        for (int i=0;i<result.length;i++){

            System.out.println("Aluno "+(i+1));
            System.out.print("Nota 1: ");
            nota1[i]= scan.nextFloat();

            System.out.print("Nota 2: ");
            nota2[i]= scan.nextFloat();

            result[i]=(nota1[i]+nota2[i])/2;
            /*
            nota1[i] = rand.nextFloat()*10.0F;
            nota2[i] = rand.nextFloat()*10.0F;
            System.out.println(nota1[i]);
            System.out.println(nota2[i]);
            result[i]=(nota1[i]+nota2[i])/2;
             */

        }
        for (int i=0;i<result.length;i++){

            if(result[i]>=7){
                System.out.printf("Aluno %d Aprovado com media %.1f\n",i+1,result[i]);
            }else{
                System.out.printf("Aluno %d Reprovado com media %.1f\n",i+1,result[i]);
            }

        }

    }    
}
