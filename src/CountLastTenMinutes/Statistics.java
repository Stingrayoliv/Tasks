package CountLastTenMinutes;

import java.time.LocalDateTime;
import java.util.Objects;

public class Statistics {

    private String url;
    private LocalDateTime time;
    private int last10minutesMentions;

    public Statistics(String url, LocalDateTime time) {
        this.url = url;
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getLast10minutesMentions() {
        return last10minutesMentions;
    }

    public void setLast10minutesMentions(int last10minutesMentions) {
        this.last10minutesMentions = last10minutesMentions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistics that = (Statistics) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, time);
    }
}
