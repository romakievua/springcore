package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;
import com.yet.spring.core.beans.EventType;

import java.util.Collection;

public class CombinedEventLogger implements EventLogger {
    private Collection loggers;

    public CombinedEventLogger(Collection loggers) {
        this.loggers = loggers;
    }

    public void logEvent(Event event) {
        if (event.getType() == EventType.INFO) {
            new ConsoleEventLogger().logEvent(event);
        } else if (event.getType() == EventType.ERROR) {
            new ConsoleEventLogger().logEvent(event);
            new FileEventLogger("log.txt").logEvent(event);
        } else {
            new CacheFileEventLogger("log.txt", 10);
        }
    }
}
