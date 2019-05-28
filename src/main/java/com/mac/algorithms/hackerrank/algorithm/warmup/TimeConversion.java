package hackerrank.warmup;

public class TimeConversion {

    public static void main(String[] args) {

        String s = "11:00:00PM";

        String dn = s.substring(8);
        String minSec = s.substring(2,8);
        String hour = s.substring(0,2);

        if(dn.equals("PM") && !hour.equals("12")){
            Integer h = Integer.valueOf(hour) + 12;
            hour = h.toString();
        } else if(dn.equals("AM") && hour.equals("12")){
            hour = "00";
        }

//        return hour + minSec;
        System.out.println(hour + minSec);

    }

}
