package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ProductFamilyMatcherWithMap {

    /*
    inputs product codes

    301020 product code - family 4
    31050 family 1
    302050 family 2
    3015010 family 3

    3 -> 0
      -> 1

    3 - product family 1
    30 - product family 2
    301 - product family 3
    3010 - product family 4

    4010

    Array

    addcode
    resolve


     */
    static Map<String, String> familyCodes = new HashMap<>();

    static void addFamily(String code, String familyCode){
        familyCodes.put(code, familyCode);
    }

    static String resolve(String productCode ){
        Set<String> filtered = familyCodes.keySet().stream()
                .filter(key -> productCode.startsWith(key))
                .sorted( )
                .collect(Collectors.toSet());

        int lenght = 0;
        filtered.forEach( key -> {
            if (lenght < key.length()) {

            }
        });

        return "";
    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        addFamily("3", "1");
        addFamily("30", "2");
        addFamily("301", "3");
        addFamily("3010", "4");


        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}