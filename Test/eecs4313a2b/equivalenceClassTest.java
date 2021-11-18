package eecs4313a2b;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import net.sf.borg.common.DateUtil;

public class equivalenceClassTest {

    @Test
    public void testMinuteStringECT(){

        //weak normal robust testing

        // 0 <= minutes < 60
        assertEquals("43 Minutes", DateUtil.minuteString(43));

        // (60 <= minutes <= max) && (minutes % 60 > 0)
        assertEquals("2 Hours 23 Minutes", DateUtil.minuteString(143));

        // (60 <= minutes <= max) && (minutes % 60 == 0)
        assertEquals("3 Hours", DateUtil.minuteString(180));

        // -60 < minutes < 0
        assertEquals("-43 Minutes", DateUtil.minuteString(-43));

        // (-60 <= minutes <= min) %% (minutes % 60 < 0)
        assertEquals("-23 Minutes", DateUtil.minuteString(-143));

        // (-60 <= minutes <= min) && (minutes % 60 <= 0)
        assertEquals("0 Minutes", DateUtil.minuteString(-180));
    }
}
