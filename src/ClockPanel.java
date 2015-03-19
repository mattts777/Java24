//This creates a UI component. Needs ClockFrame class/app.

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ClockPanel extends JPanel {
    public ClockPanel() {
        super();
        String currentTime = getTime();
        JLabel time = new JLabel("Time: ");
        JLabel current = new JLabel(currentTime);
        add(time);
        add(current);
    }
    //Using "final" prevents the method from being overriden in a subclass.
    //This is required for ClockPanel to be a GUIComponent
    final String getTime(){
        String time;
        //get current time and date
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        
        String monthName = "";
        switch (month) {
            case(1):
                monthName = "January";
                break;
            case(2):
                monthName = "February";
                break;
            case(3):
                monthName = "March";
                break;
            case(4):
                monthName = "April";
                break;
            case(5):
                monthName = "May";
                break;    
            case(6):
                monthName = "June";
                break;    
                
        }
        time = monthName + " " + day + ", " + year + " "
                + hour + ":" + minute;
        return time;
    }
            
            
}            