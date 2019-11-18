/*
 * 
 * http://www.idevelopment.info/data/Programming/java/PROGRAMMING_Java_Programming.shtml
 */
package arrayBasis;

/**
 *
 * @author Martijn
 */
public class Array1 {

    public static int[] ExampleArray1;
    //Ook de String[] onvangt een array van waardes

    public static int[] mijnArr = new int[24];

    public static void main(String[] args) {

        mijnArr[0] = 9;
        //System.out.println(mijnArr[0]);
        // Array declaratie en creatie van object in twee stappen

       int[] intArray = {2, 3, 5, 7, 11};
////        for (int i:intArray){
////            System.out.println(i);
////        }
////        for (int i=0;i<intArray.length;i++){
////            System.out.println(intArray[i]);
////        }

        // Array declaratie en creatie van object in een stap
        // Array declaratie, constructie en initialisatie in een stap
        String[] Array1 = {
            "E.coli", "C.elegans", "D.melanogaster", "M.musculus", "A.thaliana"
        };
        
        Array1[2] = "X.leavis";
        for (String s : Array1) {
            System.out.print(s + "\t");
        }
        System.out.println("");
        
        String[] Array2 = Array1;
        Array1[1] = "Q.robur";
        Array2[2] = "S.lycopersicum";
        
        for (String s : Array1) {
            System.out.print(s + "\t");
        }
        System.out.println("");
        
        for (String s : Array2) {
            System.out.print(s + "\t");
        }
        System.out.println("");
        
        
        
        
        Array2[1] = "P.anua";

        //System.out.println(Array1==Array2);
        //System.out.println(Array1[1]);
        //Maak een kopie van de array
        String[] copiedArray = new String[5];
        System.arraycopy(Array1, 0, copiedArray, 0, Array1.length);

        Array1[0] = "U.dioica";

        //System.out.println(Array1[0]);
        //System.out.println(copiedArray[0]);
        int[][] xy = new int[10][10];

        int[][][][] i = new int[10][10][10][10];

        i[7][4][2][9] = 8;

        //Controleer gelijkheid
        //System.out.println(Array1.equals(copiedArray));
        int xmax = 10;
        int ymax = 10;

        boolean[][][][] ExampleArray2D = new boolean[xmax][ymax][xmax][ymax];
        ExampleArray2D[0][0][0][0] = true;

    }
}
