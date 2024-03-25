package main.java.hackerrank;


import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulationBruteForce(int n, List<List<Integer>> queries) {
        // Write your code here

        long[] res = new long[n];

        for (List<Integer> query : queries) {
            for (int a = query.get(0)-1; a <= query.get(1)-1; a++) {
                res[a] += query.get(2);
            }
        }
        Arrays.sort(res);
        return res[n-1];
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        long[] res = new long[n];

        for (List<Integer> query : queries) {

            int a = query.get(0)-1;
            int b = query.get(1)-1;
            int k =  query.get(2);

            res[a] += k;
            if (b+1 < n) res[b+1] -= k;
            System.out.println(Arrays.toString(res));
        }

        //get the max value
        long max = Long.MIN_VALUE;
    	for (int i = 1; i < res.length; i++) {
            res[i] += res[i - 1];
            max = Math.max(res[i], max);
        }

    	return max;
    }

}

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//        int m = Integer.parseInt(firstMultipleInput[1]);

//        List<List<Integer>> queries = new ArrayList<>();


        /*
        5 3
        1 2 100
        2 5 100
        3 4 100
         */
        List<List<Integer>> queries = List.of(List.of(1,2,100), List.of(2,5,100), List.of(3,4,100));

        long result = Result.arrayManipulation(5, queries);
        System.out.println(result);
//        IntStream.range(0, m).forEach(i -> {
//            try {
//                queries.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

//        long result = Result.arrayManipulation(n, queries);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}





    /*
    Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.

Example


Queries are interpreted as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1
Add the values of  between the indices  and  inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
The largest value is  after all operations are performed.

Function Description

Complete the function arrayManipulation in the editor below.

arrayManipulation has the following parameters:

int n - the number of elements in the array
int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
Returns

int - the maximum value in the resultant array
Input Format

The first line contains two space-separated integers  and , the size of the array and the number of operations.
Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.

Constraints

Sample Input

5 3
1 2 100
2 5 100
3 4 100
Sample Output

200
Explanation

After the first update the list is 100 100 0 0 0.
After the second update list is 100 200 100 100 100.
After the third update list is 100 200 200 200 100.

The maximum value is .
     */

