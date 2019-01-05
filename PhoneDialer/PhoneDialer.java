import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener
{
  public void actionPerformed(ActionEvent event){
    Object control = event.getSource();
    if (control == oneButton){
      userNumber = userNumber + "1";
    }
    else if (control == twoButton) {
      userNumber = userNumber + "2";
    }
    else if (control == threeButton) {
      userNumber = userNumber + "3";
    }
    else if (control == fourButton) {
      userNumber = userNumber + "4";
    }
    else if (control == fiveButton) {
      userNumber = userNumber + "5";
    }
    else if (control == sixButton) {
      userNumber = userNumber + "6";
    }
    else if (control == sevenButton) {
      userNumber = userNumber + "7";
    }
    else if (control == eightButton) {
      userNumber = userNumber + "8";
    }
    else if (control == nineButton) {
      userNumber = "9";
    }
    else if (control == zeroButton) {
      userNumber = "0";
    }
    else if (control == dashButton) {
      userNumber = "-";
    }
    else if (control == dialNumberButton) {
      JOptionPane.showMessageDialog(null, "Dialing Number: " + userNumber);
    }
  }
String userNumber = null;
  public static void main(String[] args) {
    new PhoneDialer();

  }
  public PhoneDialer()
  {


  JFrame myFrame = new JFrame();

  JPanel labelPane = new JPanel();
  labelPane.setLayout(new FlowLayout());

  JPanel numberPane = new JPanel();
  numberPane.setLayout(new GridLayout(4,3,5,5));
  Border numberBorder = BorderFactory.createEmptyBorder(5,5,5,5);
  numberPane.setBorder(numberBorder);

  JPanel contentPane = (JPanel)myFrame.getContentPane();
  contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
  Border contentBorder = BorderFactory.createEmptyBorder(10,10,10,10);
  contentPane.setBorder(contentBorder);

  contentPane.add(labelPane);
  contentPane.add(numberPane);

  myFrame.setTitle("Dialer");
  myFrame.setSize(200, 250);
  myFrame.setLocation(200, 300);
  myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  myFrame.setVisible(true);

  JButton oneButton = new JButton("1");
  JButton twoButton = new JButton("2");
  JButton threeButton = new JButton("3");
  JButton fourButton = new JButton("4");
  JButton fiveButton = new JButton("5");
  JButton sixButton = new JButton("6");
  JButton sevenButton = new JButton("7");
  JButton eightButton = new JButton("8");
  JButton nineButton = new JButton("9");
  JButton zeroButton = new JButton("0");
  JButton dashButton = new JButton("-");
  JButton dialNumberButton = new JButton("Dial Number");

  dialNumberButton.setAlignmentX(Component.CENTER_ALIGNMENT);


  JLabel descriptionLabel = new JLabel("Enter the number to dial:");

  oneButton.addActionListener(this);
  twoButton.addActionListener(this);
  threeButton.addActionListener(this);
  fourButton.addActionListener(this);
  fiveButton.addActionListener(this);
  sixButton.addActionListener(this);
  sevenButton.addActionListener(this);
  eightButton.addActionListener(this);
  nineButton.addActionListener(this);
  zeroButton.addActionListener(this);
  dashButton.addActionListener(this);
  dialNumberButton.addActionListener(this);


  labelPane.add(descriptionLabel);
  numberPane.add(oneButton);
  numberPane.add(twoButton);
  numberPane.add(threeButton);
  numberPane.add(fourButton);
  numberPane.add(fiveButton);
  numberPane.add(sixButton);
  numberPane.add(sevenButton);
  numberPane.add(eightButton);
  numberPane.add(nineButton);
  numberPane.add(dashButton);
  numberPane.add(zeroButton);
  contentPane.add(dialNumberButton);
}

}
