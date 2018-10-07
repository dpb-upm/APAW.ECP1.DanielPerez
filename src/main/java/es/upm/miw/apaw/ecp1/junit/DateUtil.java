package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateUtil {

    static LocalDateTime getFormatedDate(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(fecha, formatter);
        return localDateTime;
    }
}
