package InnerClass;

import interfaces.TimePrinter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class Talkingclock {
    public static void main(String[] args) {
        TalkingClock1 clock = new TalkingClock1(1000, true);
        clock.start();

    }
}
/*
hello */

class TalkingClock1{
    private int interval;
    private boolean beep;

    public TalkingClock1(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
//        interfaces.ActionListener listener = new TimePrinter();
//        TimePrinter timer = new TimePrinter(interval, );

    }

    public class Timerprinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}