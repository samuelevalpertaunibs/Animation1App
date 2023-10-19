package it.unibs.pajc;

import javax.swing.*;
import java.awt.*;

public class PnlAnim extends JPanel {
    public static final int STEP_SIZE = 10;
    private int positionX;
    public PnlAnim() {
    }

    private boolean directionRight = true;
    public void stepNext() {
        if (positionX + 50 >= getWidth())
            directionRight = false;

        if (positionX <= 0)
            directionRight = true;

        if (directionRight)
            positionX += STEP_SIZE;
        else
            positionX -= STEP_SIZE;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(3f));
        g2.drawLine(0, h/2, w, h/2);

        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(1f));
        g2.fillRect(positionX, (h/2) - 20, 50, 20);
    }
}
