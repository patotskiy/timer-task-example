package com.epam;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Yauheni_Patotski.
 * Date: 9/24/2014
 * Time: 12:26 AM
 * e-mail: hathi.blr@gmail.com
 * Skype: hathi.blr
 */
public class TimeTaskExample extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:" + new Date());
        executeTask();
        System.out.println("Timer task finished at:" + new Date());
    }

    private void executeTask() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        TimerTask timerTask = new TimeTaskExample();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 2, 10000);
        System.out.println("TimerTask started...");
        Thread.sleep(120000);
        timer.cancel();
        System.out.println("TimerTask finished");
        Thread.sleep(30000);
    }
}
