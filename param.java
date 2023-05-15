import java.applet.Applet;
import java.awt.Graphics;
public class param extends Applet {

    public void paint(Graphics g){
        String name;
        name=this.getParameter("someone");
        g.drawString(name,20,30);
    }
}
