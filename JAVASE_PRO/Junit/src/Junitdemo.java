import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    1元秒杀活动时间 2020年11月11日 0:0:0 - 2020年11月11日 0:10:0
    有两人下单时间 2020年11月11日 0:3:47 和 2020年11月11日0:10:11
 */

public class Junitdemo {
    public static void main(String[] args) throws ParseException {
        Time time = new Time();

        String people1 = "2023年4月3日 0:3:47";

        if(time.timeTrue(people1)){
            System.out.println("秒杀成功");
        }else {
            System.out.println("秒杀失败");
        }


    }
}


class Time {
    String startTime = "2023年4月3日 0:0:0";
    String endTime = "2023年4月3日 0:10:0";

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    public boolean timeTrue(String time) throws ParseException {
        Date date1 = sdf.parse(startTime);
        Date date2 = sdf.parse(endTime);

        Date date3 = sdf.parse(time);

        return date3.after(date1) && date3.before(date2);
    }
}