/*
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Meetup {

    LocalDate startOfMonth;

    public Meetup(int monthOfYear, int year) {
        startOfMonth = LocalDate.of(year, monthOfYear, 1);
    }

    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        LocalDate current = cycleNext(dayOfWeek, startOfMonth);

        switch (schedule) {
            case SECOND -> current = current.plusWeeks(1);
            case THIRD -> current = current.plusWeeks(2);
            case FOURTH -> current = current.plusWeeks(3);
            case TEENTH -> {
                while (current.getDayOfMonth() < 13)
                    current = current.plusWeeks(1);
            }
            case LAST -> current = cyclePrevious(dayOfWeek, startOfMonth.plusMonths(1).minusDays(1));
        }
        return current;
    }

    private LocalDate cycleNext(DayOfWeek dayOfWeek, LocalDate current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.plusDays(1);
        }
        return current;
    }

    private LocalDate cyclePrevious(DayOfWeek dayOfWeek, LocalDate current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.minusDays(1);
        }
        return current;
    }

}*/
