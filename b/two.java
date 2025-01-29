import java.awt.*;
 import java.awt.event.*;
 import java.util.Random;
 import javax.swing.*;

public class two extends JFrame {
    public JLabel label;
    private JButton button;
    private Random random = new Random();

    public two(){
        setTitle("GUI");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Click On the Button...");
        button = new JButton("Click");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("Clicked!!!");
                getContentPane().setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));

            }
        });

        add(label);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new two();
    }
}