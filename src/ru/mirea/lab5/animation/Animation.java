package ru.mirea.lab5.animation;

import javax.swing.*;
import java.io.IOException;


public class Animation extends JFrame {
    private static final String PATH = new String("D:\\repoJava\\ikbo-03-19\\src\\ru\\mirea\\lab5\\photos\\");
    private JLabel picture = new JLabel();
    private static int index;
    private static int delta;

    public static void init() throws IOException {
        delta = 1;
        index = 0;
    }

    public void run() throws InterruptedException {
        while(true){
            picture.setIcon(new ImageIcon(PATH +  index+".jpg"));
            Thread.sleep(100);
            index+= delta;
            if (index == 7 || index == 0)
                delta*= -1;
        }
    }

    Animation() throws IOException, InterruptedException {
        super("Danil");
        init();
        setSize(1200,1000);
        add(picture);
        setVisible(true);
        run();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new Animation();
    }
}
