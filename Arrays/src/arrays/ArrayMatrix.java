package arrays;

/**
 *
 * @author Martijn
 */
public class ArrayMatrix {

    static int[][] arr; //declaratie

    public static void initMatrix() {
        
    }

    public static void startMatrix() {
        arr = new int[6][6]; //creatie van de array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
