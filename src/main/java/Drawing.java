import java.awt.*;

public class Drawing extends Canvas {
    private Circle circle;
    Drawing(){

    }
    public void paint(Graphics g){
        g. setColor(Color.black);
        g.drawLine(0,0,100,100);
    }
}