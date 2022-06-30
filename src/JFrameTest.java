import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import figures.*;

public class JFrameTest extends JFrame{

    JLabel label = new JLabel("Move your mouse to see the coordinates: ");

    public void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        TrafficLights aa = new TrafficLights();
        aa.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("X: " + e.getX() + ", Y: " + e.getY());
            }
        });

        frame.add(aa,BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        frame.setPreferredSize(new Dimension(800, 800));
        frame.setLocation(1115, 150);
        frame.pack();
        frame.setVisible(true);


    }

}
