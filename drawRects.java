import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class drawRects extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.RED);
       
        g.fillRect(20,20,100,80);
        g.drawOval(20,120,100,80);
        g.drawOval(20,220,100,100);
    }

}