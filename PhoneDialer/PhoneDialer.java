import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener
{

  //Locally declaring buttons and JFrame
  JFrame myFrame = null;
  JButton oneButton = null;
  JButton twoButton = null;
  JButton threeButton = null;
  JButton fourButton = null;
  JButton fiveButton = null;
  JButton sixButton = null;
  JButton sevenButton = null;
  JButton eightButton = null;
  JButton nineButton = null;
  JButton zeroButton = null;
  JButton dashButton = null;
  JButton dialNumberButton = null;

  //implementing ActionListener
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
      userNumber = userNumber + "9";
    }
    else if (control == zeroButton) {
      userNumber = userNumber + "0";
    }
    else if (control == dashButton) {
      userNumber = userNumber + "-";
    }
    else if (control == dialNumberButton) {
      JOptionPane.showMessageDialog(null, "Dialing Number: " + userNumber);
      userNumber = "";
    }
  }

  //Declaring empty String variable
 String userNumber = "";

 //Using constructor
  public static void main(String[] args) {
    new PhoneDialer();

  }

  //Constructor
  public PhoneDialer()
  {

  //Creating new JFrame
  myFrame = new JFrame();

  //Creating JPanel for JLabel
  JPanel labelPane = new JPanel();
  labelPane.setLayout(new FlowLayout());

  //Creating JPanel for number buttons
  JPanel numberPane = new JPanel();
  numberPane.setLayout(new GridLayout(4,3,5,5));
  Border numberBorder = BorderFactory.createEmptyBorder(5,5,5,5);
  numberPane.setBorder(numberBorder);

  //Creating JPanel for main content JPanel
  JPanel contentPane = (JPanel)myFrame.getContentPane();
  contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
  Border contentBorder = BorderFactory.createEmptyBorder(10,10,10,10);
  contentPane.setBorder(contentBorder);

  //Adding child JPanels
  contentPane.add(labelPane);
  contentPane.add(numberPane);

  //Creating JFrame window
  myFrame.setTitle("Dialer");
  myFrame.setSize(200, 250);
  myFrame.setLocation(200, 300);
  myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  myFrame.setVisible(true);

  //Creating number buttons
  oneButton = new JButton("1");
  twoButton = new JButton("2");
  threeButton = new JButton("3");
  fourButton = new JButton("4");
  fiveButton = new JButton("5");
  sixButton = new JButton("6");
  sevenButton = new JButton("7");
  eightButton = new JButton("8");
  nineButton = new JButton("9");
  zeroButton = new JButton("0");
  dashButton = new JButton("-");
  dialNumberButton = new JButton("Dial Number");

  //Alligning dialNumberButton
  dialNumberButton.setAlignmentX(Component.CENTER_ALIGNMENT);

  //Making JLabel
  JLabel descriptionLabel = new JLabel("Enter the number to dial:");

  //Adding ActionListener to number buttons
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


  //Adding numbers and label to JPanels
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
