package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer23 {
    
    public static void main(String[] args){

        Integer[] numero = new Integer[10];
        Random rand = new Random();

        for (int i=0;i< numero.length;i++){
            numero[i]= rand.nextInt(10);
        }

        for (int i=0;i< numero.length;i++){

            if(numero[i]%2 != 0){
                System.out.println("Numro impar: "+numero[i]);
                break;
            }else{
                System.out.println(numero[i]);
            }


        }



    }    
}
