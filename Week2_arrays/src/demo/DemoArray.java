package demo;

import java.util.Arrays;

public class DemoArray {

    public static void main(String[]args) {
        // declaratie   ... initialisatie met de bepaling van de grootte van de array
        // Kenmerken van een Array: de maat staat vast, een type data
        int[] int_array = new int[10];
        int_array[7]=90;
        for (int i=0;i<int_array.length;i++){
            System.out.println(int_array[i]);
        }
        for(int x:int_array){
            System.out.println(x);
        }

        String[] Array1 = {
                "E.coli", "C.elegans", "D.melanogaster", "M.musculus", "A.thaliana"
        };

        String[] Array2 = new String[5];
        System.arraycopy(Array1, 0, Array2, 0, Array1.length);
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
        Array2[2] = "S.lycopersicum";
        System.out.println("Wijzig in array 2");
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));

        String[] arr = "hello world en hallo wereld".split(" ");
        for (String s:arr){
            System.out.println(s);
        }


    }
}
