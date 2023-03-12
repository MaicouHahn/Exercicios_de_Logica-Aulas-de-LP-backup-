package modulo02.Maicou_Hahn.aula01_arrays.labs;
import java.util.Random;
public class Exer01 {
    
    public static void main(String[] args){

        Random rand = new Random();

        Integer[] A = new Integer[5];
        Integer[] B = new Integer[5];

        for(int i=0;i<A.length;i++){
                A[i]=rand.nextInt(25);
            //System.out.println(A[i]);
                B[i]=A[i];
        }
        for(Integer num : B){
            System.out.println(num);
        }
    }    
}
