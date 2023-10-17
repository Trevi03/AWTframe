import java.awt.*;

public class Rect {
    private Color c;
    private Integer width;
    private Integer height;
    private Point point;

    Rect(int w,int h, Point pnt, Color col){
        this.width= w;
        this.height = h;
        this.point = pnt;
        this.c = col;
    }
    public void rectDraw(Graphics g){
        g.setColor(c);
        g.fillRect(point.x, point.y, width,height);
    }
}
