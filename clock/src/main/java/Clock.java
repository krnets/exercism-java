public class Clock {

    private int totalMinutes;
    private final int hoursPerDay = 24;
    private final int minutesPerHour = 60;
    private final int minutesPerDay = hoursPerDay * minutesPerHour;

    public Clock(int hours, int minutes) {
        totalMinutes = (hours % hoursPerDay) * minutesPerHour + (minutes % minutesPerDay);

        int averageDaysInMonth = 30;
        if (hours < 0 || minutes < 0)
            totalMinutes += (minutesPerDay * averageDaysInMonth);
    }

    public void add(int minutes) {
        if (Math.abs(minutes) > minutesPerDay) {
            totalMinutes += (minutes % minutesPerDay);
        } else {
            totalMinutes += (minutes + minutesPerDay);
        }
    }

    @Override
    public String toString() {
        int hours = (totalMinutes / minutesPerHour) % hoursPerDay;
        int minutes = totalMinutes % minutesPerHour;

        return String.format("%02d:%02d", hours, minutes);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Clock)) {
            return false;
        }
        return obj.toString().equals(this.toString());
    }
}