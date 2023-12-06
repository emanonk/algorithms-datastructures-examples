package hackerrank;

import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int heightest = 0;
        int units = 0;

        for (int i=0; i< candles.size(); i++){
            if ( candles.get(i) > heightest) {
                heightest = candles.get(i);
                units = 0;

            }
            if (candles.get(i) == heightest) {
                units += 1;
            }
        }
        System.out.println(units);
        return units;
    }

    public static void main(String[] args) {
        birthdayCakeCandles(List.of(1,2,3,4,5));
    }
}
