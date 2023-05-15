import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class setColors extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.blue);//direct method
        g.drawString("bijay shah ",20,10);
        g.setColor(Color.red);//direct method
        g.drawString("bijay shah",20,20);
        Color obj=new Color(222,12,34);
        g.setColor(obj);
        g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        g.drawString("bijay shah called color by object",20,80);
    //  g.drawString("color details:"+ g.getColor(),20,120);//not working.....need to be solved in class
    }
    
}
