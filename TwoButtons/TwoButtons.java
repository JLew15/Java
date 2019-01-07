import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons implements ActionListener{

  JButton redButton = null;
  JButton greenButton = null;
  JFrame myFrame = null;
  public void actionPerformed(ActionEvent event){
    Object control = event.getSource();

    if (control == redButton){
      myFrame.getContentPane().setBackground(Color.red);
    }
    else if (control == greenButton){
      myFrame.getContentPane().setBackground(Color.green);
    }
  }

public static void main(String[] args) {
  new TwoButtons();

}
 public TwoButtons(){
   myFrame = new JFrame();
   FlowLayout myLayout = new FlowLayout();
   myFrame.setLayout(myLayout);


   redButton = new JButton("Red");
   redButton.setEnabled(true);
   myFrame.add(redButton);


   greenButton = new JButton("Green");
   greenButton.setEnabled(true);
   myFrame.add(greenButton);


   myFrame.setTitle("Choose Your Color!");
   myFrame.setSize(400, 200);
   myFrame.setLocation(200, 300);
   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   myFrame.setVisible(true);

   greenButton.addActionListener(this);
   redButton.addActionListener(this);
}
}
