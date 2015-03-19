import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
    public Playback(){
        super("Playback");
        //Define frame attributes
        setLookAndFeel();
        setSize(225,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Define and setup component flow
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        
        //Create components
        //Buttons
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
                
        //Add components
        add(play);
        add(stop);
        add(pause);
        
        setVisible(true);
        
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc){
            //Ignore error
        }
    }
    
    public static void main(String[] arguments){
        Playback pb = new Playback();
    }
}