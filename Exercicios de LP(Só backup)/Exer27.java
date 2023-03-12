package modulo02.Maicou_Hahn.aula01_arrays.labs;

import java.util.Random;

public class Exer27 {
    
    public static void main(String[] args){
    /*27 - Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e
    tamanho, obedecendo as seguintes regras de formação:

    a) B i deverá receber 'a' quando A i for menor que 7;
    b) B i deverá receber 'b' quando A i for igual a 7;
    c) B i deverá receber 'c' quando A i for maior que 7 e menor que 10;
    d) B i deverá receber 'd' quando A i for igual a 10; e
    e) B i deverá receber 'e' quando A i for maior que 10.
    Sugestão: char B[10];
    */
        int elementos=10;
        Integer[] A = new Integer[elementos];
        Character[] B = new Character[elementos];
        Random rand = new Random();

        for (int i=0; i< elementos;i++)
        {
            A[i]= rand.nextInt(21);
        }
        for (int i=0; i< elementos;i++)
        {
            if (A[i]<7){
                B[i]='a';
            }else if(A[i]==7){
                B[i]='b';
            }else if (A[i]>7 && A[i]<10){
                B[i]='c';
            }else if (A[i]==10){
                B[i]='d';
            }else{
                B[i]='e';
            }
        }
        for (int i=0; i< elementos;i++)
        {
            System.out.printf("A: %d -- B: %c \n",A[i],B[i]);
        }


    }    
}
