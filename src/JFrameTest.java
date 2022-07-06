import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import figures.*;

public class JFrameTest extends JFrame{
    JLabel label = new JLabel("Move your mouse to see the coordinates: ");
    //SnowMan aa = new SnowMan();
    Car aa = new Car();

    public void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //TrafficLights aa = new TrafficLights();
        //Тут был снеговик
        aa.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("X: " + e.getX() + ", Y: " + e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                aa.getGraphics().fillArc(e.getX(),e.getY(),5,5,0,360);
            }
        });
        aa.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                SnowMan.x = e.getX();
                SnowMan.y = e.getY();
                System.out.println(SnowMan.x + " " + SnowMan.y);
                aa.getGraphics().fillArc(e.getX(),e.getY(),5,5,0,360);
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
