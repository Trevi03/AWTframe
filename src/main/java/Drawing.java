import java.awt.*;

public class Drawing extends Canvas {
    private Circle c;
    Drawing(int rad,Point pnt,Color col){
        this.c = new Circle(rad,pnt,col);
    }
    public void paint(Graphics g){
        c.circDraw(g);
    }
}