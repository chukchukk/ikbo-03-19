package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;

public class ThirdExample extends JFrame {
    private static JMenuBar menuBar;
    private static JMenu font;
    private static JMenu color;
    private static JMenuItem blueItem, redItem, blackItem, TNR, MS,CN;
    private static JTextArea jTextArea;
    final static Font TEXTFONT = new Font("Times New Roman", Font.TYPE1_FONT, 25);


    public static void createAll(){
        menuBar = new JMenuBar();
        font = new JMenu("Font");
        color = new JMenu("Color");

        blueItem = new JMenuItem("blue");
        blackItem = new JMenuItem("black");
        redItem = new JMenuItem("red");

        TNR = new JMenuItem("Times New Roman");
        MS = new JMenuItem("MS Sans Serif");
        CN = new JMenuItem("Courier New");

        menuBar.add(font);
        color.add(blueItem);
        color.add(blackItem);
        color.add(redItem);

        menuBar.add(color);
        font.add(TNR);
        font.add(MS);
        font.add(CN);

        jTextArea = new JTextArea();
        jTextArea.setFont(TEXTFONT);
    }

    public ThirdExample(){
        super("Example");
        createAll();

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, screenHeight/2);
        setLocationByPlatform(true);

        setLayout(new BorderLayout());
        add(jTextArea,BorderLayout.NORTH);

        setJMenuBar(menuBar);
        setVisible(true);

        blueItem.addActionListener((actionEvent) -> {
            jTextArea.setForeground(Color.BLUE);
        });

        blackItem.addActionListener((actionEvent) -> {
            jTextArea.setForeground(Color.BLACK);
        });

        redItem.addActionListener((actionEvent) -> {
            jTextArea.setForeground(Color.RED);
        });

        TNR.addActionListener((actionEvent) -> {
            jTextArea.setFont(new Font("Times New Roman", Font.TYPE1_FONT, 25));
        });

        CN.addActionListener((actionEvent) -> {
            jTextArea.setFont(new Font("Courier New",Font.TYPE1_FONT,25));
        });

        MS.addActionListener((actionEvent) -> {
            jTextArea.setFont(new Font(Font.SANS_SERIF,Font.TYPE1_FONT,25));
        });
    }

    public static void main(String[] args) {
        new ThirdExample();
    }
}
