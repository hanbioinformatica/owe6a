public class BigO {


    int[] numbers = {11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int numberToSearch = 16;

    int find(int numberToSearch, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToSearch)
                return i; //FOUND
        }
        return -1; //NOT FOUND
    }

    public static void main(String[] args) {
        find(numberToSearch, numbers);
    }
}
