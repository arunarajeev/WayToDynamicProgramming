/* /**
 * Have the function CountingMinutes(str) take the str parameter being passed which will be two times (each properly
 * formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two
 * times. The time will be in a 12 hour clock format.
 * For example: if str is 9:00am-10:00am then the output should be 60.
 * If str is 1:00pm-11:00am the output should be 1320.
 *
 * @author Nick Livens
 */

package medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingMinutes {

    public static void main(String[] args) {
        System.out.println("Minutes = " + countingMinutes("9:00am-10:00am")); // 60
        System.out.println("Minutes = " + countingMinutes("1:00pm-11:00am")); // 1320
    }

    private static int countingMinutes(String str) {
        String timeArray[] = str.split("-");
        int startTime = convertToMinutes(timeArray[0]);
        int endTime = convertToMinutes(timeArray[1]);
        int diff = endTime - startTime;
        if (diff < 0) {
            diff += 1440; // Add 24 hours (1440 minutes) if the second time is on the next day
        }
        
        return diff;
    }

    private static int convertToMinutes(String timeStr) {
        String regex = "(\\d{1,2}):(\\d{1,2})(am|pm)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(timeStr);
        int hours = 0;
        int minutes = 0;
        String amPm = "";
        if (matcher.find()) {
            // Extract hours, minutes, and AM/PM
            hours = Integer.valueOf(matcher.group(1));
            minutes = Integer.valueOf(matcher.group(2));
            amPm = matcher.group(3);
            // System.out.println("Hours: " + hours);
            // System.out.println("Minutes: " + minutes);
            // System.out.println("AM/PM: " + amPm);
        }
        boolean isPM = amPm.equalsIgnoreCase("pm");
        if (isPM && hours != 12) {
            hours += 12;
        } else if (!isPM && hours == 12) {
            hours -= 12;
        }

        return hours * 60 + minutes;

    }

}
