package codesignal;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class CommonCharacterCount {
	
	private static int commonCharacterCount(String s1, String s2) {
	    int o = 0;
	    String common = IntStream
	        .range(0x61, 0x7b)
				.peek(c -> System.out.println(c))
	        .filter(n -> s1.contains((char)n+"") && s2.contains((char)n+""))
	        .boxed().map(c -> (char)c.intValue()+"").collect(Collectors.joining());
	    
	    for(char c : common.toCharArray()) {
	        o += Math.min(
	            s1.chars().map(n -> c == (char)n ? 1 : 0).sum(),
	            s2.chars().map(n -> c == (char)n ? 1 : 0).sum());
	    }
	    
	    return o;
	}

	private static boolean palindromeRearranging(String inputString) {
		int[] abc = new int[26];
		for(int i = 0; i < inputString.length(); i++) {
			abc[inputString.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(abc));
		return inputString.length() % 2 ==
				Arrays.stream(abc).map(n -> n % 2 == 1 ? 1 : 0).sum();
	}

	private static int phoneCall(int min1, int min2_10, int min11, int s) {
		int min = 0, q = 9;

		if(s >= min1) {
			s -= min1;
			min++;
		}

		for(int i = 0; i < 9; i++) {
			if(s >= min2_10) {
				s -= min2_10;
				min++;
				q--;
			}
		}

if(1==0) {


		while(s >= min11) {
			s -= min11;
			min++;
		}
}

		return min;
	}

	private static int killkthbit(int n, int k){
		char[] binaryString = Integer.toBinaryString(n).toCharArray();

		binaryString[k] = '0';

		return (int) Integer.parseInt(binaryString.toString());
	}


	public static void main(String[] args) {

//		System.out.println(palindromeRearranging("aabb"));
//		System.out.println(commonCharacterCount("aabcc", "adcaa"));
		System.out.println(phoneCall(1,2,1,6));
	}
}