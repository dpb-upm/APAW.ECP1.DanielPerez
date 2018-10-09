package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateUtil {

    private DateUtil() {
        throw new IllegalStateException("Utility class");
    }

    static LocalDateTime getFormatedDate(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(fecha, formatter);
    }
}
