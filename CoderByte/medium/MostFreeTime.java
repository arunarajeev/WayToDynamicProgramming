//code still needs some work
package medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function MostFreeTime(strArr) read the strArr parameter being passed
 * which will represent a full day and
 * will be filled with events that span from time X to time Y in the day. The
 * format of each event will be
 * hh:mmAM/PM-hh:mmAM/PM. For example, strArr may be
 * ["10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"].
 * Your program will have to output the longest amount of free time available
 * between the start of your first event
 * and the end of your last event in the format: hh:mm. The start event should
 * be the earliest event in the day and
 * the latest event should be the latest event in the day. The output for the
 * previous input would therefore be 01:30
 * (with the earliest event in the day starting at 09:10AM and the latest event
 * ending at 02:45PM).
 * The input will contain at least 3 events and the events may be out of order.
 */
public class MostFreeTime {
    public static void main(String[] args) {
        String[] strArr = {"06:10AM-07:30AM","08:10AM-10:50AM" , "10:00AM-12:30PM", "02:00PM-02:45PM", "07:10AM-07:50AM" };
        System.out.println(mostFreeTime(strArr));
    }

    private static String mostFreeTime(String[] str) {

        int minArr[] = new int[1441];
        for (int i = 0; i < str.length; i++) {

            String timeArray[] = str[i].split("-");
            int startTimeInMins = convertToMinutes(timeArray[0].toLowerCase());
            int endTimeInMins = convertToMinutes(timeArray[1].toLowerCase());
            System.out.println(startTimeInMins);
            System.out.println(endTimeInMins);

           
            minArr[endTimeInMins]--;
            System.out.println("startTimeInMins = "+startTimeInMins+"  value = "+minArr[startTimeInMins]);
            System.out.println("endTimeInMins = "+endTimeInMins+"  value = "+minArr[endTimeInMins]);
            for(int j=startTimeInMins;j<endTimeInMins;j++){
                minArr[j]++;
            }
        }
        int max = 0;
        int start = 0;
        int end = Integer.MIN_VALUE;
        int diff = 0;
        int first = -1;
        for (int i = 0; i <= 1440; i++) {
            if (minArr[i] > 0) {
                first++;
            }
            if (minArr[i] <= -1) {
                end = i;
                System.out.println("end  "+end);
            }
            if (minArr[i] > 0 && first > 0) {
                start = i;
                diff = start - end;
              //  System.out.println("diff  "+diff);
            }
            if (diff > max)
                max = diff;
        }
        return (max / 60) + ":" + (max % 60);
    }

    private static int convertToMinutes(String time) {
        String regex = "(\\d{1,2}):(\\d{1,2})(am|pm)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        int hours = 0;
        int minutes = 0;
        String amPm = "";
        if (matcher.find()) {
            // Extract hours, minutes, and AM/PM
            hours = Integer.valueOf(matcher.group(1));
            minutes = Integer.valueOf(matcher.group(2));
            amPm = matcher.group(3);
        }
        boolean isPM = amPm.equalsIgnoreCase("pm");
        if (isPM && hours != 12) {
            hours += 12;
        } else if (!isPM && hours == 12) {
            hours -= 12;
        }
        minutes = hours * 60 + minutes;
        return minutes;
    }
}