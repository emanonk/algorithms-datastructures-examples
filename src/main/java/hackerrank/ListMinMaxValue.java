package hackerrank;

import java.util.List;

public class ListMinMaxValue {

    private static void minmax(List<Integer> arr) {
        long sum =0, min, max;

        try {
            for (int i =0; i< arr.size(); i++) {

                sum += arr.get(i);
            }
        }
        catch (Exception e) {
            sum = Integer.MAX_VALUE;
        }


        min = sum;
        max = 0;

        for (int i =0; i< arr.size(); i++) {
            long localmin, localmax;

            localmin = sum - arr.get(i);
            localmax = sum - arr.get(i);
            //min
            if ( localmax > max ) {
                max = localmax;
            }

            //max
            if ( localmin < min) {
                min = localmin;
            }

        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        minmax(List.of(1,2,3,4,5));
    }
}
