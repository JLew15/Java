import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer
{
  public static void main(String[] args) {

    String userNumber = null;

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
