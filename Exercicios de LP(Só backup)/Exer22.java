package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer22 {
    
    public static void main(String[] args){

        Integer[] numero = new Integer[10];

        int count1=0;
        int count0=0;
        Random rand = new Random();

        for (int i=0 ; i< numero.length;i++){

            numero[i]=rand.nextInt(2);
            System.out.println(numero[i]);

            if(numero[i]==0){
                count0++;
            }else{
                count1++;
            }
        }
        System.out.printf("%.1f%% de 0\n",(float)(count0*100)/ numero.length);
        System.out.printf("%.1f%% de 1\n",(float)(count1*100)/ numero.length);


    }    
}
