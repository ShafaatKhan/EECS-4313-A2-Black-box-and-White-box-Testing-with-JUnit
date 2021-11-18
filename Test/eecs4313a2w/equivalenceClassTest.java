package eecs4313a2w;

import net.sf.borg.common.DateUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class equivalenceClassTest {

    @Test
    public void testMinuteStringECT(){

        //weak normal robust testing

        // 0 <= minutes < 60
        assertEquals("43 Minutes", DateUtil.minuteString(43));

        // (60 <= minutes <= max) && (minutes % 60 > 0)
        assertEquals("2 Hours 23 Minutes", DateUtil.minuteString(143));

        // (60 <= minutes <= max) && (minutes % 60 = 0)
        assertEquals("3 Hours", DateUtil.minuteString(180));

        // -60 < minutes < 0
        assertEquals("-43 Minutes", DateUtil.minuteString(-43));

        // (-60 <= minutes <= min) %% (minutes % 60 < 0)
        assertEquals("-23 Minutes", DateUtil.minuteString(-143));

        // (-60 <= minutes <= min) && (minutes % 60 <= 0)
        assertEquals("0 Minutes", DateUtil.minuteString(-180));

        // minutes = 1
        assertEquals("1 Minute", DateUtil.minuteString(1));

        // minutes = 60
        assertEquals("1 Hour", DateUtil.minuteString(60));

        // minutes = 61
        assertEquals("1 Hour 1 Minute", DateUtil.minuteString(61));

        // minutes % 60 = 1
        assertEquals("3 Hours 1 Minute", DateUtil.minuteString(181));

        // 60 < minutes < 120
        assertEquals("1 Hour 3 Minutes", DateUtil.minuteString(63));
    }
}
