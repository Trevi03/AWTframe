import java.awt.*;

public class Drawing extends Canvas {
    private Circle c;
    private Rect r;
    Drawing(int radc,Point pntc,Color colc,int wr,int hr, Point pntr, Color colr){
        this.c = new Circle(radc,pntc,colc);
        this.r = new Rect(wr,hr,pntr,colr);
    }
    public void paint(Graphics g){
        c.circDraw(g);
        r.rectDraw(g);
    }
}