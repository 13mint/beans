package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class Timer {

    private final LocalTime time;
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public Timer() {
        this.time = LocalTime.now();
    }

    public String getTime() {
        return time.format(FORMATTER);
    }
}