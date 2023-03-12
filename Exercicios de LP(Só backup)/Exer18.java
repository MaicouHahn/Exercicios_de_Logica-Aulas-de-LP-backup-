package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Integer[] num = new Integer[10];
        Random rand = new Random();
        //Scanner scan = new Scanner(System.in);
        int count = 0;

        for(int i=0;i< num.length;i++){
            //num[i]= scan.nextInt();
            num[i]=rand.nextInt(75);
            System.out.printf("Idade %d: %d\n",i+1,num[i]);
        }

        //Maior Idade
        for (int i = 0; i < num.length; i++) {
            count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] >= num[j]) {
                    count++;
                }
            }
            if (count == num.length) {
                System.out.println("Maior Idade: "+num[i]);
                count=0;
                break;
            }
        }

        //Menor Idade
        for (int i = 0; i < num.length; i++) {
            count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] <= num[j]) {
                    count++;
                }
            }
            if (count == num.length) {
                System.out.println("Menor Idade: " + num[i]);
                break;
            }
        }

    }
}
