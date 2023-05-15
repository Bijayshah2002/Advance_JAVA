import java.applet.Applet;
import java.awt.Graphics;
public class drawLines extends Applet{
    public void paint(Graphics g){
        g.drawLine(20,20,100,20);
        g.drawLine(20,20,20,100);
        g.drawLine(20,20,100,100);
        g.drawLine(20,100,100,100);
       


    }

}