import java.applet.*;
import java.awt.*;

public class textAreas extends Applet {
    // TextArea TA1 = new TextArea();
    // TextArea TA2 = new TextArea("bijay shah learning.");
    // TextArea TA3 = new TextArea(10,10);
    TextArea TA4 = new TextArea("bijay shah", 20, 15);// 3 types of constructor to call refence variable of class
                                                      // TextAra

    public void init() {
        // add(TA1);
        // add(TA2);
        // add(TA3);
        add(TA4);
    }

}
