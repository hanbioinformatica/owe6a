package arrayBasis;

public class DemoArray {

    public static void main(String[] args) {
        int[] i_arr;       // declaratie van een array
        i_arr = new int[10]; //initialisatie - met grootte fixed size
        i_arr[0] = 8;
        i_arr[1] = 7;
        System.out.println(i_arr);

        int[] i_arr2 = new int[10]; //initialisatie en declaratie
        int[][] i_arr3 = new int[10][10];  //multi dimensionele array

        String[] st_ar = new String[1000];

        //Arrays zijn fixed size en kunnen primitives en objecten bevatten


    }
}
