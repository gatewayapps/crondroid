# crondroid
CronDroid is a partial implementation of Quartz Cron Java for Android. The focus of library at this time is to allow the use of the CronExpression object in order to receive a Date(or List<Date>) based on a provided cron expression string. Other class files are included but are not guaranteed to be functional.

Source origin: http://quartz-scheduler.org/

## Use - simple example
    // This will take a cron expression(run every day at 10:15am) and will return the next two occurrences and output them to the console Log.
    
    String expression = "0 15 10 ? * *";
    CronExpression cronExpression;
    try {
            cronExpression = new CronExpression(expression);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        final Date nextDate = cronExpression.getNextValidTimeAfter(new Date());
        final Date nextDate2 = cronExpression.getNextValidTimeAfter(nextDate);

        Log.i("TEST", nextDate.toString());
        Log.i("TEST",nextDate2.toString());
    }
    catch()
    {
    }


