package hackerrank;

public class TimeMilitaryConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String ampm  = s.substring(s.length() - 2);
        String hoursStr = s.substring(0,2);

        String minsec = s.substring(2, s.length() - 2);
        Integer hours = Integer.valueOf(hoursStr);
        if( hours == 12) {
            if(ampm.equals("PM")) {
                hoursStr = "12";
            } else {
                hoursStr = "00";
            }
        } else {
            if(ampm.equals("PM")) {
                hours += 12;
                hoursStr = ""+hours;
            } else {

            }
        }

        return hoursStr + minsec;

    }
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("12:05:45AM"));
    }
}
