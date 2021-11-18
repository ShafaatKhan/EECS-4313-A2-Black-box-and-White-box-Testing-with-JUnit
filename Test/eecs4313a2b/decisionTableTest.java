package eecs4313a2b;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import net.sf.borg.common.DateUtil;
import java.util.Calendar;
import java.util.Date;

public class decisionTableTest {
    @Test
    public void testisAfter() {

        boolean bool;
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Date d1, d2;

        cal.set(2011, 7, 8);
        d1 = cal.getTime();
        cal2.set(1998, 5, 25);
        d2 = cal2.getTime();
        bool = DateUtil.isAfter(d1, d2);

        //assertTrue, as the value of d1 is after the value of d2, so it is true
        assertTrue("Date d1 is after Date d2", bool);

        cal.set(1998, 5, 25);
        d1 = cal.getTime();
        cal2.set(2011, 7, 8);
        d2 = cal2.getTime();
        bool = DateUtil.isAfter(d1, d2);

        // assertFalse, as the value of d1 is before the value of d2, so it is false
        assertFalse("Date d1 is before Date d2", bool);

        cal.set(1998, 5, 25);
        d1 = cal.getTime();
        cal2.set(1998, 5, 25);
        d2 = cal2.getTime();
        bool = DateUtil.isAfter(d1, d2);

        /*The reason for assertFalse is that, the function isAfter is just checking
          if the date of D1 occurs after the date of D2. In this case the dates are
          occurring on the same say and not not after, so it is false.*/
        assertFalse("Date d1 is equal to Date d2", bool);
    }
}
