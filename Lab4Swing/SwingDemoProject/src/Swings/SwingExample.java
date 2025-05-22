//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
//Programming in Blue color plain font with font size of 32 using Jframe and Jlabel
package Swings;
import java.awt.*;
import java.awt.Font;
//A simple Swing application.
import javax.swing.*;
class SwingExample {
SwingExample () {
//Create a new JFrame container.
JFrame jfrm = new JFrame("A Simple Swing Application");
//jfrm.setFont("Serif",Font.BOLD,18);
//label = new JLabel("A label"); label.setFont(new Font("Serif", Font.PLAIN, 14));
//Give the frame an initial size.
jfrm.setSize(275, 100);
//Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Create a text-based label.
JLabel jlab = new JLabel(" Hello! varun, Welcome to Swing Programming!");
// set properties for label
jlab.setFont(new Font("Verdana", Font.PLAIN,32));
jlab.setForeground(new Color(0,0,255));
//Add the label to the content pane.
jfrm.add(jlab);
//Display the frame.
jfrm.setVisible(true);
}
public static void main(String args[]) {
//Create the frame on the event dispatching thread.
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new SwingExample();
}
});
}
}