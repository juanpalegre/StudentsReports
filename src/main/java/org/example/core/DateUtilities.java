package org.example.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Interface destined to determinate the date format and parse Date to String and vice versa
public interface DateUtilities {

    String DATE_PATTERN = "dd/mm/yyyy";
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

    static String getDateToString(Date date){
        return DATE_FORMAT.format(date);
    }

    static Date getStringToDate(String date) throws ParseException {
        return DATE_FORMAT.parse(date);
    }
}
