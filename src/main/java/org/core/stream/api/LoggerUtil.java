package org.core.stream.api;

public class LoggerUtil {
    public static String getMethodName() {
        return Thread.currentThread()
                .getStackTrace()[2]
                .getMethodName();
    }
}