import java.applet.Applet;
import java.awt.Graphics;
public class drawPolygons extends Applet {
    public void paint(Graphics g){
        int x[]={20,60,100};
       int y[]={100,20,100};
       
       g.drawPolygon(x, y, 3);// need to be solved in the class

    }
}
