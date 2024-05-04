package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeDiffCalculator {

    public static void main(String[] args) {
        String inputDateTime = "2024-05-02 15:00:00";
        LocalDateTime givenDateTime = LocalDateTime.parse(inputDateTime,
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime currentDateTime = LocalDateTime.now();

        calculateDateTimeDiff(givenDateTime, currentDateTime);
    }

    private static void calculateDateTimeDiff(LocalDateTime givenDateTime, LocalDateTime currentDateTime) {
        long minutesDifference = getTimeDiff(givenDateTime, currentDateTime, ChronoUnit.MINUTES);
        long hoursDifference = getTimeDiff(givenDateTime, currentDateTime, ChronoUnit.HOURS);
        long daysDifference = getTimeDiff(givenDateTime, currentDateTime, ChronoUnit.DAYS);

        printTimeDiff(minutesDifference, hoursDifference, daysDifference);
    }

    private static long getTimeDiff(LocalDateTime givenDateTime, LocalDateTime currentDateTime, ChronoUnit unit) {
        return unit.between(givenDateTime, currentDateTime);
    }

    private static void printTimeDiff(long minutesDifference, long hoursDifference, long daysDifference) {
        if (minutesDifference == 0) {
            System.out.println("1분전");
        } else if (minutesDifference < 60) {
            System.out.println(minutesDifference + "분전");
        } else if (hoursDifference < 24) {
            System.out.println(hoursDifference + "시간 전");
        } else {
            System.out.println(daysDifference + "일 전");
        }
    }
}
