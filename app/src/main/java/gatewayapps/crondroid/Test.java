package gatewayapps.crondroid;

import android.util.Log;

import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by johnmurphy1 on 1/11/16.
 */
public class Test {
    String expression = "0 15 10 ? * *";
    CronExpression cronExpression;

    public Test() {
        try {
            cronExpression = new CronExpression(expression);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date TestCron()
    {
        try {
            cronExpression = new CronExpression(expression);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        final Date nextDate = cronExpression.getNextValidTimeAfter(new Date());
        final Date nextDate2 = cronExpression.getNextValidTimeAfter(nextDate);

        Log.i("TEST", nextDate.toString());
        Log.i("TEST",nextDate2.toString());

        return nextDate;
    }
}
