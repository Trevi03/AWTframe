import java.awt.*;

public class Circle {
    private int radius;
    private Point point;
    private Color color;

    Circle(int rad,Point pnt,Color col){
        this.radius = rad;
        this.point = pnt;
        this.color = col;
    }
    public void circDraw(Graphics g){
        g.setColor(color);
        g.fillOval(point.x,point.y,radius,radius);
    }

}
