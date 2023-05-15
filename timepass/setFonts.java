import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
public class setFonts extends Applet {
    public void paint(Graphics g){
        g.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));//direct method
        g.drawString("Bijay shah is learning setFont",10,10);
      g.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));//direct method
        g.drawString("Bijay shah is learning setFont",40,80);
           Font obj=new Font("TIMES NEW ROMAN",Font.BOLD,30);//making obj of the set font
           g.setFont(obj);
           g.drawString("Bijay shah is learning setFont",80,120);
        //g.drawString("font_details:"+g.getFont(),120,160);// not working.......net to be solved in the class
    }
    
}
