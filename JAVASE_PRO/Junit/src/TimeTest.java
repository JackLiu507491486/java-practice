import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class TimeTest {
    Time time = new Time();

    public TimeTest() {
    }

    @Test
    public void timeTrue1() throws ParseException {
        if (this.time.timeTrue("2023年4月3日 0:3:47")) {
            System.out.printf("测试通过");
        } else {
            System.out.printf("测试失败");
        }

    }

    @Test
    public void timeTrue2() throws ParseException {
        if (!this.time.timeTrue("2023年4月3日 1:3:47")) {
            System.out.printf("测试通过");
        } else {
            System.out.printf("测试失败");
        }

    }

    @Test
    public void timeTrue3() throws ParseException {
        if (!this.time.timeTrue("XXXX年4月3日 1:3:XX")) {
            System.out.printf("测试通过");
        } else {
            System.out.printf("测试失败");
        }
    }

    @Test
    public void timeTrue4() throws ParseException {
        if (!this.time.timeTrue("1999年4月3日 1:3:89")) {
            System.out.printf("测试通过");
        } else {
            System.out.printf("测试失败");
        }
    }
}