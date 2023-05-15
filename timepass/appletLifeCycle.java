import java.applet.Applet;
import java.awt.Graphics;
public class appletLifeCycle extends Applet {
    int count=1;
    public void init(){
        System.out.println(" No of times init method called :"+ count++);
    }
    public void start(){
        System.out.println(" No of times start method called :"+ count++);
    }
    public void stop(){
        System.out.println(" No of times stop method called :"+ count++);
    }
    public void destroy(){
        System.out.println(" No of times destroy method called :"+ count++);
    }
    public void paint(Graphics g){
        System.out.println(" No of times paint method called :"+ count++);
        g.drawString("bijay shah drawn",20,30);
    }
    
    
}
