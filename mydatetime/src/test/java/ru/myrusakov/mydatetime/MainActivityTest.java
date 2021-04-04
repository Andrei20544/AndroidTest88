package ru.myrusakov.mydatetime;

import junit.framework.TestCase;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class MainActivityTest extends TestCase {

//    private Instrumentation InstrumentationRegistry;
//    Context appContext = InstrumentationRegistry.getTargetContext();
    private String str;

    private void setTextView() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY HH:mm");
        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 10);

        str = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)) + "." +
                String.valueOf(calendar.get(Calendar.MONTH)) + "." +
                String.valueOf(calendar.get(Calendar.YEAR));
    }

    @Test
    public void test1() {
        setTextView();
        assertEquals("10.10.2018", str);
    }

}