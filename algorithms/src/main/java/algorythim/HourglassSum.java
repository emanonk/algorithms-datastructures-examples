package algorythim;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HourglassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int top, mid, bot;
        List<Integer> hourglasses = new ArrayList();
        for (int x = 0; x < arr.length - 2; x++) {
            for (int y = 0; y < arr.length - 2; y++) {
                top = arr[x][y] + arr[x][y + 1] + arr[x][y + 2];
                mid = arr[x + 1][y + 1];
                bot = arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
                hourglasses.add(top + mid + bot);
            }
        }
        int max = hourglasses.stream().reduce(Integer.MIN_VALUE, Integer::max);


        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
