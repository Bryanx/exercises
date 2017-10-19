package be.kdg.programmeertalen.logging;

import java.text.MessageFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/10/17 13:53
 */


public class SmallLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        String time = Instant.ofEpochMilli(record.getMillis()).atZone(ZoneId.systemDefault())
                .toLocalDateTime().toString().replace('T', ' ');
        String level = record.getLevel().toString();
        String message = MessageFormat.format(record.getMessage(), record.getParameters());
        return String.format("%s %s> %s\n", time, level, message);
    }
}


