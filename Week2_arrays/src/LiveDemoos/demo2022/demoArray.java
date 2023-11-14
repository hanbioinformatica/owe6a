package LiveDemoos.demo2022;

public class demoArray {

    public static void main(String[] args) {

        int[][] arr_2d = new int[10][10];
        arr_2d[3][0]= 9;
        arr_2d[4][3]= 8;
        for (int y=0;y<arr_2d.length;y++){
            for (int x=0;x<arr_2d.length;x++){
                System.out.print(arr_2d[x][y]);
            }
            System.out.println();
        }

        int[][] tweede_arr_2d = arr_2d;
        tweede_arr_2d[0][0]=4;

        System.out.println("Opnieuw arr printen");
        for (int y=0;y<arr_2d.length;y++){
            for (int x=0;x<arr_2d.length;x++){
                System.out.print(arr_2d[x][y]);
            }
            System.out.println();
        }





    }

}
