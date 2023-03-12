package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Float dolarHoje = 0.0f;
        Float[] valoresEmReal = new Float[20];
        Float[] valoresConvertidosEmDolar = new Float[20];
        Random rand = new Random();

        System.out.println("Qual o valor do dolar hoje?");
        dolarHoje= scan.nextFloat();

        for(int i=0;i< valoresEmReal.length;i++){

            valoresEmReal[i]= rand.nextFloat()*20.0f;
            valoresConvertidosEmDolar[i] = valoresEmReal[i] / dolarHoje;
            System.out.printf("Valor %d de %.2f Reais Convertido equivale %.2f dolares\n",i+1,valoresEmReal[i],valoresConvertidosEmDolar[i]);
        }


    }    
}
