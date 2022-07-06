package figures;

import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Double;


public class Car extends Canvas {

    public void paint(Graphics g) {

        setForeground(new Color(0,0,0));
        setBackground(new Color(255,255,255));

        Graphics2D g2 = (Graphics2D)g;

        g2.setStroke(new BasicStroke(40));
        g.drawArc(152,527,100,100,0,360);
        g.drawArc(510,527,100,100,0,360);

        g2.setStroke(new BasicStroke(7));
        g.drawArc(117,490,170,170,0,180);
        g.drawArc(475,490,170,170,0,180);
        g.drawLine(287,575,475,575);
        g.drawLine(72,575,116,575);
        g.drawLine(644,575,735,575);

        //737 574
        //756 544
        //741 515

    }
}
