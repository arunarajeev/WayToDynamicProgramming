package Simple;


/* Have the function CountingMinutesI(str) take the str parameter being passed 
which will be two times
* (each properly formatted with a colon and am or pm) separated by a 
hyphen and return the total number of minutes
* between the two times. The time will be in a 12 hour clock format.
* For example: if str is 9:00am-10:00am then the output should be 60.
* If str is 1:00pm-11:00am the output should be 1320.
*/

public class CoderByte_CountingMinutesOne {
    public static void main(String[] args) {
        System.out.println(countingMinutes("9:00am-10:00am")); // 60
        System.out.println(countingMinutes("1:00pm-11:00am")); // 1320
    }

    private static int countingMinutes(String str) {
        String[] times = str.split("-");
        int minutes1 = convertToMinutes(times[0]);
        int minutes2 = convertToMinutes(times[1]);
        
        int diff = minutes2 - minutes1;
        if (diff < 0) {
            diff += 1440; // Add 24 hours (1440 minutes) if the second time is on the next day
        }
        
        return diff;
    }

    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1].substring(0, 2));
        boolean isPM = parts[1].contains("pm");
        
        if (isPM && hours != 12) {
            hours += 12;
        } else if (!isPM && hours == 12) {
            hours -= 12;
        }
        
        return hours * 60 + minutes;
    }

}
