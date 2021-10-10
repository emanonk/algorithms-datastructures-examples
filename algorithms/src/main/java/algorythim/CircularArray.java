package algorythim;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int size = a.size();
        //int fullCircles = d/size;
        int restShifts = d % size;

        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            int number = a.get(i);

            if (i - restShifts < 0)
                arr[i - restShifts + size] = number;
            else
                arr[i - restShifts] = number;
        }

        System.out.println(arr);
        return Arrays.stream(arr).collect(Collectors.toList());
    }

}

public class CircularArray {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = 5;
//                Integer.parseInt(firstMultipleInput[0]);

        int d = 4;
//                Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = List.of(1, 2, 3, 4, 5);

//                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());


        List<Integer> result = Result.rotLeft(a, d);

        System.out.println("result");
        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n");
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
