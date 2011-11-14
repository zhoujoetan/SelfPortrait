package selfPortrait;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * @author Zhou Tan
 */
public class SelfPortrait extends JFrame {

    public static void main(String[] args) {
        new SelfPortrait().run();
    }

    private void run() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.drawString("Zhou Tan", 125, 280);
        g.setColor(new Color(251, 213, 133));
        g.fillOval(92, 145, 25, 18);   // my ears
        g.fillOval(90, 140, 25, 18);
        g.fillOval(175, 145, 25, 18);   // my ears
        g.fillOval(177, 140, 25, 18);
        g.fillOval(96, 92, 100, 125);  //my face
        g.setColor(Color.WHITE);
        g.fillOval(118, 135, 20, 13);
        g.fillOval(158, 135, 20, 13);
        g.setColor(Color.BLACK);
        g.fillOval(122, 135, 12, 12);
        g.fillOval(162, 135, 12, 12);
        g.setColor(Color.WHITE);
        g.fillOval(128, 137, 3, 3);
        g.fillOval(168, 137, 3, 3);
        g.setColor(Color.BLACK);
        g.drawArc(100, 135, 50, 40, 55, 70); // left eye
        g.drawArc(100, 97, 50, 50, -68, -40);
        g.drawArc(144, 135, 50, 40, 55, 70);
        g.drawArc(144, 97, 50, 50, -68, -40); // right eye
        for (int i = 0; i < 4; i++) {
            {
            g.drawArc(106, 124 + i, 40, 25, 55, 91);    //eye brows
            g.drawArc(147, 124 + i, 40, 25, 125, -91);
            }
        g.drawArc(45, 90, 100, 100, -30, 30);  //nose
        g.drawArc(46, 90, 100, 100, -30, 30);       
        g.drawArc(129, 130, 40, 40, -74, -40);
        g.drawArc(129, 131, 40, 40, -74, -40);
        g.drawLine(132, 183, 165, 183);       //upper lip
        g.drawLine(132, 184, 165, 184);
        g.drawArc(130, 150, 40, 40, -68, -50);  //bottom lip
        g.drawArc(130, 151, 40, 40, -68, -50);
        for (int j = 0; j <= 15; j++)
        {
            g.drawArc(95, 103 - j, 100, 125, 167, -154);
        }
        g.drawArc(93, 96, 80, 80, 30, 30);
        g.drawArc(92, 95, 80, 80, 30, 30);
        g.drawArc(91, 95, 80, 80, 30, 30);
        g.drawArc(90, 94, 80, 80, 30, 30);
        g.drawArc(89, 94, 80, 80, 30, 30);
        g.drawArc(88, 93, 80, 80, 30, 30);
        g.drawArc(87, 93, 80, 80, 30, 30);
        g.fillOval(143, 162, 4, 4);
        }
    }
}
