package ru.mirea.prac4;

import javax.swing.*;
import java.awt.*;
import java.nio.channels.Pipe;

public class FootballMatch extends JFrame {
    final String MADRID = "Real Madrid";
    final String MILAN = "AC Milan";
    final int END = 10;
    final Font TEXTFONT = new Font("TimesRoman", Font.ITALIC, 25);

    private int goalMadrid = 0;
    private int goalMilan = 0;
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    JLabel resultLabel = new JLabel("Result:" + goalMilan + " X " + goalMadrid);
    JLabel lastScorer = new JLabel("Last Scorer: ");
    JLabel winner = new JLabel("Winner: ");

    FootballMatch(){
        super("FootballExample");
        setLayout(new BorderLayout());
        setSize(1000,500);

        add(milanButton, BorderLayout.WEST);
        milanButton.setBackground(new Color(155, 220, 255));
        milanButton.setBorderPainted(false);

        add(madridButton, BorderLayout.EAST);
        madridButton.setBackground(new Color(155,220,255));
        madridButton.setBorderPainted(false);

        add(resultLabel, BorderLayout.NORTH);
        resultLabel.setFont(TEXTFONT);

        add(lastScorer, BorderLayout.CENTER);
        lastScorer.setFont(TEXTFONT);

        add(winner, BorderLayout.SOUTH);
        winner.setFont(TEXTFONT);

        milanButton.addActionListener((actionEvent) -> {
            goalMilan++;
            resultLabel.setText("Result:" + goalMilan + " X " + goalMadrid);
            lastScorer.setText("Last Scorer: " + MILAN);

            if(goalMilan == END){
                winner.setText("Winner: " + MILAN);
                madridButton.setEnabled(false);
                milanButton.setEnabled(false);
            }
        });

        madridButton.addActionListener((actionEvent) ->{
            goalMadrid++;
            resultLabel.setText("Result:" + goalMilan + " X " + goalMadrid);
            lastScorer.setText("Last Scorer: " + MADRID);
            if(goalMadrid == END) {
                winner.setText("Winner: " + MADRID);
                madridButton.setEnabled(false);
                milanButton.setEnabled(false);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}
