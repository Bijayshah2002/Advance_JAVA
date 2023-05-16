import java.applet.*;
import java.awt.*;
public class checkboxs extends Applet {
    Checkbox C1 = new Checkbox("JAVA");
    Checkbox C2 = new Checkbox("PHP");
    Checkbox C3 = new Checkbox("C#");
    CheckboxGroup G1 = new CheckboxGroup();
    Checkbox z1 = new Checkbox("JAVA",G1,false);
    Checkbox z2 = new Checkbox("PHP",G1,false);
    Checkbox z3 = new Checkbox("C#",G1,true);// true and false are state of the checkbox set by the coder

    public void init(){
        add(C1);
        add(C2);
        add(C3);
        C3.setState(true);
        add(z1);
        add(z2);
        add(z3);


    }

    
}
