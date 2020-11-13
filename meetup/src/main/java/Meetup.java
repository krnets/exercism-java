import java.time.DayOfWeek;
import java.time.LocalDate;

public class Meetup {

    private final LocalDate startOfMonth;

    public Meetup(int month, int year) {
        startOfMonth = LocalDate.of(year, month, 1);
    }

    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        var current = findNext(dayOfWeek, startOfMonth);

        switch (schedule) {
            case FIRST -> {}
            case SECOND -> current = current.plusWeeks(1);
            case THIRD -> current = current.plusWeeks(2);
            case FOURTH -> current = current.plusWeeks(3);
            case TEENTH -> {
                while (current.getDayOfMonth() < 13)
                    current = current.plusWeeks(1);
            }
            case LAST -> current = findLast(dayOfWeek, startOfMonth.plusMonths(1).minusDays(1));
        }
        return current;
    }

    private LocalDate findNext(DayOfWeek dayOfWeek, LocalDate current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.plusDays(1);
        }
        return current;
    }

    private LocalDate findLast(DayOfWeek dayOfWeek, LocalDate current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.minusDays(1);
        }
        return current;
    }
}