package figures;

import java.awt.*;

import java.awt.geom.Path2D;


public class Car extends Canvas {

    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(9)); //Базовая толщина линий

        Path2D.Double zet = new Path2D.Double();
        Path2D.Double fara = new Path2D.Double();
        Path2D.Double korpus = new Path2D.Double();
        Path2D.Double okna = new Path2D.Double();
        Path2D.Double fin = new Path2D.Double();

        fin.moveTo(68, 572);
        fin.quadTo(68, 572,594, 379);
        fin.quadTo(594, 379,738, 574);
        fin.closePath();
        g2.setColor(Color.YELLOW);
        g2.fill(fin);

        korpus.moveTo(738,573); //Бампер
        korpus.curveTo(738,573,766,551,740,519);
        korpus.curveTo(740,519,735,405,591, 382);
        g2.setColor(Color.BLACK);
        g2.draw(korpus);
        g2.setColor(Color.YELLOW);
        g2.fill(korpus);

        korpus.moveTo(69,574); //Багажник
        korpus.curveTo(69,574,15,520,59,497);
        korpus.curveTo(60,492,58,418,100,381);
        korpus.curveTo(102,379,300,110,591, 382);
        g2.setColor(Color.BLACK);
        g2.draw(korpus);
        g2.setColor(Color.YELLOW);
        g2.fill(korpus);

        okna.moveTo(130,381); //Окно1
        okna.quadTo(130,381,308,381);
        okna.quadTo(308,381,308,282);
        okna.curveTo(308,282,205,291,130,381);
        okna.moveTo(330,282); //Окно2
        okna.quadTo(330,282,330,381);
        okna.quadTo(330,381,533,381);
        okna.curveTo(533,381,470,291,330,282);
        g2.setColor(Color.BLACK);
        g2.draw(okna);
        g2.setColor(Color.WHITE);
        g2.fill(okna);

        fara.moveTo(621,423); //Фара
        fara.curveTo(621,423,684,415,694,472);
        fara.curveTo(694,472,625,478,621,423);
        g2.setColor(Color.BLACK);
        g2.draw(fara);
        g2.setColor(Color.WHITE);
        g2.fill(fara);

        zet.moveTo(338,411); //Ручка двери
        zet.quadTo(338,411,370,411);
        g.setColor(Color.BLACK);
        g2.draw(zet);

        /////////////////////////////////////////////////////////////////////////
        g2.setStroke(new BasicStroke(10));
        g.drawArc(117,490,170,170,0,180); //Полукруг над колесом
        g.drawArc(475,490,170,170,0,180);

        g.setColor(Color.WHITE); //Заливка полукруга
        g.fillArc(117,490,170,170,0,180);
        g.fillArc(475,490,170,170,0,180);
        g.setColor(Color.BLACK);

        g2.setStroke(new BasicStroke(5));
        g.drawLine(287,575,475,575); //Дно машины
        g.drawLine(72,575,116,575);
        g.drawLine(644,575,735,575);

        g2.setStroke(new BasicStroke(40)); //Колеса
        g.drawArc(152,527,100,100,0,360);
        g.drawArc(510,527,100,100,0,360);

    }
}
