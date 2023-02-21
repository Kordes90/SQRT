package ru.netology.sqr;

import org.junit.Assert;
import org.junit.Test;

public class SQRServiceTest {
    @Test
    public void testCalcSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 99);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
