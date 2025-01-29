import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class six extends JPanel {
    private int startX, startY;
    public six() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }
       });
         addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.drawLine(startX, startY, e.getX(), e.getY());
                startX = e.getX();
                startY = e.getY();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new six());
        frame.setVisible(true);
    }
}