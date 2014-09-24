package com.epam.spring;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by Yauheni_Patotski.
 * Date: 9/24/2014
 * Time: 1:07 AM
 * e-mail: hathi.blr@gmail.com
 * Skype: hathi.blr
 */
public class TimerTaskJavaUtil extends TimerTask {
    public void run() {
        System.out.println("TimerTaskJavaUtil running at: "
                + new Date(this.scheduledExecutionTime()));
    }
}
