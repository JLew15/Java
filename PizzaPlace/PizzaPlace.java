import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.List;
@SuppressWarnings("unchecked")

public class PizzaPlace{
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
}
