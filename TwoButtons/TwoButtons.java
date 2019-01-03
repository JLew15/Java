import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TwoButtons implements ActionListener{

public static void main(String[] args) {
  new TwoButtons();
}
 public TwoButtons(){
   JFrame myFrame = new JFrame();
   FlowLayout myLayout = new FlowLayout();
   myFrame.setLayout(myLayout);


   JButton redButton = new JButton("Red");
   redButton.setEnabled(true);
   myFrame.add(redButton);


   JButton greenButton = new JButton("Green");
   greenButton.setEnabled(true);
   myFrame.add(greenButton);


   myFrame.setTitle("Choose Your Color!");
   myFrame.setSize(400, 200);
   myFrame.setLocation(200, 300);
   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   myFrame.setVisible(true);
 }
}
