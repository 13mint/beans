package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public long getTime() {
        return nanoTime;
    }
}