package it.unibs.pajc;

import javax.swing.*;
import java.awt.*;

public class Animation1App extends JFrame {


    private JPanel panelCommands;
    private JPanel MainPanel;
    private JButton buttonNextStep;

    public Animation1App() {
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        PnlAnim pnlAnim = new PnlAnim();

        buttonNextStep.addActionListener(e -> pnlAnim.stepNext());

        MainPanel.add(panelCommands, BorderLayout.SOUTH);
        MainPanel.add(pnlAnim, BorderLayout.CENTER);

        add(MainPanel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Animation1App frame = new Animation1App();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
