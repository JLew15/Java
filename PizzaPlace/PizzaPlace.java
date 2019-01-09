import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.List;
@SuppressWarnings("unchecked")

public class PizzaPlace implements ActionListener{
 JFrame myFrame = null;
 JTextField customerNameField = null;
 JRadioButton smallRadio = null;
 JRadioButton mediumRadio = null;
 JRadioButton largeRadio = null;
 JComboBox<String> pizzaCrustCombo = null;
 JList<String> pizzaToppingsList = null;
 List<String> toppings = null;
 JCheckBox breadSticksCheck = null;
 JCheckBox saladCheck = null;
 JCheckBox sodaCheck = null;
 JTextArea pizzaCommentsText = null;
 JButton placeOrderButton = null;
 JButton resetOrderButton = null;
 String sizeSelection = "";
 String extraSelection = "";

  public static void main(String[] args) {
    new PizzaPlace();
  }

  public PizzaPlace(){
    myFrame = new JFrame();
    myFrame.setTitle("Pizza Place");
    myFrame.setLocation(300, 300);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel customerNamePanel = new JPanel();
    JLabel customerNameLabel = new JLabel("Customer Name:");
    customerNameField = new JTextField(20);

    JPanel pizzaSizePanel = new JPanel();
    JLabel pizzaSizeLabel = new JLabel("Pizza Size:");
    smallRadio = new JRadioButton("Small");
    smallRadio.setSelected(true);
    mediumRadio = new JRadioButton("Medium");
    largeRadio = new JRadioButton("Large");
    ButtonGroup pizzaSizeGroup = new ButtonGroup();
    pizzaSizeGroup.add(smallRadio);
    pizzaSizeGroup.add(mediumRadio);
    pizzaSizeGroup.add(largeRadio);

    pizzaSizePanel.add(pizzaSizeLabel);
    pizzaSizePanel.add(smallRadio);
    pizzaSizePanel.add(mediumRadio);
    pizzaSizePanel.add(largeRadio);

    JPanel pizzaCrustPanel = new JPanel();
    JLabel pizzaCrustLabel = new JLabel("Crust Type:");


    pizzaCrustCombo = new JComboBox<String>();
    pizzaCrustCombo.addItem("Thin");
    pizzaCrustCombo.addItem("Thick");
    pizzaCrustCombo.addItem("Deep Dish");
    pizzaCrustCombo.setEditable(false);
    String pizzaCrust = (String)pizzaCrustCombo.getSelectedItem();

    JPanel pizzaToppingPanel = new JPanel();
    JLabel pizzaToppingLabel = new JLabel("Toppings:");

    String[] pizzaToppings = {"Pepperoni", "Sausage", "Green Peppers", "Onions", "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", "Olives", "Mushrooms"};
    pizzaToppingsList = new JList<String>(pizzaToppings);
    pizzaToppingsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JScrollPane pizzaToppingsScroll = new JScrollPane(pizzaToppingsList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    pizzaToppingPanel.add(pizzaToppingLabel);
    pizzaToppingPanel.add(pizzaToppingsScroll);
    toppings = pizzaToppingsList.getSelectedValuesList();

    JPanel pizzaExtrasPanel = new JPanel();
    JLabel pizzaExtrasLabel = new JLabel("Extras:");
    breadSticksCheck = new JCheckBox("Bread Sticks");
    saladCheck = new JCheckBox("Salad");
    sodaCheck = new JCheckBox("Soda");
    pizzaExtrasPanel.add(pizzaExtrasLabel);
    pizzaExtrasPanel.add(breadSticksCheck);
    pizzaExtrasPanel.add(saladCheck);
    pizzaExtrasPanel.add(sodaCheck);

    JPanel pizzaCommentsPanel = new JPanel();
    JLabel pizzaCommentsLabel = new JLabel("Order Comments:");
    pizzaCommentsText = new JTextArea(5, 20);
    pizzaCommentsText.setLineWrap(true);
    JScrollPane pizzaCommentsScroll = new JScrollPane(pizzaCommentsText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    pizzaCommentsPanel.add(pizzaCommentsLabel);
    pizzaCommentsPanel.add(pizzaCommentsScroll);

    JPanel pizzaOrderPanel = new JPanel();
    placeOrderButton = new JButton("Place Order");
    resetOrderButton = new JButton("Reset Values");
    pizzaOrderPanel.add(placeOrderButton);
    pizzaOrderPanel.add(resetOrderButton);

    placeOrderButton.addActionListener(this);
    resetOrderButton.addActionListener(this);
    smallRadio.addActionListener(this);
    mediumRadio.addActionListener(this);
    largeRadio.addActionListener(this);
    breadSticksCheck.addActionListener(this);
    saladCheck.addActionListener(this);
    sodaCheck.addActionListener(this);




    pizzaCrustPanel.add(pizzaCrustLabel);
    pizzaCrustPanel.add(pizzaCrustCombo);



    JPanel contentPane = (JPanel)myFrame.getContentPane();
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

    Border contentBorder = BorderFactory.createEmptyBorder(10,10,10,10);

    contentPane.setBorder(contentBorder);

    customerNamePanel.add(customerNameLabel);
    customerNamePanel.add(customerNameField);

    contentPane.add(customerNamePanel);
    contentPane.add(pizzaSizePanel);
    contentPane.add(pizzaCrustPanel);
    contentPane.add(pizzaToppingPanel);
    contentPane.add(pizzaExtrasPanel);
    contentPane.add(pizzaCommentsPanel);
    contentPane.add(pizzaOrderPanel);

    myFrame.setVisible(true);
    myFrame.pack();



    }
    public void actionPerformed(ActionEvent event){
      Object control = event.getSource();
      if(control == smallRadio){
        sizeSelection = "Small";
      }
      else if(control == mediumRadio){
        sizeSelection = "Medium";
      }
      else if(control == largeRadio){
        sizeSelection = "Large";
      }
      else if(control == saladCheck){
        extraSelection = extraSelection + " " + "Salad";
      }
      else if(control == breadSticksCheck){
        extraSelection = extraSelection + "Bread Sticks";
      }
      else if(control == sodaCheck){
        extraSelection = extraSelection + " " + "Soda";
      }

      else if(control == placeOrderButton){
        JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " + customerNameField.getText() + "\n" + "PIZZA SIZE: " + sizeSelection + "\n" + "CRUST TYPE: " + pizzaCrustCombo.getSelectedItem() + "\n" + "TOPPINGS: " + pizzaToppingsList.getSelectedValuesList() + "\n" + "EXTRAS: " + extraSelection + "\n" + "COMMENTS: " + pizzaCommentsText.getText());
      }
      else if(control == resetOrderButton){
        customerNameField.setText("");
        smallRadio.setSelected(true);
        pizzaCrustCombo.setSelectedIndex(0);
        pizzaToppingsList.clearSelection();
        breadSticksCheck.setSelected(false);
        saladCheck.setSelected(false);
        sodaCheck.setSelected(false);
        pizzaCommentsText.setText("");
        extraSelection = "";
      }

  }
}
