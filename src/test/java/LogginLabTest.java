import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5; //threshold

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 0; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }

    @org.junit.Test
    public void thresholdReached() {
        Integer theThreshold = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(theThreshold);

        // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.

        for (Integer i = 0; i <= theThreshold + 1; i++) {
            if (lab.thresholdReached(i) == false) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertFalse(lab.thresholdReached(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertTrue(lab.thresholdReached(i));
            }
        }
    }
}