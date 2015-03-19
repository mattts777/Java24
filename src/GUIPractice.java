import javax.swing.*;
import java.awt.*;

public class GUIPractice extends JFrame {
    public GUIPractice(){
        super("My GUI Test");
        //Define frame attributes
        setLookAndFeel();
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String URL = "Welcome";
        
        //Define and setup component flow
        //You must specify a layout manager before the components
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        
        //*** Create components
        //Buttons
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        
        //Labels
        JLabel pageLabel = new JLabel("Web Page Address: ", JLabel.RIGHT);
        JLabel updatedURL = new JLabel(URL,JLabel.CENTER);
        
        //Text Fields
        JTextField pageAddress = new JTextField("HTTP://www.google.com",20);
        
        //Check boxes
        //"true" sets the box to be checked by default
        JCheckBox cbPriorityShipping = new JCheckBox("Priority Shipping",true);
        JCheckBox FedEx = new JCheckBox("FedEx");
        JCheckBox UPS = new JCheckBox("UPS");
        
        //Button groups
        ButtonGroup Shipping = new ButtonGroup();
        
        //Combo boxes
        JComboBox profession = new JComboBox();
        //To allow a JComboBox to receive text input call setEditable:
        profession.setEditable(true);
        
        //Text areas - should be placed inside a container or they will expand on their own
        JTextArea commentfield = new JTextArea("Welcome to Disneyland!\n", 10,40);
        
        //Panels - good for aranging components and for drawing
        JPanel topRow = new JPanel();
        
        
        
        //** Add components
        //Buttons
        add(play);
        add(stop);
        add(pause);
                
        //Labels
        add(pageLabel);
        add(updatedURL);
        
        //Text Fields
        add(pageAddress);
        
        //Single Check boxes
        add(cbPriorityShipping);
        
        //Button groups
        Shipping.add(FedEx);
        Shipping.add(UPS);
        add(FedEx);
        add(UPS);
        
        //Combo boxes
        profession.addItem("QA Tester");
        profession.addItem("Developer");
        profession.addItem("Technial Writer");
        profession.addItem("Project Manager");
        add(profession);
        
        //Text areas - should be placed inside a container or they will expand on their own
        add(commentfield);
        
        //Panels
        add(topRow);
        
        
        
        
        setVisible(true);
        
        //Get the current text of the control
        String newURL = pageAddress.getText();
        
        //Set the text in the control
        pageAddress.setText("Testing 123");
        
        
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
        GUIPractice gp = new GUIPractice();
        
        
    }
}