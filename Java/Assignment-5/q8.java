// Develop an applet that draws a circle. The dimension of the applet should be 500 x 500
// pixels. The circle should be centered in the applet. Display your name centered in a
// circle
import java.applet.Applet;
import java.awt.*;

public class q8 extends Applet {

    // main func for applet
    public void paint(Graphics g){
        g.setColor(Color.RED);
        
        int width = 500;
        int height = 500;

        int radius = 100;

        int centreX = width / 2;
        int centreY = height / 2;

        int topLeftX = centreX - radius;
        int topLeftY = centreY - radius;

        g.drawOval(topLeftX, topLeftY, 2*radius, 2 * radius);
        
        g.setColor(Color.PINK);
        g.drawString("Niomi", centreX-15, centreY+5);
    }
}
