package main.logger;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public final class Log {
    private Log () {}
    public static final LogManager logMgr = LogManager.getLogManager();
    public static final Logger LOGGER = logMgr.getLogger(Logger.GLOBAL_LOGGER_NAME);
}
