import java.applet.*;
import java.awt.*;
public class buttons extends Applet {
  Button B1=new Button("submit");
  Button b2=new Button("Reset");
  TextField T1=new TextField("Bijay shah",20);// one method to make text field
  TextField T2=new TextField("another method");//another method to make text field
  TextField T3=new TextField();
    public void init(){
        add(B1);
        add(b2);
        T3.setText("another method");//another method to set placeholder in text field area
        T2.setEditable(false);
        add(T1);
        add(T2);
        add(T3);

    }
}
