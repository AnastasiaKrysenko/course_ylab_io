package Lesson_2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RateLimitedPrinter extends TimerTask {
    public RateLimitedPrinter() {
    }

    public static void main(String[] args) {
        TimerTask timerTask = new RateLimitedPrinter();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0L, 1000);
        System.out.println("TimerTask начал выполнение");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException var5) {
            var5.printStackTrace();
        }

        timer.cancel();
        System.out.println("TimerTask прекращена");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

    }

    public void run() {
        System.out.println("TimerTask начал свое выполнение в:" + new Date());
        this.completeTask();
        System.out.println("TimerTask закончил свое выполнение в:" + new Date());
    }

    private void completeTask() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}