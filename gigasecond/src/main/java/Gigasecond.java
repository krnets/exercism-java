import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    public LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        final long gigaSecond = (long) 1e9;

        return moment.plusSeconds(gigaSecond);
    }
}
