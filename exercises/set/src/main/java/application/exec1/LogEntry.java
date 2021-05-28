package application.exec;

import lombok.Data;

import java.util.Date;

@Data
public class LogEntry implements Comparable<LogEntry>{
    private final String name;
    private final Date dateEntry;

    @Override
    public int compareTo(LogEntry other) {
        return name.compareTo(other.name);
    }
}
