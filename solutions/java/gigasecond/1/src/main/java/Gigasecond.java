import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

class Gigasecond {

    private LocalDateTime mLocalDateTime = null;

    Gigasecond(LocalDate birthDate) {
        mLocalDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        mLocalDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        long cur = mLocalDateTime.toEpochSecond(ZoneOffset.UTC) + Double.valueOf(Math.pow(10, 9)).longValue();
        return LocalDateTime.ofEpochSecond(cur, 0, ZoneOffset.UTC);
    }
}