package figures;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

public class SnowMan extends Canvas {

  public static int x,y;

    public void paint(Graphics g) {


        setBackground(Color.WHITE);
        setForeground(Color.BLACK);

        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(8));
        g2.drawArc(300,530,200,200,0,360);
        g.setColor(new Color(255,255,255));
        g.fillArc(300,530,200,200,0,360);

        g.setColor(new Color(0));
        g2.drawArc(310,400,170,170,0,360);
        g.setColor(new Color(255,255,255));
        g.fillArc(310,400,170,170,0,360);

        g.setColor(new Color(0));
        g2.setStroke(new BasicStroke(3));
        g2.drawArc(405,525,10,10,0,360);
        g2.drawArc(405,500,10,10,0,360);
        g2.drawArc(405,475,10,10,0,360);

        g2.setStroke(new BasicStroke(8));
        g2.drawArc(330,300,130,130,0,360);
        g.setColor(new Color(255,255,255));
        g.fillArc(330,300,130,130,0,360);

        g.setColor(new Color(0));

        g2.setStroke(new BasicStroke(8));
        g.drawPolygon(new int[]{325,329,225,208,199,212,186,185,212,196,202,225},
                new int[]{475,465,429,401,401,426,421,432,436,448,455,440}, 12);
        g.drawPolygon(new int[]{477,583-30,587-30,594-30,589-30,608-30,614-30,594-30,629-30,631-30,
                        588-30,479}, new int[]{455,414,391,393,412,391,398,415,410,417,421,464}, 12);

        g2.setStroke(new BasicStroke(1));
        g.setColor(new Color(255,255,255));
        g.fillPolygon(new int[]{325,329,225,208,199,212,186,185,212,196,202,225},
                new int[]{475,465,429,401,401,426,421,432,436,448,455,440}, 12);
        g.fillPolygon(new int[]{477,583-30,587-30,594-30,589-30,608-30,614-30,594-30,629-30,631-30,
                588-30,479}, new int[]{455,414,391,393,412,391,398,415,410,417,421,464}, 12);

        g.setColor(new Color(0));
        g2.setStroke(new BasicStroke(3));
        g.drawArc(371,343,10,10,0,360);
        g.drawArc(422,343,10,10,0,360);
        g.drawArc(366,398,10,10,0,360);
        g.drawArc(388,408,10,10,0,360);
        g.drawArc(406,408,10,10,0,360);
        g.drawArc(427,398,10,10,0,360);

        g2.setStroke(new BasicStroke(5));
        g.drawPolygon(new int[]{397,481,402}, new int[]{373,358,382},3);
        g2.setStroke(new BasicStroke(1));
        g.setColor(new Color(255,255,255));
        g.fillPolygon(new int[]{397,481,402}, new int[]{373,358,382},3);

        g.setColor(new Color(0));
        g2.setStroke(new BasicStroke(8));
        g.drawOval(305,300,180,30);
        g2.setStroke(new BasicStroke(1));
        g.setColor(new Color(255,255,255));
        g.fillOval(305,300,180,30);

        g.setColor(new Color(0));
        g2.setStroke(new BasicStroke(8));
        g.drawRoundRect(346,225,100,80,10,10);
        g2.setStroke(new BasicStroke(1));
        g.setColor(new Color(255,255,255));
        g.fillRoundRect(346,225,100,80,10,10);

        g.setColor(new Color(0));
        g2.setStroke(new BasicStroke(4));
        g.drawLine(345,281,447,281);


    }


}
