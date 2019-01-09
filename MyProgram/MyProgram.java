import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyProgram implements ActionListener
{
    public static void main(String[] args) {
      new MyProgram();
    }

    public MyProgram()
    {
      JFrame myFrame = new JFrame();
      myFrame.setLayout(new FlowLayout());
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JButton myButton = new JButton("Click Here");

      myButton.addActionListener(this);

      myFrame.add(myButton);
      myFrame.pack();
      myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
      JOptionPane.showMessageDialog(null,"Hey that tickles!");
    }
}
