package eecs4313a2w;

import net.sf.borg.common.DateUtil;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class boundaryValueTest {

    @Test
    public void testMinuteStringBVT() {

        int min = 0;
        int minMinus = -1;
        int minPlus = min + 1;
        int max = Integer.MAX_VALUE;
        int nom = max / 2;
        int maxMinus = max - 1;

        //Boundary value analysis for the min value
        assertEquals("0 Minutes", DateUtil.minuteString(min));

        //Boundary value analysis for the minMinus value. 
        //Added this test case for white box testing 
        assertEquals("-1 Minutes", DateUtil.minuteString(minMinus));

        //Boundary value analysis for the min+ value
        assertEquals("1 Minute", DateUtil.minuteString(minPlus));

        //Boundary value analysis for the nominal value
        assertEquals("17895697 Hours 3 Minutes", DateUtil.minuteString(nom));

        //Boundary value analysis for the max- value
        assertEquals("35791394 Hours 6 Minutes", DateUtil.minuteString(maxMinus));

        //Boundary value analysis for the max value
        assertEquals("35791394 Hours 7 Minutes", DateUtil.minuteString(max));
    }
}