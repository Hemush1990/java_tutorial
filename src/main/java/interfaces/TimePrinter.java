package interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.Instant;

public class TimePrinter implements ActionListener {
    public TimePrinter(int interval, java.awt.event.ActionListener listener) {
    }

    @Override
    public void ActionPerformed(ActionEvent event) {
        System.out.println("At the tone the time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
