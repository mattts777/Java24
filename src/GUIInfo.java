import javax.swing.*;

public class GUIInfo extends JFrame {
    //A component is an individual element in a user interface.
    //A container is a component that you can use to hold other components.
    
    //Windows are simple containers that do not have a title bar or any of the other buttons
    //normally along the top edge of a GUI.
    
    //Frames are windows that include all the common windowing features such as buttons for
    //close, expand, and shrink.
    
    //Containers are created using Swing's JWindow and JFrame classes. To make Swing classes available,
    //use import.javax.swing.*;
    
    //The following commands can be used
    setTitle("My new Frame");
    setSize(350,125);
    setVisible(true);
    
    //The pack method sets the frame big enough to hold each component.
    pack();
    
    setDefaultCloseOperation(JFRAME.DISPOSE_ON_CLOSE);//Close the frame, but not the program
    setDefaultCloseOperation(JFRAME.EXIT_ON_CLOSE);//Exit the program
    setDefaultCloseOperation(JFRAME.DO_NOTHING_ON_CLOSE);//Keep the frame open and continue running
    setDefaultCloseOperation(JFRAME.HIDE_ON_CLOSE);//Close the frame and continue running
    
    //Nimbus themes initialization:
    UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
    
    );
    
    
    
    public static void main(String[] args){
        
        
        
    }
}

    
    

