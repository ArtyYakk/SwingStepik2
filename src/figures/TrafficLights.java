package figures;

import java.awt.*;

public class TrafficLights extends Canvas {

    public void paint(Graphics g) {

         setBackground(Color.WHITE);
         //setForeground(Color.ORANGE);


        // Корпус
        g.setColor(new Color(50,50,50));
        //g.fillRect(325,120,150,460);
        g.fillRect(321,132,158,438);//Заполнение ширины
        g.fillRect(330,117,140,468);//Заполнение высоты
        g.fillArc(320,115, 34, 34,90,360);//upleft
        g.fillArc(320,553, 34, 34,180,360);//downleft
        g.fillArc(446,115, 34, 34,0,360);//upright
        g.fillArc(446,553, 34, 34,270,360);//downright

        // Ножка
        g.fillRoundRect(367,601,70,80, 18,18);

        // Белый козырек
        g.setColor(new Color(255,255,255));
        g.fillArc(335,125,130,130,0,360);
        g.fillArc(335,275,130,130,0,360);
        g.fillArc(335,425,130,130,0,360);

        g.setColor(new Color(50,50,50));
        g.fillArc(335,142,130,130,0,360);
        g.fillArc(335,292,130,130,0,360);
        g.fillArc(335,442,130,130,0,360);


        // Круги
        g.setColor(new Color(255,0,1));
        g.fillArc(350,150,100,100,0,360);
        g.setColor(new Color(255,250,0));
        g.fillArc(350,300,100,100,0,360);
        g.setColor(new Color(0,192,53));
        g.fillArc(350,450,100,100,0,360);

        // Треугольники слева
        g.setColor(new Color(50,50,50));
        g.fillPolygon(new int[]{215,291,305,305,294,221}, new int[]{168,228,220,159,150,150}, 6);
        g.fillArc(210,150,20,20,0,360);
        g.fillArc(286,211,20,20,0,360);
        g.fillArc(286,150,20,20,0,360);
        // --create(int x, int y, int width, int height)
        // --translate(int x, int y)
        //copyArea(int x, int y, int width, int height, int dx, int dy)
        g.copyArea(207,148,100,90,0,150);
        g.copyArea(207,148,100,90,0,300);

        // Треугольники справа
        // Корпус-козырек 16, ширина
        g.fillPolygon(new int[]{495,507,585,577,503,495}, new int[]{220,228,168,150,150,163}, 6);
        g.fillArc(478+16,150,20,20,0,360);
        g.fillArc(478+16,211,20,20,0,360);
        g.fillArc(478+16+76,150,20,20,0,360);
        g.copyArea(490,147,100,90,0,150);
        g.copyArea(490,147,100,90,0,300);

        // Арочка сверху
        g.fillArc(350, 94-18, 100, 36,0,180);

        g.fillArc(350, 101-15, 15, 15,0,360);
        g.fillArc(449-15, 101-15, 15, 15,0,360);
        g.fillRect(357,85,83,16);

    }
}
