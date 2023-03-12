package modulo02.Maicou_Hahn.aula01_arrays.labs;

public class Exer24 {
    
    public static void main(String[] args){

        Integer[] num = {3,5,4,3};

        int count=0;

        for(int i = 0 ; i< num.length/2 ; i++){

            for(int j = num.length-1 ; j>=num.length/2 ; j--){

                if(num[i]==num[j]){
                    count++;
                }
            }
        }
        //System.out.println(count);
        if(count == num.length/2){
            for (Integer numero:num) {
                System.out.print(numero);
            }
            System.out.println(": é palíndromo");

        }else{

            for (Integer numero:num) {
                System.out.print(numero);
            }
            System.out.println(": nao é palíndromo");

        }
    }
}
