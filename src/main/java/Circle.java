import java.awt.*;

public class Circle {
    private int radius;
    private Point point;
    private Color color;
    private

    Circle(int rad,Point pnt,Color col){
        this.radius = rad;
        this.point = pnt;
        this.color = col;
    }
    public void circDraw(Graphics g){
        g.fillOval(50,50,30,30);
        g.setColor(Color.red);
    }

}
