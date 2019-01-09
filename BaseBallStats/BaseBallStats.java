import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class BaseBallStats implements ActionListener{

  public void actionPerformed(ActionEvent event)
  {
    Object control = event.getSource();
    if (control == addPlayerButton)
    {
      Player tempPlayer = new Player();

      tempPlayer.numHits = new int[NUM_BATS];

      tempPlayer.name = playerNameField.getText();

      tempPlayer.numHits[0] = (Integer)gameOneHitsSpinner.getValue();
      tempPlayer.numHits[1] = (Integer)gameTwoHitsSpinner.getValue();
      tempPlayer.numHits[2] = (Integer)gameThreeHitsSpinner.getValue();
      tempPlayer.numHits[3] = (Integer)gameFourHitsSpinner.getValue();
      tempPlayer.numHits[4] = (Integer)gameFiveHitsSpinner.getValue();

      currentPlayersText.setText(currentPlayersText.getText() + tempPlayer.name + "\n");

      players.add(tempPlayer);

      clearFields();
    }
    else if (control == resetPlayerButton)
    {
      clearFields();
      currentPlayersText.setText("");
      players.clear();
    }
    else if (control == showPlayerButton)
    {
      String strMessage = "";
      for (Player player : players)
      {
        int totalHits = 0;
        strMessage += player.name + ": ";
        for (int i=0; i<NUM_BATS; i++)
        {
          totalHits += player.numHits[i];
        }
        int totalBats = NUM_BATS * NUM_GAMES;
        double battingAvg = (double)totalHits/(double)totalBats;
        DecimalFormat df = new DecimalFormat("0.000");
        strMessage += "Batting Avg: " + df.format(battingAvg) + "\n";
      }
      JOptionPane.showMessageDialog(null, strMessage);
    }
  }


  JTextField playerNameField = null;
  JSpinner gameOneHitsSpinner = null;
  JSpinner gameTwoHitsSpinner = null;
  JSpinner gameThreeHitsSpinner = null;
  JSpinner gameFourHitsSpinner = null;
  JSpinner gameFiveHitsSpinner = null;
  JTextArea currentPlayersText = null;
  JButton addPlayerButton = null;
  JButton resetPlayerButton = null;
  JButton showPlayerButton = null;
  ArrayList<Player> players;

  final int NUM_BATS = 5;

  final int NUM_GAMES = 5;

  public static void main(String[] args)
  {
    new BaseBallStats();
  }

  public BaseBallStats()
  {
    JFrame myFrame = new JFrame();
    myFrame.setTitle("Baseball Stats");
    myFrame.setLocation(300,300);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    players = new ArrayList<Player>();


    JPanel contentPane = (JPanel)myFrame.getContentPane();
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
    Border contentBorder = BorderFactory.createEmptyBorder(10,10,10,10);
    contentPane.setBorder(contentBorder);

    JPanel playerNamePanel = new JPanel();
    JLabel playerNameLabel = new JLabel("Player Name:");
    playerNameField = new JTextField(20);
    playerNamePanel.add(playerNameLabel);
    playerNamePanel.add(playerNameField);

    JPanel gameInningsPanel1 = new JPanel();
    JLabel gameOneHitsLabel = new JLabel("Game 1 Hits:");
    gameOneHitsSpinner = new JSpinner(new SpinnerNumberModel(1,0,5,1));
    gameInningsPanel1.add(gameOneHitsLabel);
    gameInningsPanel1.add(gameOneHitsSpinner);

    JPanel gameInningsPanel2 = new JPanel();
    JLabel gameTwoHitsLabel = new JLabel("Game 2 Hits:");
    gameTwoHitsSpinner = new JSpinner(new SpinnerNumberModel(1,0,5,1));
    gameInningsPanel2.add(gameTwoHitsLabel);
    gameInningsPanel2.add(gameTwoHitsSpinner);

    JPanel gameInningsPanel3 = new JPanel();
    JLabel gameThreeHitsLabel = new JLabel("Game 3 Hits:");
    gameThreeHitsSpinner = new JSpinner(new SpinnerNumberModel(1,0,5,1));
    gameInningsPanel3.add(gameThreeHitsLabel);
    gameInningsPanel3.add(gameThreeHitsSpinner);

    JPanel gameInningsPanel4 = new JPanel();
    JLabel gameFourHitsLabel = new JLabel("Game 4 Hits:");
    gameFourHitsSpinner = new JSpinner(new SpinnerNumberModel(1,0,5,1));
    gameInningsPanel4.add(gameFourHitsLabel);
    gameInningsPanel4.add(gameFourHitsSpinner);

    JPanel gameInningsPanel5 = new JPanel();
    JLabel gameFiveHitsLabel = new JLabel("Game 5 Hits:");
    gameFiveHitsSpinner = new JSpinner(new SpinnerNumberModel(1,0,5,1));
    gameInningsPanel5.add(gameFiveHitsLabel);
    gameInningsPanel5.add(gameFiveHitsSpinner);

    JPanel currentPlayersPanel = new JPanel();
    JLabel currentPlayersLabel = new JLabel("Current Players:");
    currentPlayersText = new JTextArea("", 5,20);
    currentPlayersText.setLineWrap(true);
    currentPlayersText.setEditable(false);
    JScrollPane currentPlayersScroll = new JScrollPane(currentPlayersText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    currentPlayersPanel.add(currentPlayersLabel);
    currentPlayersPanel.add(currentPlayersScroll);

    JPanel controlButtonsPanel = new JPanel();
    addPlayerButton = new JButton("Add Player");
    resetPlayerButton = new JButton("Reset Values");
    showPlayerButton = new JButton("Show Stats");
    controlButtonsPanel.add(addPlayerButton);
    controlButtonsPanel.add(resetPlayerButton);
    controlButtonsPanel.add(showPlayerButton);
    addPlayerButton.addActionListener(this);
    resetPlayerButton.addActionListener(this);
    showPlayerButton.addActionListener(this);




    contentPane.add(playerNamePanel);
    contentPane.add(gameInningsPanel1);
    contentPane.add(gameInningsPanel2);
    contentPane.add(gameInningsPanel3);
    contentPane.add(gameInningsPanel4);
    contentPane.add(gameInningsPanel5);
    contentPane.add(currentPlayersPanel);
    contentPane.add(controlButtonsPanel);
    myFrame.pack();
    myFrame.setVisible(true);
  }


public void clearFields()
{
  playerNameField.setText("");
  gameOneHitsSpinner.setValue(1);
  gameTwoHitsSpinner.setValue(1);
  gameThreeHitsSpinner.setValue(1);
  gameFourHitsSpinner.setValue(1);
  gameFiveHitsSpinner.setValue(1);
}
}
