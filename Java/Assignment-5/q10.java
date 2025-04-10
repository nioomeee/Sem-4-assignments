import java.applet.Applet;
import java.awt.*;

public class q10 extends Applet{
    @Override
    public void paint(Graphics g) {

        // body of the house
        g.setColor(Color.YELLOW);
        g.fillRect(120, 150, 150, 150);
        g.setColor(Color.CYAN);
        g.drawRect(120, 150, 150, 150);

        // triangle on top - roof of house
        g.setColor(Color.CYAN);
        int xPoints[] = {100, 195, 290};
        int yPoints[] = {150, 80, 150};

        g.fillPolygon(xPoints, yPoints, 3);

        // door
        

    }
}
